package net.gudenau.lwjgl3.glfw;

import java.nio.IntBuffer;

import static org.lwjgl.glfw.GLFW.glfwGetWindowSize;

/**
 * Created by gudenau on 6/23/2017.
 * <p>
 * LWJGL3
 */
class GLFWGetWindowSizeEvent extends GLFWEvent{
    private final long window;
    private final IntBuffer width;
    private final IntBuffer height;

    GLFWGetWindowSizeEvent(long window, IntBuffer width, IntBuffer height){
        this.window = window;
        this.width = width;
        this.height = height;
    }


    @Override
    void invoke(){
        glfwGetWindowSize(window, width, height);
    }
}
