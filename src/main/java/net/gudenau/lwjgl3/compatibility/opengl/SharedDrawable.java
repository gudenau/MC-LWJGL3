package net.gudenau.lwjgl3.compatibility.opengl;

import net.gudenau.lwjgl3.compatibility.LWJGLException;

/**
 * Created by gudenau on 5/31/2017.
 * <p>
 * LWJGL3
 */
public class SharedDrawable extends DrawableGL{
    public SharedDrawable(final Drawable drawable) throws LWJGLException{
        this.context = (ContextGL)((DrawableLWJGL)drawable).createSharedContext();
    }

    /*public ContextGL createSharedContext() {
        throw new UnsupportedOperationException();
    }*/
}
