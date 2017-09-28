package net.gudenau.lwjgl3.glfw;

import static org.lwjgl.glfw.GLFW.glfwSetWindowSize;

/**
 * Created by gudenau on 6/23/2017.
 * <p>
 * LWJGL3
 */
class GLFWSetWindowSizeEvent extends GLFWEvent{
    private final long window;
    private final int width;
    private final int height;

    GLFWSetWindowSizeEvent(long window, int width, int height){
        this.window = window;
        this.width = width;
        this.height = height;
    }

    @Override
    void invoke(){
        glfwSetWindowSize(window, width, height);
    }
}
