package net.gudenau.lwjgl3.glfw;

import org.lwjgl.glfw.GLFWGammaRamp;

import static org.lwjgl.glfw.GLFW.glfwSetGammaRamp;

/**
 * Created by gudenau on 6/23/2017.
 * <p>
 * LWJGL3
 */
class GLFWSetGammaRampEvent extends GLFWEvent{
    private final long monitor;
    private final GLFWGammaRamp ramp;

    GLFWSetGammaRampEvent(long monitor, GLFWGammaRamp ramp){
        this.monitor = monitor;
        this.ramp = ramp;
    }

    @Override
    void invoke(){
        glfwSetGammaRamp(monitor, ramp);
    }
}
