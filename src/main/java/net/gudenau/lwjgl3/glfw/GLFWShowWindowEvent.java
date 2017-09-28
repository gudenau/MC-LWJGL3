package net.gudenau.lwjgl3.glfw;

import static org.lwjgl.glfw.GLFW.glfwShowWindow;

/**
 * Created by gudenau on 6/23/2017.
 * <p>
 * LWJGL3
 */
class GLFWShowWindowEvent extends GLFWEvent{
    private final long window;

    GLFWShowWindowEvent(long window){
        this.window = window;
    }

    @Override
    void invoke(){
        glfwShowWindow(window);
    }
}
