package net.gudenau.lwjgl3.compatibility.openal;

/**
 * Created by gudenau on 6/1/2017.
 * <p>
 * LWJGL3
 */
public class OpenALException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    /**
     * Constructor for OpenALException.
     */
    public OpenALException() {
        super();
    }

    /**
     * Constructor that takes an AL error number
     */
    public OpenALException(int error_code) {
        super("OpenAL error: " + AL10.alGetString(error_code) + " (" + error_code + ")");
    }

    /**
     * Constructor for OpenALException.
     * @param message
     */
    public OpenALException(String message) {
        super(message);
    }

    /**
     * Constructor for OpenALException.
     * @param message
     * @param cause
     */
    public OpenALException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructor for OpenALException.
     * @param cause
     */
    public OpenALException(Throwable cause) {
        super(cause);
    }
}
