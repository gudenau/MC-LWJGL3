package net.gudenau.lwjgl3.glfw;

import lombok.Getter;

import static org.lwjgl.glfw.GLFW.glfwGetMouseButton;

/**
 * Created by gudenau on 9/3/2017.
 * <p>
 * LWJGL3
 */
class GLFWGetMouseButtonEvent extends GLFWEvent{
    private final long window;
    private final int button;
    @Getter
    private int result;
    
    GLFWGetMouseButtonEvent(long window, int button){
        this.window = window;
        this.button = button;
    }
    
    @Override
    void invoke(){
        result = glfwGetMouseButton(window, button);
    }
}
