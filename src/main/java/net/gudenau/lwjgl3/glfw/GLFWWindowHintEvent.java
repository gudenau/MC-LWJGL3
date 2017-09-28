package net.gudenau.lwjgl3.glfw;

import static org.lwjgl.glfw.GLFW.glfwWindowHint;

/**
 * Created by gudenau on 6/23/2017.
 * <p>
 * LWJGL3
 */
class GLFWWindowHintEvent extends GLFWEvent{
    private final int hint;
    private final int value;

    GLFWWindowHintEvent(int hint, int value){
        this.hint = hint;
        this.value = value;
    }

    @Override
    void invoke(){
        glfwWindowHint(hint, value);
    }
}
