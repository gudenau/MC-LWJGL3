package net.gudenau.lwjgl3.glfw;

import java.nio.DoubleBuffer;

import static org.lwjgl.glfw.GLFW.glfwGetCursorPos;

/**
 * Created by gudenau on 9/3/2017.
 * <p>
 * LWJGL3
 */
class GLFWGetCursorPosEvent extends GLFWEvent{
    private final long window;
    private final DoubleBuffer x;
    private final DoubleBuffer y;
    
    GLFWGetCursorPosEvent(long window, DoubleBuffer x, DoubleBuffer y){
        this.window = window;
        this.x = x;
        this.y = y;
    }
    
    @Override
    void invoke(){
        glfwGetCursorPos(window, x, y);
    }
}
