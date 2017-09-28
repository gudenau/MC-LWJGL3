package net.gudenau.lwjgl3.glfw;

import lombok.Getter;

import static org.lwjgl.glfw.GLFW.glfwGetWindowAttrib;

/**
 * Created by gudenau on 6/23/2017.
 * <p>
 * LWJGL3
 */
class GLFWGetWindowAttribEvent extends GLFWEvent{
    private final long window;
    private final int attrib;
    @Getter
    private int result;

    GLFWGetWindowAttribEvent(long window, int attrib){
        this.window = window;
        this.attrib = attrib;
    }

    @Override
    void invoke(){
        result = glfwGetWindowAttrib(window, attrib);
    }
}
