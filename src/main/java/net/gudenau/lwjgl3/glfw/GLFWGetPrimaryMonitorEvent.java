package net.gudenau.lwjgl3.glfw;

import lombok.Getter;

import static org.lwjgl.glfw.GLFW.glfwGetPrimaryMonitor;

/**
 * Created by gudenau on 6/23/2017.
 * <p>
 * LWJGL3
 */
class GLFWGetPrimaryMonitorEvent extends GLFWEvent{
    @Getter
    private long result;

    @Override
    void invoke(){
        result = glfwGetPrimaryMonitor();
    }
}
