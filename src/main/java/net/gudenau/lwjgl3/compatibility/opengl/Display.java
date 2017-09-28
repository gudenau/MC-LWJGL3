package net.gudenau.lwjgl3.compatibility.opengl;

import net.gudenau.lwjgl3.compatibility.LWJGLException;
import net.gudenau.lwjgl3.compatibility.LWJGLUtil;
import net.gudenau.lwjgl3.compatibility.Sys;
import net.gudenau.lwjgl3.compatibility.input.Keyboard;
import net.gudenau.lwjgl3.compatibility.input.Mouse;
import static net.gudenau.lwjgl3.glfw.GLFWHelper.*;
import org.lwjgl.glfw.GLFWGammaRamp;
import org.lwjgl.glfw.GLFWImage;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.glfw.GLFWWindowSizeCallback;
import org.lwjgl.opengl.GL;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.lwjgl.glfw.GLFW.GLFW_RESIZABLE;
import static org.lwjgl.glfw.GLFW.GLFW_TRUE;
import static org.lwjgl.glfw.GLFW.GLFW_VISIBLE;
import static org.lwjgl.glfw.GLFW.GLFW_FOCUSED;
import static org.lwjgl.glfw.GLFW.GLFW_AUTO_ICONIFY;
import static org.lwjgl.glfw.GLFW.GLFW_FALSE;
import static org.lwjgl.glfw.GLFW.glfwWindowShouldClose;
import static org.lwjgl.glfw.GLFW.glfwSwapBuffers;
import static org.lwjgl.glfw.GLFW.glfwMakeContextCurrent;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryUtil.NULL;

/**
 * Created by gudenau on 5/30/2017.
 * <p>
 * LWJGL3
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public class Display{
    private static final Thread shutdown_hook = new Thread(Display::reset);
    private static final DisplayMode initial_mode;
    private static Canvas parent;
    private static DisplayMode current_mode;
    private static int x = -1;
    private static GLFWImage.Buffer cached_icons;
    private static int y = -1;
    private static int width = 0;
    private static int height = 0;
    private static String title = "Game";
    private static boolean fullscreen;
    private static int swap_interval;
    private static DrawableLWJGL drawable;
    private static boolean window_created;
    private static boolean parent_resized;
    private static boolean window_resized;
    private static boolean window_resizable;
    private static float r, g, b;

    private static final ComponentListener component_listener = new ComponentAdapter(){
        public void componentResized(ComponentEvent e){
            /*synchronized(GlobalLock.lock)*/{
                parent_resized = true;
            }
        }
    };
    private static long window;
    private static ByteBuffer[] cached_icon_data;
    @SuppressWarnings("FieldCanBeLocal") // Needs to have a strong reference, as I recall
    private static GLFWWindowSizeCallback sizeCallback;

    static{
        Sys.initialize();

        DisplayMode mode = new DisplayMode(640, 480, 24, 60);

        try{
            DisplayMode[] displayModes = getAvailableDisplayModes();

            int maxWidth = 0;
            int maxHeight = 0;
            for(DisplayMode displayMode : displayModes){
                if((long)displayMode.getHeight() * displayMode.getWidth() > (long)maxWidth * maxHeight){
                    maxWidth = displayMode.getWidth();
                    maxHeight = displayMode.getHeight();
                    mode = displayMode;
                }
            }
        }catch(LWJGLException ignored){}

        initial_mode = mode;
    }

    public static Drawable getDrawable(){
        return drawable;
    }

    private Display(){
    }

    public static DisplayMode[] getAvailableDisplayModes() throws LWJGLException{
        /*synchronized(GlobalLock.lock)*/{
            long primaryMonitor = glfwGetPrimaryMonitor();
            GLFWVidMode.Buffer videoModes = glfwGetVideoModes(primaryMonitor);

            List<DisplayMode> unfilteredModes = new ArrayList<>();
            for(int i = 0; i < videoModes.limit(); i++){
                GLFWVidMode mode = videoModes.get(i);
                unfilteredModes.add(new DisplayMode(
                    mode.width(),
                    mode.height(),
                    mode.redBits() + mode.blueBits() + mode.greenBits(),
                    mode.refreshRate()
                ));
            }

            if(unfilteredModes.isEmpty()){
                return new DisplayMode[0];
            }

            // We'll use a HashSet to filter out the duplicated modes
            HashSet<DisplayMode> modes = new HashSet<>(unfilteredModes.size());

            modes.addAll(unfilteredModes);
            DisplayMode[] filteredModes = new DisplayMode[modes.size()];
            modes.toArray(filteredModes);

            LWJGLUtil.log("Removed " + (unfilteredModes.size() - filteredModes.length) + " duplicate DisplayModes");

            return filteredModes;
        }
    }

    public static DisplayMode getDesktopDisplayMode(){
        return initial_mode;
    }

    public static DisplayMode getDisplayMode(){
        return current_mode;
    }

    public static void setDisplayMode(DisplayMode mode) throws LWJGLException{
        /*synchronized(GlobalLock.lock)*/{
            if(mode == null){
                throw new NullPointerException("mode must be non-null");
            }
            boolean was_fullscreen = isFullscreen();
            current_mode = mode;
            if(!isCreated() || parent != null){
                return;
            }
            destroyWindow();
            // If mode is not fullscreen capable, make sure we are in windowed mode
            try{
                if(!(was_fullscreen && !isFullscreen()) && isFullscreen()){
                    switchDisplayMode();
                }
                createWindow();
                makeCurrentAndSetSwapInterval();
            }catch(LWJGLException e){
                drawable.destroy();
                throw e;
            }
        }
    }

    private static DisplayMode getEffectiveMode(){
        return !isFullscreen() && parent != null ? new DisplayMode(parent.getWidth(), parent.getHeight()) : current_mode;
    }

    private static int getWindowX(){
        if(!isFullscreen() && parent == null){
            // if no display location set, center window
            if(x == -1){
                return Math.max(0, (initial_mode.getWidth() - current_mode.getWidth()) / 2);
            }else{
                return x;
            }
        }else{
            return 0;
        }
    }

    private static int getWindowY(){
        if(!isFullscreen() && parent == null){
            // if no display location set, center window
            if(y == -1){
                return Math.max(0, (initial_mode.getHeight() - current_mode.getHeight()) / 2);
            }else{
                return y;
            }
        }else{
            return 0;
        }
    }

    private static void createWindow() throws LWJGLException{
        if(window_created){
            return;
        }
        Canvas tmp_parent = isFullscreen() ? null : parent;
        if(tmp_parent != null && !tmp_parent.isDisplayable()) // Only a best effort check, since the parent can turn un-displayable hereafter
            throw new LWJGLException("Parent.isDisplayable() must be true");
        if(tmp_parent != null){
            tmp_parent.addComponentListener(component_listener);
        }
        DisplayMode mode = getEffectiveMode();

        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_AUTO_ICONIFY, GLFW_FALSE);
        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);
        glfwWindowHint(GLFW_VISIBLE, GLFW_TRUE);

        window = glfwCreateWindow(
            mode.getWidth(),
            mode.getHeight(),
            title == null ? "" : title,
            isFullscreen() ? glfwGetPrimaryMonitor() : NULL,
            NULL
        );

        window_created = true;

        width = Display.getDisplayMode().getWidth();
        height = Display.getDisplayMode().getHeight();

        setTitle(title);
        initControls();

        // set cached window icon if exists
        if(cached_icons != null){
            glfwSetWindowIcon(window, cached_icons);
        }else{
            setIcon(new ByteBuffer[]{LWJGLUtil.LWJGLIcon32x32, LWJGLUtil.LWJGLIcon16x16});
        }

        sizeCallback = GLFWWindowSizeCallback.create(Display::resizeCallback);
        glfwSetWindowSizeCallback(window, sizeCallback);
    }

    private static void resizeCallback(long window, int width, int height){
        if(window == Display.window){
            window_resized = true;
            Display.width = width;
            Display.height = height;
        }
    }

    private static void releaseDrawable(){
        try{
            Context context = drawable.getContext();
            if(context != null && context.isCurrent()){
                context.releaseCurrent();
                context.releaseDrawable();
            }
        }catch(LWJGLException e){
            LWJGLUtil.log("Exception occurred while trying to release context: " + e);
        }
    }

    private static void destroyWindow(){
        if(!window_created){
            return;
        }
        if(parent != null){
            parent.removeComponentListener(component_listener);
        }
        releaseDrawable();

        // Automatically destroyGLFW keyboard & mouse
        //TODO
        if(Mouse.isCreated()){
            Mouse.destroy();
        }
        if(Keyboard.isCreated()){
            Keyboard.destroy();
        }
        glfwDestroyWindow(window);
        window = NULL;
        window_created = false;
    }

    private static void switchDisplayMode() throws LWJGLException{
        if(!current_mode.isFullscreenCapable()){
            throw new IllegalStateException("Only modes acquired from getAvailableDisplayModes() can be used for fullscreen display");
        }
        //TODO
        //display_impl.switchDisplayMode(current_mode);
    }

    public static void setDisplayConfiguration(float gamma, float brightness, float contrast) throws LWJGLException{
        /*synchronized(GlobalLock.lock)*/{
            if(!isCreated()){
                throw new LWJGLException("Display not yet created.");
            }
            if(brightness < -1.0f || brightness > 1.0f)
                throw new IllegalArgumentException("Invalid brightness value");
            if(contrast < 0.0f)
                throw new IllegalArgumentException("Invalid contrast value");
            int rampSize = 256;

            try(MemoryStack stack = MemoryStack.stackPush()){
                ShortBuffer rampBuffer = stack.callocShort(256);

                for(int i = 0; i < rampSize; i++){
                    float intensity = (float)i / (rampSize - 1);
                    // apply gamma
                    float rampEntry = (float)java.lang.Math.pow(intensity, gamma);
                    // apply brightness
                    rampEntry += brightness;
                    // apply contrast
                    rampEntry = (rampEntry - 0.5f) * contrast + 0.5f;
                    // Clamp entry to [0, 1]
                    if(rampEntry > 1.0f)
                        rampEntry = 1.0f;
                    else if(rampEntry < 0.0f)
                        rampEntry = 0.0f;
                    rampBuffer.put(i, (short)(rampEntry * 0xFFFF));
                }
                GLFWGammaRamp gammaRamp = GLFWGammaRamp.callocStack(stack);
                gammaRamp.size(256);
                gammaRamp.red(rampBuffer);
                gammaRamp.green(rampBuffer);
                gammaRamp.blue(rampBuffer);
                glfwSetGammaRamp(glfwGetPrimaryMonitor(), gammaRamp);
            }
            LWJGLUtil.log("Gamma set, gamma = " + gamma + ", brightness = " + brightness + ", contrast = " + contrast);
        }
    }

    public static void sync(int fps){
        Sync.sync(fps);
    }

    public static String getTitle(){
        /*synchronized(GlobalLock.lock)*/{
            return title;
        }
    }

    public static Canvas getParent(){
        /*synchronized(GlobalLock.lock)*/{
            return parent;
        }
    }

    public static void setParent(Canvas parent) throws LWJGLException{
        /*synchronized(GlobalLock.lock)*/{
            if(Display.parent != parent){
                Display.parent = parent;
                if(!isCreated())
                    return;
                destroyWindow();
                resetWindow();
            }
        }
    }

    private static void resetWindow() throws LWJGLException{
        try{
            if(isFullscreen()){
                switchDisplayMode();
            }
            createWindow();
            makeCurrentAndSetSwapInterval();
        }catch(LWJGLException e){
            drawable.destroy();
            throw e;
        }
    }

    public static void setFullscreen(boolean fullscreen) throws LWJGLException{
        setDisplayModeAndFullscreenInternal(fullscreen, current_mode);
    }

    public static void setDisplayModeAndFullscreen(DisplayMode mode) throws LWJGLException{
        setDisplayModeAndFullscreenInternal(mode.isFullscreenCapable(), mode);
    }

    private static void setDisplayModeAndFullscreenInternal(boolean fullscreen, DisplayMode mode) throws LWJGLException{
        /*synchronized(GlobalLock.lock)*/{
            if(mode == null){
                throw new NullPointerException("mode must be non-null");
            }
            DisplayMode old_mode = current_mode;
            current_mode = mode;
            boolean was_fullscreen = isFullscreen();
            Display.fullscreen = fullscreen;
            if(was_fullscreen != isFullscreen() || !mode.equals(old_mode)){
                if(!isCreated()){
                    return;
                }
                destroyWindow();
                resetWindow();
            }
        }
    }

    public static boolean isFullscreen(){
        /*synchronized(GlobalLock.lock)*/{
            return fullscreen && current_mode.isFullscreenCapable();
        }
    }

    public static void setTitle(String newTitle){
        /*synchronized(GlobalLock.lock)*/{
            if(newTitle == null){
                newTitle = "";
            }
            title = newTitle;
            if(isCreated()){
                glfwSetWindowTitle(window, title);
            }
        }
    }

    public static boolean isCloseRequested(){
        /*synchronized(GlobalLock.lock)*/{
            if(!isCreated()){
                throw new IllegalStateException("Cannot determine close requested state of uncreated window");
            }
            return glfwWindowShouldClose(window);
        }
    }

    public static boolean isVisible(){
        /*synchronized(GlobalLock.lock)*/{
            if(!isCreated()){
                throw new IllegalStateException("Cannot determine minimized state of uncreated window");
            }
            return glfwGetWindowAttrib(window, GLFW_VISIBLE) == GLFW_TRUE;
        }
    }

    public static boolean isActive(){
        /*synchronized(GlobalLock.lock)*/{
            if(!isCreated()){
                throw new IllegalStateException("Cannot determine focused state of uncreated window");
            }
            return glfwGetWindowAttrib(window, GLFW_FOCUSED) == GLFW_TRUE;
        }
    }

    public static boolean isDirty(){
        /*synchronized(GlobalLock.lock)*/{
            if(!isCreated()){
                throw new IllegalStateException("Cannot determine dirty state of uncreated window");
            }
            //TODO
            return true;
        }
    }

    public static void processMessages(){
        /*synchronized(GlobalLock.lock)*/{
            if(!isCreated()){
                throw new IllegalStateException("Display not created");
            }

            //glfwPollEvents();
        }
        pollDevices();
    }

    public static void swapBuffers() throws LWJGLException{
        /*synchronized(GlobalLock.lock)*/{
            if(!isCreated()){
                throw new IllegalStateException("Display not created");
            }

            if(LWJGLUtil.DEBUG){
                drawable.checkGLError();
            }

            drawable.swapBuffers();
            glfwSwapBuffers(window);
        }
    }

    public static void update(){
//        System.out.printf("Update...\n");
        update(true);
    }

    public static void update(@SuppressWarnings("SameParameterValue") boolean processMessages){
        /*synchronized(GlobalLock.lock)*/{
            if(!isCreated())
                throw new IllegalStateException("Display not created");

            // We paint only when the window is visible or dirty
            if(isVisible() || isDirty()){
                try{
                    swapBuffers();
                }catch(LWJGLException e){
                    throw new RuntimeException(e);
                }
            }

            window_resized = !isFullscreen() && parent == null && wasResized();

            if(window_resized){
                width = getWidth();
                height = getHeight();
            }

            if(parent_resized){
                reshape();
                parent_resized = false;
                window_resized = true;
            }

            if(processMessages){
                processMessages();
            }
        }
    }

    static void pollDevices(){
        //TODO
        // Poll the input devices while we're here
        /*if(Mouse.isCreated()){
            Mouse.poll();
            Mouse.updateCursor();
        }

        if(Keyboard.isCreated()){
            Keyboard.poll();
        }

        if(Controllers.isCreated()){
            Controllers.poll();
        }*/
    }

    public static void releaseContext() throws LWJGLException{
        drawable.releaseContext();
    }

    public static boolean isCurrent() throws LWJGLException{
        return drawable.isCurrent();
    }

    public static void makeCurrent() throws LWJGLException{
        glfwMakeContextCurrent(window);
        GL.createCapabilities();
        GLContext.setCapabilities(new ContextCapabilities(false));
        drawable.makeCurrent();
        Mouse.setWindow(window);
        Keyboard.setWindow(window);
    }

    private static void removeShutdownHook(){
        AccessController.doPrivileged((PrivilegedAction<Object>)()->{
            Runtime.getRuntime().removeShutdownHook(shutdown_hook);
            return null;
        });
    }

    private static void registerShutdownHook(){
        AccessController.doPrivileged((PrivilegedAction<Object>)()->{
            Runtime.getRuntime().addShutdownHook(shutdown_hook);
            return null;
        });
    }

    public static void create() throws LWJGLException{
        create(new PixelFormat());
    }

    public static void create(PixelFormat pixel_format) throws LWJGLException{
        /*synchronized(GlobalLock.lock)*/{
            create(pixel_format, null, null);
        }
    }

    public static void create(PixelFormat pixel_format, Drawable shared_drawable) throws LWJGLException{
        /*synchronized(GlobalLock.lock)*/{
            create(pixel_format, shared_drawable, null);
        }
    }

    public static void create(PixelFormat pixel_format, ContextAttribs attribs) throws LWJGLException{
        /*synchronized(GlobalLock.lock)*/{
            create(pixel_format, null, attribs);
        }
    }

    public static void create(PixelFormat pixel_format, Drawable shared_drawable, ContextAttribs attribs) throws LWJGLException{
        /*synchronized(GlobalLock.lock)*/{
            if(isCreated())
                throw new IllegalStateException("Only one LWJGL context may be instantiated at any one time.");
            if(pixel_format == null)
                throw new NullPointerException("pixel_format cannot be null");
            removeShutdownHook();
            registerShutdownHook();
            if(isFullscreen())
                switchDisplayMode();

            final DrawableGL drawable = new DrawableGL(){
                public void destroy(){
                    /*synchronized(GlobalLock.lock)*/{
                        if(!isCreated())
                            return;

                        releaseDrawable();
                        super.destroy();
                        destroyWindow();
                        x = y = -1;
                        if(cached_icons != null){
                            cached_icons.free();
                        }
                        cached_icons = null;
                        reset();
                        removeShutdownHook();
                    }
                }
            };
            Display.drawable = drawable;

            drawable.setPixelFormat(pixel_format, attribs);
            try{
                createWindow();
                try{
                    //TODO?
                    drawable.context = new ContextGL(window);
                    //drawable.context = new ContextGL(drawable.peer_info, attribs, shared_drawable != null ? ((DrawableGL)shared_drawable).getContext() : null);
                    try{
                        makeCurrentAndSetSwapInterval();
                        initContext();
                    }catch(LWJGLException e){
                        drawable.destroy();
                        throw e;
                    }
                }catch(LWJGLException e){
                    destroyWindow();
                    throw e;
                }
            }catch(LWJGLException e){
                drawable.destroy();
                throw e;
            }
        }
    }

    public static void setInitialBackground(float red, float green, float blue){
        r = red;
        g = green;
        b = blue;
    }

    private static void makeCurrentAndSetSwapInterval() throws LWJGLException{
        makeCurrent();
        try{
            drawable.checkGLError();
        }catch(OpenGLException e){
            LWJGLUtil.log("OpenGL error during context creation: " + e.getMessage());
        }
        setSwapInterval(swap_interval);
    }

    private static void initContext(){
        drawable.initContext(r, g, b);
        update();
    }

    static boolean getPrivilegedBoolean(final String property_name){
        return AccessController.doPrivileged((PrivilegedAction<Boolean>)()->Boolean.getBoolean(property_name));
    }

    static String getPrivilegedString(final String property_name){
        return AccessController.doPrivileged((PrivilegedAction<String>)()->System.getProperty(property_name));
    }

    private static void initControls(){
        // Automatically create mouse, keyboard and controller
        if(!getPrivilegedBoolean("org.lwjgl.opengl.Display.noinput")){
            if(!Mouse.isCreated() && !getPrivilegedBoolean("org.lwjgl.opengl.Display.nomouse")){
                try{
                    Mouse.create();
                }catch(LWJGLException e){
                    if(LWJGLUtil.DEBUG){
                        e.printStackTrace(System.err);
                    }else{
                        LWJGLUtil.log("Failed to create Mouse: " + e);
                    }
                }
            }
            if(!Keyboard.isCreated() && !getPrivilegedBoolean("org.lwjgl.opengl.Display.nokeyboard")){
                try{
                    Keyboard.create();
                }catch(LWJGLException e){
                    if(LWJGLUtil.DEBUG){
                        e.printStackTrace(System.err);
                    }else{
                        LWJGLUtil.log("Failed to create Keyboard: " + e);
                    }
                }
            }
        }
    }

    public static void destroy(){
        if(isCreated()){
            drawable.destroy();
        }
    }

    private static void reset(){
        current_mode = initial_mode;
    }

    public static boolean isCreated(){
        /*synchronized(GlobalLock.lock)*/{
            return window_created;
        }
    }

    public static void setSwapInterval(int value){
        /*synchronized(GlobalLock.lock)*/{
            swap_interval = value;
            if(isCreated()){
                drawable.setSwapInterval(swap_interval);
            }

        }
    }

    public static void setVSyncEnabled(boolean sync){
        /*synchronized(GlobalLock.lock)*/{
            setSwapInterval(sync ? 1 : 0);
        }
    }

    public static void setLocation(int new_x, int new_y){
        /*synchronized(GlobalLock.lock)*/{
            // cache position
            x = new_x;
            y = new_y;

            // offset if already created
            if(isCreated() && !isFullscreen()){
                reshape();
            }
        }
    }

    private static void reshape(){
        DisplayMode mode = getEffectiveMode();
        glfwSetWindowSize(window, mode.getWidth(), mode.getHeight());
        glfwSetWindowPos(window, getWindowX(), getWindowY());
    }

    public static String getAdapter(){
        /*synchronized(GlobalLock.lock)*/{
            //FIXME Use GLFW if possible
            return glGetString(GL_RENDERER);
        }
    }

    public static String getVersion(){
        /*synchronized(GlobalLock.lock)*/{
            //FIXME Use GLFW id possible
            return glGetString(GL_VERSION);
        }
    }

    @SuppressWarnings("UnusedReturnValue")
    public static int setIcon(ByteBuffer[] icons){
        /*synchronized(GlobalLock.lock)*/{
            if(cached_icons != null){
                cached_icons.free();
                for(ByteBuffer buffer : cached_icon_data){
                    MemoryUtil.memFree(buffer);
                }
            }
            cached_icons = GLFWImage.calloc(icons.length);
            cached_icon_data = new ByteBuffer[icons.length];

            for(int i = 0; i < icons.length; i++){
                ByteBuffer iconBuffer = icons[i];
                GLFWImage icon = cached_icons.get(i);

                cached_icon_data[i] = MemoryUtil.memAlloc(iconBuffer.limit());
                byte[] tmp = new byte[iconBuffer.limit()];
                iconBuffer.get(tmp);
                iconBuffer.position(0);
                cached_icon_data[i].put(tmp);
                cached_icon_data[i].position(0);

                int size = (int)Math.sqrt(cached_icon_data[i].limit() >> 2);
                icon.set(size, size, cached_icon_data[i]);
            }

            if(Display.isCreated() && parent == null){
                glfwSetWindowIcon(window, cached_icons);
                return icons.length;
            }else{
                return 0;
            }
        }
    }

    public static void setResizable(boolean resizable){
        window_resizable = resizable;
        if(isCreated()){
            try(MemoryStack stack = MemoryStack.stackPush()){
                IntBuffer windowX = stack.callocInt(1);
                IntBuffer windowY = stack.callocInt(1);
                glfwGetWindowPos(window, windowX, windowY);

                IntBuffer windowWidth = stack.callocInt(1);
                IntBuffer windowHeight = stack.callocInt(1);
                glfwGetWindowSize(window, windowWidth, windowHeight);

                destroyWindow();
                createWindow();

                glfwSetWindowSize(window, windowWidth.get(0), windowHeight.get(0));
                glfwSetWindowPos(window, windowX.get(0), windowY.get(0));
            }catch(LWJGLException ignored){}
        }
    }

    public static boolean isResizable(){
        return window_resizable;
    }

    public static boolean wasResized(){
        return window_resized;
    }

    public static int getX(){
        if(Display.isFullscreen()){
            return 0;
        }

        if(parent != null){
            return parent.getX();
        }


        //noinspection Duplicates
        try(MemoryStack stack = MemoryStack.stackPush()){
            IntBuffer xBuffer = stack.callocInt(1);
            IntBuffer yBuffer = stack.callocInt(1);
            glfwGetWindowPos(window, xBuffer, yBuffer);
            return xBuffer.get(0);
        }
    }

    public static int getY(){
        if(Display.isFullscreen()){
            return 0;
        }

        if(parent != null){
            return parent.getY();
        }

        //noinspection Duplicates
        try(MemoryStack stack = MemoryStack.stackPush()){
            IntBuffer xBuffer = stack.callocInt(1);
            IntBuffer yBuffer = stack.callocInt(1);
            glfwGetWindowPos(window, xBuffer, yBuffer);
            return yBuffer.get(0);
        }
    }

    public static int getWidth(){
        if(Display.isFullscreen()){
            return Display.getDisplayMode().getWidth();
        }

        if(parent != null){
            return parent.getWidth();
        }

        return width;
    }

    public static int getHeight(){
        if(Display.isFullscreen()){
            return Display.getDisplayMode().getHeight();
        }

        if(parent != null){
            return parent.getHeight();
        }

        return height;
    }

    //TODO
    public static float getPixelScaleFactor(){
        return 1;
    }

    public static long getWindow(){
        return window;
    }
}
