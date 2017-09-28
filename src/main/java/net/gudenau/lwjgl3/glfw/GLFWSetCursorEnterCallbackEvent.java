package net.gudenau.lwjgl3.glfw;

import lombok.Getter;
import org.lwjgl.glfw.GLFWCursorEnterCallback;

import static org.lwjgl.glfw.GLFW.glfwSetCursorEnterCallback;

/**
 * Created by gudenau on 9/3/2017.
 * <p>
 * LWJGL3
 */
class GLFWSetCursorEnterCallbackEvent extends GLFWEvent{
    private final long window;
    private final GLFWCursorEnterCallback cursorEnterCallback;
    @Getter
    private GLFWCursorEnterCallback result;
    
    GLFWSetCursorEnterCallbackEvent(long window, GLFWCursorEnterCallback cursorEnterCallback){
        this.window = window;
        this.cursorEnterCallback = cursorEnterCallback;
    }
    
    @Override
    void invoke(){
        result = glfwSetCursorEnterCallback(window, cursorEnterCallback);
    }
}
