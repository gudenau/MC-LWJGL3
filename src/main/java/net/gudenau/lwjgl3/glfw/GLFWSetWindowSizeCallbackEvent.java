package net.gudenau.lwjgl3.glfw;

import lombok.Getter;
import org.lwjgl.glfw.GLFWWindowSizeCallback;

import static org.lwjgl.glfw.GLFW.glfwSetWindowSizeCallback;

/**
 * Created by gudenau on 6/23/2017.
 * <p>
 * LWJGL3
 */
class GLFWSetWindowSizeCallbackEvent extends GLFWEvent{
    private final long window;
    private final GLFWWindowSizeCallback callback;
    @Getter
    private GLFWWindowSizeCallback result;

    GLFWSetWindowSizeCallbackEvent(long window, GLFWWindowSizeCallback callback){
        this.window = window;
        this.callback = callback;
    }

    @Override
    void invoke(){
        result = glfwSetWindowSizeCallback(window, callback);
    }
}
