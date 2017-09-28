package net.gudenau.lwjgl3.glfw;

import lombok.Getter;
import org.lwjgl.glfw.GLFWMouseButtonCallback;

import static org.lwjgl.glfw.GLFW.glfwSetMouseButtonCallback;

/**
 * Created by gudenau on 9/3/2017.
 * <p>
 * LWJGL3
 */
class GLFWSetMouseButtonCallbackEvent extends GLFWEvent{
    private final long window;
    private final GLFWMouseButtonCallback mouseButtonCallback;
    @Getter
    private GLFWMouseButtonCallback result;
    
    GLFWSetMouseButtonCallbackEvent(long window, GLFWMouseButtonCallback mouseButtonCallback){
        this.window = window;
        this.mouseButtonCallback = mouseButtonCallback;
    }
    
    @Override
    void invoke(){
        result = glfwSetMouseButtonCallback(window, mouseButtonCallback);
    }
}
