package net.gudenau.lwjgl3.compatibility.opengl;

import java.awt.image.BufferedImage;

import static org.lwjgl.system.MemoryUtil.NULL;

/**
 * Created by gudenau on 6/16/2017.
 * <p>
 * LWJGL3
 */
public class SharedWindow extends DrawableGL{
    private final ContextWindow windowContext;

    public SharedWindow(Drawable drawable, int width, int height, String title, boolean resizable){
        this(drawable, width, height, title, resizable, NULL);
    }
    
    public SharedWindow(Drawable drawable, int width, int height, String title, boolean resizable, long monitor){
        this.context = (ContextGL)((DrawableLWJGL)drawable).createSharedContext(width, height, title, resizable, monitor);
        this.windowContext = (ContextWindow)context;
    }

    /*public ContextGL createSharedContext() {
        throw new UnsupportedOperationException();
    }*/

    public void setVisible(boolean visible){
        windowContext.setVisible(visible);
    }

    public void setIcon(BufferedImage ... icons){
        windowContext.setIcon(icons);
    }

    public long getWindowHandle(){
        return windowContext.getWindow();
    }
}
