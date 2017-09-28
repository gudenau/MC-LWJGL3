package net.gudenau.lwjgl3.glfw;

import lombok.Getter;
import org.lwjgl.glfw.GLFW;

/**
 * Created by gudenau on 9/3/2017.
 * <p>
 * LWJGL3
 */
class GLFWGetInputModeEvent extends GLFWEvent{
    private final long window;
    private final int mode;
    @Getter
    private int result;
    
    GLFWGetInputModeEvent(long window, int mode){
        this.window = window;
        this.mode = mode;
    }
    
    @Override
    void invoke(){
        result = GLFW.glfwGetInputMode(window, mode);
    }
}
