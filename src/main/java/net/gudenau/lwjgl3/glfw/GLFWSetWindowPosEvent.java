package net.gudenau.lwjgl3.glfw;

import static org.lwjgl.glfw.GLFW.glfwSetWindowPos;

/**
 * Created by gudenau on 6/23/2017.
 * <p>
 * LWJGL3
 */
class GLFWSetWindowPosEvent extends GLFWEvent{
    private final long window;
    private final int x;
    private final int y;

    GLFWSetWindowPosEvent(long window, int x, int y){
        this.window = window;
        this.x = x;
        this.y = y;
    }

    @Override
    void invoke(){
        glfwSetWindowPos(window, x, y);
    }
}
