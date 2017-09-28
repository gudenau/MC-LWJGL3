package net.gudenau.lwjgl3.glfw;

import java.nio.IntBuffer;

import static org.lwjgl.glfw.GLFW.glfwGetWindowPos;

/**
 * Created by gudenau on 6/23/2017.
 * <p>
 * LWJGL3
 */
class GLFWGetWindowPosEvent extends GLFWEvent{
    private final long window;
    private final IntBuffer xpos;
    private final IntBuffer ypos;

    GLFWGetWindowPosEvent(long window, IntBuffer xpos, IntBuffer ypos){
        this.window = window;
        this.xpos = xpos;
        this.ypos = ypos;
    }

    @Override
    void invoke(){
        glfwGetWindowPos(window, xpos, ypos);
    }
}
