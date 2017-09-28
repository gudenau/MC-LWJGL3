package net.gudenau.lwjgl3.glfw;

import lombok.Getter;
import org.lwjgl.glfw.GLFW;

import static org.lwjgl.system.MemoryUtil.NULL;

/**
 * Created by gudenau on 6/22/2017.
 * <p>
 * LWJGL3
 */
class GLFWCreateWindowEvent extends GLFWEvent{
    private final int width;
    private final int height;
    private final CharSequence title;
    private final long monitor;
    private final long share;
    @Getter
    private long result;

    GLFWCreateWindowEvent(int width, int height, CharSequence title, long monitor, long share){
        this.width = width;
        this.height = height;
        this.title = title;
        this.monitor = monitor;
        this.share = share;
    }

    @Override
    void invoke(){
        result = GLFW.glfwCreateWindow(width, height, title, monitor, share);
        GLFW.glfwMakeContextCurrent(NULL);
    }
}
