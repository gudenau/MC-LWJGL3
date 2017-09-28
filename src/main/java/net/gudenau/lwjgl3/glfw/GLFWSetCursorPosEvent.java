package net.gudenau.lwjgl3.glfw;

import static org.lwjgl.glfw.GLFW.glfwSetCursorPos;

/**
 * Created by gudenau on 9/3/2017.
 * <p>
 * LWJGL3
 */
class GLFWSetCursorPosEvent extends GLFWEvent{
    private final long window;
    private final double x;
    private final double y;
    
    GLFWSetCursorPosEvent(long window, double x, double y){
        this.window = window;
        this.x = x;
        this.y = y;
    }
    
    @Override
    void invoke(){
        glfwSetCursorPos(window, x, y);
    }
}
