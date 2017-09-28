package net.gudenau.lwjgl3.glfw;

import static org.lwjgl.glfw.GLFW.glfwSetWindowTitle;

/**
 * Created by gudenau on 6/23/2017.
 * <p>
 * LWJGL3
 */
class GLFWSetWindowTitleEvent extends GLFWEvent{
    private final long window;
    private final CharSequence title;

    GLFWSetWindowTitleEvent(long window, CharSequence title){
        this.window = window;
        this.title = title;
    }

    @Override
    void invoke(){
        glfwSetWindowTitle(window, title);
    }
}
