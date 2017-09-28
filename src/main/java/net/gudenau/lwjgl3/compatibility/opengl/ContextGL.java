package net.gudenau.lwjgl3.compatibility.opengl;

import net.gudenau.lwjgl3.compatibility.LWJGLException;
import org.lwjgl.opengl.GL;

import static net.gudenau.lwjgl3.glfw.GLFWHelper.glfwMakeContextCurrent;
import static org.lwjgl.system.MemoryUtil.NULL;

/**
 * Created by gudenau on 5/31/2017.
 * <p>
 * LWJGL3
 */
public class ContextGL implements Context{
    private static final ThreadLocal<ContextGL> current_context_local = new ThreadLocal<>();
    private long window;
    private Thread thread;
    private boolean current;

    public ContextGL(long window){
        this.window = window;
        
        if(window == 0){
            throw new RuntimeException("Window was null!");
        }
    }

    public boolean isCurrent(){
        return current;
    }

    public void makeCurrent() throws LWJGLException{
        current = true;

        thread = Thread.currentThread();
        current_context_local.set(this);
        //implementation.makeCurrent(peer_info, handle);
        glfwMakeContextCurrent(window);
        GL.createCapabilities();
        GLContext.useContext(this, true);
    }

    public void releaseCurrent() throws LWJGLException{
        ContextGL currentContext = getCurrentContext();
        if(currentContext != null){
            GLContext.useContext(null);
            //noinspection SynchronizationOnLocalVariableOrMethodParameter
            synchronized(currentContext){
                currentContext.thread = null;
                glfwMakeContextCurrent(NULL);
            }
        }
        current = false;
    }

    @Override
    public void releaseDrawable() throws LWJGLException{

    }

    static ContextGL getCurrentContext() {
        return current_context_local.get();
    }

    public long getWindow(){
        return window;
    }
}
