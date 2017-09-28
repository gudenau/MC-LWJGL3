package net.gudenau.lwjgl3.compatibility.opengl;

/**
 * Created by gudenau on 5/30/2017.
 * <p>
 * LWJGL3
 * <br><br/>
 * Based on LWJGL version 2.9.4
 */
public class OpenGLException extends RuntimeException{
    public OpenGLException(int gl_error_code) {
        this(createErrorMessage(gl_error_code));
    }

    private static String createErrorMessage(int gl_error_code) {
        return Util.translateGLErrorString(gl_error_code) + " (" + gl_error_code + ")";
    }

    public OpenGLException() {
        super();
    }

    public OpenGLException(String message) {
        super(message);
    }

    public OpenGLException(String message, Throwable cause) {
        super(message, cause);
    }

    public OpenGLException(Throwable cause) {
        super(cause);
    }
}
