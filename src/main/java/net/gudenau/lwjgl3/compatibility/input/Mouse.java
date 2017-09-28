package net.gudenau.lwjgl3.compatibility.input;

import net.gudenau.lwjgl3.compatibility.LWJGLException;
import net.gudenau.lwjgl3.compatibility.opengl.Display;
import net.gudenau.lwjgl3.glfw.GLFWHelper;
import org.lwjgl.glfw.GLFWCursorEnterCallback;
import org.lwjgl.glfw.GLFWCursorPosCallback;
import org.lwjgl.glfw.GLFWMouseButtonCallback;
import org.lwjgl.glfw.GLFWScrollCallback;
import org.lwjgl.system.MemoryStack;

import java.nio.DoubleBuffer;
import java.util.*;

import static net.gudenau.lwjgl3.compatibility.LWJGLUtil.getPrivilegedBoolean;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.system.MemoryUtil.NULL;

/**
 * Created by gudenau on 5/31/2017.
 * <p>
 * LWJGL3
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public class Mouse{
    private static long window = NULL;
    private static GLFWMouseButtonCallback mouseButtonCallback;
    private static GLFWCursorPosCallback cursorPosCallback;
    private static GLFWScrollCallback scrollCallback;
    private static GLFWCursorEnterCallback cursorEnterCallback;
    private static final Object eventQueue$lock = new Object[0];
    private static final Queue<MouseEvent> eventQueue = new LinkedList<>();
    private static boolean isInsideWindow;
    private static String[] buttonNames;
    private static Map<String, Integer> buttonMap;
    private static  boolean clipMouseCoordinatesToWindow = !getPrivilegedBoolean("org.lwjgl.input.Mouse.allowNegativeMouseCoords");
    private static MouseEvent latestEvent;
    private static MouseEvent oldEvent;
    private static int oldX;
    private static int oldY;

    static{
        buttonNames = new String[16];
        buttonMap = new HashMap<>(buttonNames.length);
        for(int i = 0; i < buttonNames.length; i++){
            buttonNames[i] = "BUTTON" + i;
            buttonMap.put(buttonNames[i], i);
        }
    }

    public static void setWindow(long window){
        if(Mouse.window != NULL){
            GLFWHelper.glfwSetMouseButtonCallback(window, null);
            GLFWHelper.glfwSetCursorPosCallback(window, null);
            GLFWHelper.glfwSetScrollCallback(window, null);
            GLFWHelper.glfwSetCursorEnterCallback(window, null);
        }

        Mouse.window = window;

        if(window != NULL){
            GLFWHelper.glfwSetMouseButtonCallback(window, mouseButtonCallback);
            GLFWHelper.glfwSetCursorPosCallback(window, cursorPosCallback);
            GLFWHelper.glfwSetScrollCallback(window, scrollCallback);
            GLFWHelper.glfwSetCursorEnterCallback(window, cursorEnterCallback);
        }
    }

    private static void queueEvent(MouseEvent mouseEvent){
        synchronized(eventQueue$lock){
            eventQueue.add(mouseEvent);
        }
    }

    private static void mouseButtonCallback(long window, int button, int action, int mods){
        if(window != Mouse.window){
            return;
        }

        queueEvent(new MouseEvent(button, action));
    }

    private static void cursorPosCallback(long window, double x, double y){
        if(window != Mouse.window){
            return;
        }

        y = Display.getHeight() - y - 1;

        queueEvent(new MouseEvent(x, y, Display.getWidth(), Display.getHeight()));

        if(isGrabbed()){
            GLFWHelper.glfwSetCursorPos(window, Display.getWidth() / 2D, Display.getHeight() / 2D);
            deltaX += x - (Display.getWidth() / 2D);
            deltaY += y - (Display.getHeight() / 2D) + 1;
        }else{
            deltaX += x;
            deltaY += y;
        }
    }

    private static void scrollCallback(long window, @SuppressWarnings("unused") double xoffset, double yoffset){
        if(window != Mouse.window){
            return;
        }

        queueEvent(new MouseEvent(yoffset));
    }

    private static void cursorEnterCallback(long window, boolean entered){
        if(window != Mouse.window){
            return;
        }

        isInsideWindow = entered;
    }

    private static class MouseEvent{
        private final int button;
        private final int action;
        private final double x;
        private final double y;
        private final double z;
        private final int width;
        private final int height;
        private long time = System.nanoTime();

        private static double lastX = 0;
        private static double lastY = 0;

        MouseEvent(int button, int action){
            this.button = button;
            this.action = action;
            x = lastX;
            y = lastY;
            z = 0;
            width = 0;
            height = 0;
        }

        MouseEvent(double x, double y, int width, int height){
            lastX = x;
            lastY = y;
            button = -1;
            action = 0;
            this.x = x;
            this.y = y;
            z = 0;
            this.width = width;
            this.height = height;
        }

        MouseEvent(double yoffset){
            button = -1;
            action = 0;
            x = 0;
            y = 0;
            z = yoffset;
            width = 0;
            height = 0;
        }

        int getButton(){
            return button;
        }

        int getAction(){
            return action;
        }

        double getX(){
            return x;
        }

        double getY(){
            return y;
        }

        double getZ(){
            return z;
        }

        long getTime(){
            return time;
        }

        public double getDeltaX(){
            return x - width / 2;
        }

        public double getDeltaY(){
            return y - height / 2;
        }
    }








    // ~~~~~~~~~~~~~~~~ LWJGL stuff starts here ~~~~~~~~~~~~~~~~








    //TODO
    //public static Cursor getNativeCursor()

    //TODO
    //public static Cursor setNativeCursor(Cursor cursor) throws LWJGLException

    public static boolean isClipMouseCoordinatesToWindow() {
        return clipMouseCoordinatesToWindow;
    }

    public static void setClipMouseCoordinatesToWindow(boolean clip) {
        clipMouseCoordinatesToWindow = clip;
    }

    public static void setCursorPosition(int new_x, int new_y) {
        if(window != NULL){
            GLFWHelper.glfwSetCursorPos(window, new_x, new_y);
        }
    }

    public static void create() throws LWJGLException{
        mouseButtonCallback = GLFWMouseButtonCallback.create(Mouse::mouseButtonCallback);
        cursorPosCallback = GLFWCursorPosCallback.create(Mouse::cursorPosCallback);
        scrollCallback = GLFWScrollCallback.create(Mouse::scrollCallback);
        cursorEnterCallback = GLFWCursorEnterCallback.create(Mouse::cursorEnterCallback);
    }

    public static boolean isCreated() {
        return mouseButtonCallback != null;
    }

    public static void destroy() {
        mouseButtonCallback.free();
        cursorPosCallback.free();
        scrollCallback.free();
        cursorEnterCallback.free();

        mouseButtonCallback = null;
        cursorPosCallback = null;
        scrollCallback = null;
        cursorEnterCallback = null;
    }

    public static void poll(){
        synchronized(eventQueue$lock){
            oldEvent = latestEvent;
            if(eventQueue.isEmpty()){
                latestEvent = null;
            }else{
                //noinspection unchecked
                latestEvent = ((List<MouseEvent>)eventQueue).get(eventQueue.size() - 1);
                eventQueue.clear();
            }
        }
    }

    public static boolean isButtonDown(int button){
        return window != NULL && GLFWHelper.glfwGetMouseButton(window, button) == GLFW_PRESS;
    }

    public static String getButtonName(int button) {
        if(button >= buttonNames.length || button < 0){
            return null;
        }else{
            return buttonNames[button];
        }
    }

    public static int getButtonIndex(String buttonName) {
        Integer index = buttonMap.get(buttonName);
        return index == null ? -1 : index;
    }

    public static boolean next(){
        synchronized(eventQueue$lock){
            oldEvent = latestEvent;

            //noinspection Duplicates
            if(eventQueue.isEmpty()){
                latestEvent = null;
                return false;
            }else{
                latestEvent = eventQueue.remove();
                return true;
            }
        }
    }

    public static int getEventButton(){
        return latestEvent == null ? -1 : latestEvent.getButton();
    }

    public static boolean getEventButtonState(){
        return latestEvent != null && latestEvent.getAction() == GLFW_PRESS;
    }

    public static int getEventDX(){
//        if(latestEvent == oldEvent){
//            return 0;
//        }
//
//        if(oldEvent == null || latestEvent == null){
//            return getEventX();
//        }
//
//        return (int)(latestEvent.getX() - oldEvent.getX());

        return (int)latestEvent.getDeltaX();
    }

    public static int getEventDY(){
//        if(latestEvent == oldEvent){
//            return 0;
//        }
//
//        if(oldEvent == null || latestEvent == null){
//            return getEventY();
//        }
//
//        return (int)(latestEvent.getY() - oldEvent.getY());
        return (int)latestEvent.getDeltaY();
    }

    public static int getEventX(){
        return latestEvent == null ? 0 : (int)latestEvent.getX();
    }

    public static int getEventY(){
        return latestEvent == null ? 0 : (int)latestEvent.getY();
    }

    public static int getEventDWheel(){
        return latestEvent == null ? 0 : (int)latestEvent.getZ();
    }

    public static long getEventNanoseconds(){
        return latestEvent == null ? 0 : latestEvent.getTime();
    }

    private static double mouseY;
    public static int getX(){
        if(window == NULL){
            return 0;
        }

        try(MemoryStack stack = MemoryStack.stackPush()){
            DoubleBuffer xBuffer = stack.callocDouble(1);
            DoubleBuffer yBuffer = stack.callocDouble(2);
    
            GLFWHelper.glfwGetCursorPos(window, xBuffer, yBuffer);
            mouseY = yBuffer.get(0);

            return Math.max(0, Math.min(Display.getWidth() - 1, (int)xBuffer.get(0)));
        }
    }

    public static int getY(){
        if(window == NULL){
            return 0;
        }

        return Display.getHeight() - 1 - Math.max(0, Math.min(Display.getHeight() - 1, (int)mouseY));
    }

    private static int deltaX = 0;
    public static int getDX(){
        int x = deltaX;
        deltaX = 0;
        return x;
    }

    private static int deltaY = 0;
    public static int getDY(){
        int y = deltaY;
        deltaY = 0;
        return y;
    }

    //FIXME
    public static int getDWheel(){
        return 0;
    }

    //FIXME
    public static int getButtonCount(){
        return 8;
    }

    //FIXME
    public static boolean hasWheel(){
        return true;
    }

    public static boolean isGrabbed(){
        return window != NULL && GLFWHelper.glfwGetInputMode(window, GLFW_CURSOR) == GLFW_CURSOR_DISABLED;
    }

    public static void setGrabbed(boolean grab){
        if(window != NULL){
            GLFWHelper.glfwSetInputMode(window, GLFW_CURSOR, grab ? GLFW_CURSOR_DISABLED : GLFW_CURSOR_NORMAL);
    
            GLFWHelper.glfwSetCursorPos(window, Display.getWidth() / 2D, Display.getHeight() / 2D);
            deltaX = 0;
            deltaY = 0;
        }
    }

    //TODO
    //public static void updateCursor()

    public static boolean isInsideWindow() {
        return isInsideWindow;
    }
}
