package net.gudenau.lwjgl3.glfw;

import lombok.Getter;
import org.lwjgl.glfw.GLFWCursorPosCallback;

import static org.lwjgl.glfw.GLFW.glfwSetCursorPosCallback;

/**
 * Created by gudenau on 9/3/2017.
 * <p>
 * LWJGL3
 */
class GLFWSetCursorPosCallbackEvent extends GLFWEvent{
    private final long window;
    private final GLFWCursorPosCallback cursorPosCallback;
    @Getter
    private GLFWCursorPosCallback result;
    
    GLFWSetCursorPosCallbackEvent(long window, GLFWCursorPosCallback cursorPosCallback){
        this.window = window;
        this.cursorPosCallback = cursorPosCallback;
    }
    
    @Override
    void invoke(){
        result = glfwSetCursorPosCallback(window, cursorPosCallback);
    }
}
