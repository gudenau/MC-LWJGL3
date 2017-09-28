package net.gudenau.lwjgl3.compatibility.opengl;

import net.gudenau.lwjgl3.compatibility.LWJGLException;

/**
 * Created by gudenau on 5/30/2017.
 * <p>
 * LWJGL3
 */
interface DrawableLWJGL extends Drawable {

    void setPixelFormat(PixelFormatLWJGL pf) throws LWJGLException;

    void setPixelFormat(PixelFormatLWJGL pf, ContextAttribs attribs) throws LWJGLException;

    PixelFormatLWJGL getPixelFormat();

    /**
     * [INTERNAL USE ONLY] Returns the Drawable's Context.
     *
     * @return the Drawable's Context
     */
    Context getContext();

    /**
     * [INTERNAL USE ONLY] Creates a new Context that is shared with the Drawable's Context.
     *
     * @return a Context shared with the Drawable's Context.
     */
    Context createSharedContext() throws LWJGLException;

    Context createSharedContext(int width, int height, String title, boolean resizable);
    
    Context createSharedContext(int width, int height, String title, boolean resizable, long monitor);

    void checkGLError();

    void setSwapInterval(int swap_interval);

    void swapBuffers() throws LWJGLException;

    void initContext(final float r, final float g, final float b);

}
