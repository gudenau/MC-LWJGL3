package net.gudenau.lwjgl3.compatibility.opengl;

import net.gudenau.lwjgl3.compatibility.LWJGLException;
import net.gudenau.lwjgl3.compatibility.LWJGLUtil;
import org.lwjgl.PointerBuffer;

import static net.gudenau.lwjgl3.glfw.GLFWHelper.*;
import static org.lwjgl.glfw.GLFW.GLFW_FALSE;
import static org.lwjgl.glfw.GLFW.GLFW_TRUE;
import static org.lwjgl.glfw.GLFW.GLFW_RESIZABLE;
import static org.lwjgl.glfw.GLFW.GLFW_VISIBLE;
import static org.lwjgl.glfw.GLFW.GLFW_AUTO_ICONIFY;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryUtil.NULL;

/**
 * Created by gudenau on 5/30/2017.
 * <p>
 * LWJGL3
 */
public class DrawableGL implements DrawableLWJGL{
    protected PixelFormat pixel_format;
    protected PeerInfo peer_info;
    protected ContextGL context;

    protected DrawableGL(){
    }

    public void setPixelFormat(final PixelFormatLWJGL pf) throws LWJGLException{
        throw new UnsupportedOperationException();
    }

    public void setPixelFormat(final PixelFormatLWJGL pf, final ContextAttribs attribs) throws LWJGLException{
        this.pixel_format = (PixelFormat)pf;
        this.peer_info = null;
    }

    public PixelFormatLWJGL getPixelFormat(){
        return pixel_format;
    }

    @Override
    public Context getContext(){
        return context;
    }

    @Override
    public Context createSharedContext() throws LWJGLException{
        //TODO?
        synchronized(GlobalLock.lock){
            long oldWindow = context.getWindow();
            boolean current = context.isCurrent();
            if(current){
                context.releaseCurrent();
            }
            glfwDefaultWindowHints();
            glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
            long newWindow = glfwCreateWindow(1, 1, "SHAREDCONTEXT", NULL, oldWindow);
    
            /*if(current){
                context.makeCurrent();
            }*/
            
            return new ContextGL(newWindow);
        }
    }

    @Override
    public Context createSharedContext(int width, int height, String title, boolean resizable){
        return createSharedContext(width, height, title, resizable, NULL);
    }
    
    @Override
    public Context createSharedContext(int width, int height, String title, boolean resizable, long monitor){
        synchronized(GlobalLock.lock){
            long oldWindow = context.getWindow();
            glfwDefaultWindowHints();
            glfwWindowHint(GLFW_RESIZABLE, resizable ? GLFW_TRUE : GLFW_FALSE);
            glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
            glfwWindowHint(GLFW_AUTO_ICONIFY, GLFW_FALSE);
            long newWindow = glfwCreateWindow(width, height, title, monitor, oldWindow);
        
            return new ContextWindow(newWindow);
        }
    }
    
    public void checkGLError(){
        Util.checkGLError();
    }

    @Override
    public void setSwapInterval(int swap_interval){

    }

    @Override
    public void swapBuffers() throws LWJGLException{
    }

    /*public void setSwapInterval(final int swap_interval){
        ContextGL.setSwapInterval(swap_interval);
    }*/

    /*public void swapBuffers() throws LWJGLException{
        ContextGL.swapBuffers();
    }*/

    public void initContext(final float r, final float g, final float b){
        // set background clear color
        glClearColor(r, g, b, 0.0f);
        // Clear window to avoid the desktop "showing through"
        glClear(GL_COLOR_BUFFER_BIT);
    }

    public boolean isCurrent() throws LWJGLException{
        synchronized(GlobalLock.lock){
            checkDestroyed();
            return context.isCurrent();
        }
    }

    public void makeCurrent() throws LWJGLException{
        synchronized(GlobalLock.lock){
            checkDestroyed();
            context.makeCurrent();
        }
    }

    public void releaseContext() throws LWJGLException{
        synchronized(GlobalLock.lock){
            checkDestroyed();
            if(context.isCurrent()){
                context.releaseCurrent();
            }
        }
    }

    public void destroy(){
        synchronized(GlobalLock.lock){
            if(context == null){
                return;
            }

            try{
                releaseContext();

                //context.forceDestroy();
                context = null;

                if(peer_info != null){
                    peer_info.destroy();
                    peer_info = null;
                }
            }catch(LWJGLException e){
                LWJGLUtil.log("Exception occurred while destroying Drawable: " + e);
            }
        }
    }

    public void setCLSharingProperties(final PointerBuffer properties) throws LWJGLException{
        synchronized(GlobalLock.lock){
            checkDestroyed();
            //context.setCLSharingProperties(properties);
        }
    }

    protected final void checkDestroyed(){
        if(context == null){
            throw new IllegalStateException("The Drawable has no context available.");
        }
    }
}
