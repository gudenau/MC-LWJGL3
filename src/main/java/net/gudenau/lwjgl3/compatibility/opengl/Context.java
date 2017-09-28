package net.gudenau.lwjgl3.compatibility.opengl;

import net.gudenau.lwjgl3.compatibility.LWJGLException;

/**
 * Created by gudenau on 5/30/2017.
 * <p>
 * LWJGL3
 */
interface Context {
    boolean isCurrent() throws LWJGLException;
    void makeCurrent() throws LWJGLException;
    void releaseCurrent() throws LWJGLException;
    void releaseDrawable() throws LWJGLException;
}
