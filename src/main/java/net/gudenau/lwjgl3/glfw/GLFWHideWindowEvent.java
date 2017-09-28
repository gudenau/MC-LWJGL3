package net.gudenau.lwjgl3.glfw;

import static org.lwjgl.glfw.GLFW.glfwHideWindow;

/**
 * Created by gudenau on 6/23/2017.
 * <p>
 * LWJGL3
 */
class GLFWHideWindowEvent extends GLFWEvent{
    private final long window;

    GLFWHideWindowEvent(long window){
        this.window = window;
    }

    @Override
    void invoke(){
        glfwHideWindow(window);
    }
}
