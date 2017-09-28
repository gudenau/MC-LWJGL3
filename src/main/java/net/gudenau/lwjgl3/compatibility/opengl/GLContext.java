package net.gudenau.lwjgl3.compatibility.opengl;

import net.gudenau.lwjgl3.compatibility.LWJGLException;
import net.gudenau.lwjgl3.compatibility.Sys;

import java.util.Map;
import java.util.WeakHashMap;

/**
 * Created by gudenau on 5/31/2017.
 * <p>
 * LWJGL3
 */
@SuppressWarnings({"WeakerAccess", "unused"})
public class GLContext{
    private static final ThreadLocal<ContextCapabilities> current_capabilities = new ThreadLocal<>();
    private static CapabilitiesCacheEntry fast_path_cache = new CapabilitiesCacheEntry();
    private static final ThreadLocal<CapabilitiesCacheEntry> thread_cache_entries = new ThreadLocal<>();
    private static final Map<Object, ContextCapabilities> capability_cache = new WeakHashMap<>();
    private static int gl_ref_count;
    private static boolean did_auto_load;

    static{
        Sys.initialize();
    }

    public static ContextCapabilities getCapabilities(){
        ContextCapabilities caps = getCapabilitiesImpl();
        if(caps == null){
            //throw new RuntimeException("No OpenGL context found in the current thread.");
            try{
                return new ContextCapabilities(false);
            }catch(LWJGLException e){
                //e.printStackTrace();
                throw new RuntimeException("No OpenGL context found in the current thread and could not create!", e);
            }
        }

        return caps;
    }

    private static ContextCapabilities getCapabilitiesImpl(){
        CapabilitiesCacheEntry recent_cache_entry = fast_path_cache;
        // Check owner of cache entry
        if(recent_cache_entry.owner == Thread.currentThread()){
            /* The owner ship test succeeded, so the cache must contain the current ContextCapabilities instance
			 * assert recent_cache_entry.capabilities == getThreadLocalCapabilities();
			 */
            return recent_cache_entry.capabilities;
        }else // Some other thread has written to the cache since, and we fall back to the slower path
            return getThreadLocalCapabilities();
    }

    static ContextCapabilities getCapabilities(Object context){
        return capability_cache.get(context);
    }

    private static ContextCapabilities getThreadLocalCapabilities(){
        return current_capabilities.get();
    }

    static void setCapabilities(ContextCapabilities capabilities){
        current_capabilities.set(capabilities);

        CapabilitiesCacheEntry thread_cache_entry = thread_cache_entries.get();
        if(thread_cache_entry == null){
            thread_cache_entry = new CapabilitiesCacheEntry();
            thread_cache_entries.set(thread_cache_entry);
        }
        thread_cache_entry.owner = Thread.currentThread();
        thread_cache_entry.capabilities = capabilities;

        fast_path_cache = thread_cache_entry;
    }

    public static synchronized void useContext(Object context) throws LWJGLException{
        useContext(context, false);
    }

    @SuppressWarnings("SameParameterValue")
    public static synchronized void useContext(Object context, boolean forwardCompatible) throws LWJGLException{
        if(context == null){
            ContextCapabilities.unloadAllStubs();
            setCapabilities(null);
            if(did_auto_load)
                unloadOpenGLLibrary();
            return;
        }
        if(gl_ref_count == 0){
            loadOpenGLLibrary();
            did_auto_load = true;
        }
        try{
            ContextCapabilities capabilities = capability_cache.get(context);
            if(capabilities == null){
                new ContextCapabilities(forwardCompatible);
                capability_cache.put(context, getCapabilities());
            }else
                setCapabilities(capabilities);
        }catch(LWJGLException e){
            if(did_auto_load)
                unloadOpenGLLibrary();
            throw e;
        }
    }

    public static synchronized void loadOpenGLLibrary() throws LWJGLException{
        gl_ref_count++;
    }

    public static synchronized void unloadOpenGLLibrary(){
        gl_ref_count--;
    }

    private static final class CapabilitiesCacheEntry{
        Thread owner;
        ContextCapabilities capabilities;
    }
}
