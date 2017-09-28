package net.gudenau.lwjgl3.glfw;

import lombok.Getter;
import org.lwjgl.glfw.GLFWScrollCallback;

import static org.lwjgl.glfw.GLFW.glfwSetScrollCallback;

/**
 * Created by gudenau on 9/3/2017.
 * <p>
 * LWJGL3
 */
class GLFWwSetScrollCallbackEvent extends GLFWEvent{
    private final long window;
    private final GLFWScrollCallback scrollCallback;
    @Getter
    private GLFWScrollCallback result;
    
    GLFWwSetScrollCallbackEvent(long window, GLFWScrollCallback scrollCallback){
        this.window = window;
        this.scrollCallback = scrollCallback;
    }
    
    @Override
    void invoke(){
        result = glfwSetScrollCallback(window, scrollCallback);
    }
}
