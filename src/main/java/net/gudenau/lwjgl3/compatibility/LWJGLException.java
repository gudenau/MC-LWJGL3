package net.gudenau.lwjgl3.compatibility;

/**
 * Created by gudenau on 5/30/2017.
 * <p>
 * LWJGL3
 * <br><br/>
 * Based on LWJGL version 2.9.4
 */
public class LWJGLException extends Exception {
    public LWJGLException() {
        super();
    }

    public LWJGLException(String msg) {
        super(msg);
    }

    public LWJGLException(String message, Throwable cause) {
        super(message, cause);
    }

    public LWJGLException(Throwable cause) {
        super(cause);
    }
}

