package net.gudenau.lwjgl3.glfw;

import static org.lwjgl.glfw.GLFW.glfwDestroyWindow;

/**
 * Created by gudenau on 6/23/2017.
 * <p>
 * LWJGL3
 */
class GLFWDestroyWindowEvent extends GLFWEvent{
    private final long window;

    GLFWDestroyWindowEvent(long window){
        this.window = window;
    }

    @Override
    void invoke(){
        glfwDestroyWindow(window);
    }
}
