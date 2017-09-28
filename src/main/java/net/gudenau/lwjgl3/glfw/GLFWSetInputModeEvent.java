package net.gudenau.lwjgl3.glfw;

import static org.lwjgl.glfw.GLFW.glfwSetInputMode;

/**
 * Created by gudenau on 9/3/2017.
 * <p>
 * LWJGL3
 */
class GLFWSetInputModeEvent extends GLFWEvent{
    private final long window;
    private final int input;
    private final int mode;
    
    GLFWSetInputModeEvent(long window, int input, int mode){
        this.window = window;
        this.input = input;
        this.mode = mode;
    }
    
    @Override
    void invoke(){
        glfwSetInputMode(window, input, mode);
    }
}
