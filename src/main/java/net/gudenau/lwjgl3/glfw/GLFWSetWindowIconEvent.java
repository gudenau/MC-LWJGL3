package net.gudenau.lwjgl3.glfw;

import org.lwjgl.glfw.GLFWImage;

import static org.lwjgl.glfw.GLFW.glfwSetWindowIcon;

/**
 * Created by gudenau on 6/23/2017.
 * <p>
 * LWJGL3
 */
class GLFWSetWindowIconEvent extends GLFWEvent{
    private final long window;
    private final GLFWImage.Buffer icons;

    GLFWSetWindowIconEvent(long window, GLFWImage.Buffer icons){
        this.window = window;
        this.icons = icons;
    }

    @Override
    void invoke(){
        glfwSetWindowIcon(window, icons);
    }
}
