package net.gudenau.lwjgl3.glfw;

import lombok.Getter;
import org.lwjgl.PointerBuffer;

import static org.lwjgl.glfw.GLFW.glfwGetMonitors;

/**
 * Created by gudenau on 9/3/2017.
 * <p>
 * LWJGL3
 */
class GLFWGetMonitorsEvent extends GLFWEvent{
    @Getter
    private PointerBuffer result;
    
    @Override
    void invoke(){
        result = glfwGetMonitors();
    }
}
