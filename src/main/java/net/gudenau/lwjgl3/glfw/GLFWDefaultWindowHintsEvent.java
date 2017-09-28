package net.gudenau.lwjgl3.glfw;

import static org.lwjgl.glfw.GLFW.glfwDefaultWindowHints;

/**
 * Created by gudenau on 6/23/2017.
 * <p>
 * LWJGL3
 */
class GLFWDefaultWindowHintsEvent extends GLFWEvent{
    @Override
    void invoke(){
        glfwDefaultWindowHints();
    }
}
