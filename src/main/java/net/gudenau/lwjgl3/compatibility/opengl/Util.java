package net.gudenau.lwjgl3.compatibility.opengl;

import static org.lwjgl.opengl.ARBImaging.GL_TABLE_TOO_LARGE;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL30.GL_INVALID_FRAMEBUFFER_OPERATION;

/**
 * Created by gudenau on 5/30/2017.
 * <p>
 * LWJGL3
 * <br><br/>
 * Based on LWJGL version 2.9.4
 */
public class Util{
    private Util() {
    }

    public static void checkGLError() throws OpenGLException {
        if ( ContextCapabilities.DEBUG /*FIXME? && GLContext.getCapabilities().tracker.isBeginEnd()*/ ) // Do not call GetError inside a Begin/End pair.
            return;
        int err = glGetError();
        if ( err != GL_NO_ERROR ) {
            throw new OpenGLException(err);
        }
    }

    public static String translateGLErrorString(int error_code) {
        switch (error_code) {
            case GL_NO_ERROR:
                return "No error";
            case GL_INVALID_ENUM:
                return "Invalid enum";
            case GL_INVALID_VALUE:
                return "Invalid value";
            case GL_INVALID_OPERATION:
                return "Invalid operation";
            case GL_STACK_OVERFLOW:
                return "Stack overflow";
            case GL_STACK_UNDERFLOW:
                return "Stack underflow";
            case GL_OUT_OF_MEMORY:
                return "Out of memory";
            case GL_TABLE_TOO_LARGE:
                return "Table too large";
            case GL_INVALID_FRAMEBUFFER_OPERATION:
                return "Invalid framebuffer operation";
            default:
                return null;
        }
    }
}
