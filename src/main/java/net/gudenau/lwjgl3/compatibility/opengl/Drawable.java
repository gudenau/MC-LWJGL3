package net.gudenau.lwjgl3.compatibility.opengl;

import net.gudenau.lwjgl3.compatibility.LWJGLException;
import org.lwjgl.PointerBuffer;

/**
 * Created by gudenau on 5/30/2017.
 * <p>
 * LWJGL3
 */
public interface Drawable{
    /** Returns true if the Drawable's context is current in the current thread. */
    boolean isCurrent() throws LWJGLException;

    /**
     * Makes the Drawable's context current in the current thread.
     *
     * @throws LWJGLException
     */
    void makeCurrent() throws LWJGLException;

    /**
     * If the Drawable's context is current in the current thread, no context will be current after a call to this method.
     *
     * @throws LWJGLException
     */
    void releaseContext() throws LWJGLException;

    /** Destroys the Drawable. */
    void destroy();

    /**
     * Sets the appropriate khr_gl_sharing properties in the target <code>PointerBuffer</code>,
     * so that if it is used in a <code>clCreateContext(FromType)</code> call, the created CL
     * context will be sharing objects with this <code>Drawable</code>'s GL context. After a
     * call to this method, the target buffer position will have advanced by 2 to 4 positions,
     * depending on the implementation.
     *
     * @param properties The target properties buffer. It must have at least 4 positions remaining.
     */
    void setCLSharingProperties(PointerBuffer properties) throws LWJGLException;
}
