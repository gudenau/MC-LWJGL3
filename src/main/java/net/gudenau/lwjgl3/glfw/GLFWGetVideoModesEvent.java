package net.gudenau.lwjgl3.glfw;

import lombok.Getter;
import org.lwjgl.glfw.GLFWVidMode;

import static org.lwjgl.glfw.GLFW.glfwGetVideoModes;

/**
 * Created by gudenau on 6/23/2017.
 * <p>
 * LWJGL3
 */
class GLFWGetVideoModesEvent extends GLFWEvent{
    private final long monitor;
    @Getter
    private GLFWVidMode.Buffer result;

    GLFWGetVideoModesEvent(long monitor){
        this.monitor = monitor;
    }

    @Override
    void invoke(){
        result = glfwGetVideoModes(monitor);
    }
}
