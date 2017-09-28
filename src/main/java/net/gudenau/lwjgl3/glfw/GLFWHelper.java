package net.gudenau.lwjgl3.glfw;

import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.*;
import org.lwjglx.debug.RT;

import java.nio.DoubleBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.system.MemoryUtil.NULL;

/**
 * Created by gudenau on 5/31/2017.
 * <p>
 * LWJGL3
 */
@SuppressWarnings({"UnusedReturnValue", "unused"})
public class GLFWHelper{
    private static final Thread eventThread = new Thread(GLFWHelper::thread);
    private static boolean started = false;

    private static final Object $GLFW_LOCK = new Object[0];
    private static boolean shouldRun = true;
    
    static{
        GLFWHelper.initGLFW();
    }
    
    private static void initGLFW(){
        synchronized($GLFW_LOCK){
            if(!started){
                started = true;
                eventThread.setName("GLFW Event Thread");
                eventThread.start();
            }
        }
    }

    public static void glfwHideWindow(long window){
        postEvent(new GLFWHideWindowEvent(window));
    }

    public static void glfwShowWindow(long window){
        postEvent(new GLFWShowWindowEvent(window));
    }

    public static void glfwGetWindowSize(long window, IntBuffer width, IntBuffer height) {
        postEvent(new GLFWGetWindowSizeEvent(window, width, height));
    }

    public static void glfwGetWindowPos(long window, IntBuffer xPos, IntBuffer yPos) {
        postEvent(new GLFWGetWindowPosEvent(window, xPos, yPos));
    }

    public static void glfwSetWindowPos(long window, int x, int y){
        postEvent(new GLFWSetWindowPosEvent(window, x, y));
    }

    public static void glfwSetWindowSize(long window, int width, int height){
        postEvent(new GLFWSetWindowSizeEvent(window, width, height));
    }

    @SuppressWarnings("SpellCheckingInspection")
    public static int glfwGetWindowAttrib(long window, int attribute){
        return postEvent(new GLFWGetWindowAttribEvent(window, attribute)).getResult();
    }

    public static void glfwSetWindowTitle(long window, CharSequence title){
        postEvent(new GLFWSetWindowTitleEvent(window, title));
    }

    public static void glfwSetGammaRamp(long monitor, GLFWGammaRamp ramp){
        postEvent(new GLFWSetGammaRampEvent(monitor, ramp));
    }

    public static void glfwDestroyWindow(long window){
        postEvent(new GLFWDestroyWindowEvent(window));
    }

    @SuppressWarnings("UnusedReturnValue")
    public static GLFWWindowSizeCallback glfwSetWindowSizeCallback(long window, GLFWWindowSizeCallback callback){
        return postEvent(new GLFWSetWindowSizeCallbackEvent(window, callback)).getResult();
    }

    public static void glfwSetWindowIcon(long window, GLFWImage.Buffer icons){
        postEvent(new GLFWSetWindowIconEvent(window, icons));
    }

    public static void glfwWindowHint(int hint, int value){
        postEvent(new GLFWWindowHintEvent(hint, value));
    }

    public static void glfwDefaultWindowHints(){
        postEvent(new GLFWDefaultWindowHintsEvent());
    }

    public static GLFWVidMode.Buffer glfwGetVideoModes(long monitor){
        return postEvent(new GLFWGetVideoModesEvent(monitor)).getResult();
    }

    public static long glfwGetPrimaryMonitor(){
        return postEvent(new GLFWGetPrimaryMonitorEvent()).getResult();
    }

    public static long glfwCreateWindow(int width, int height, CharSequence title, long monitor, long share){
        synchronized(contextMap$LOCK){
            if(share != NULL && contextMap.containsValue(share)){
                throw new RuntimeException("The shared context was in use by another thread!");
            }
            long window = postEvent(new GLFWCreateWindowEvent(width, height, title, monitor, share)).getResult();
            org.lwjgl.glfw.GLFW.glfwMakeContextCurrent(window);
            return window;
        }
    }
    
    public static int glfwGetInputMode(long window, int mode){
        return postEvent(new GLFWGetInputModeEvent(window, mode)).getResult();
    }
    
    public static GLFWScrollCallback glfwSetScrollCallback(long window, GLFWScrollCallback scrollCallback){
        return postEvent(new GLFWwSetScrollCallbackEvent(window, scrollCallback)).getResult();
    }
    
    public static GLFWMouseButtonCallback glfwSetMouseButtonCallback(long window, GLFWMouseButtonCallback mouseButtonCallback){
        return postEvent(new GLFWSetMouseButtonCallbackEvent(window, mouseButtonCallback)).getResult();
    }
    
    public static GLFWCursorPosCallback glfwSetCursorPosCallback(long window, GLFWCursorPosCallback cursorPosCallback){
        return postEvent(new GLFWSetCursorPosCallbackEvent(window, cursorPosCallback)).getResult();
    }
    
    public static GLFWCursorEnterCallback glfwSetCursorEnterCallback(long window, GLFWCursorEnterCallback cursorEnterCallback){
        return postEvent(new GLFWSetCursorEnterCallbackEvent(window, cursorEnterCallback)).getResult();
    }
    
    public static void glfwSetCursorPos(long window, double x, double y){
        postEvent(new GLFWSetCursorPosEvent(window, x, y));
    }
    
    public static int glfwGetMouseButton(long window, int button){
        return postEvent(new GLFWGetMouseButtonEvent(window, button)).getResult();
    }
    
    public static void glfwGetCursorPos(long window, DoubleBuffer x, DoubleBuffer y){
        postEvent(new GLFWGetCursorPosEvent(window, x, y));
    }
    
    public static void glfwSetInputMode(long window, int input, int mode){
        postEvent(new GLFWSetInputModeEvent(window, input, mode));
    }
    
    public static PointerBuffer glfwGetMonitors(){
        return postEvent(new GLFWGetMonitorsEvent()).getResult();
    }
    
    private static <T extends GLFWEvent> T postEvent(T event){
        //noinspection SynchronizationOnLocalVariableOrMethodParameter
        synchronized(event){
            if(Thread.currentThread() == eventThread){
                event.invoke();
            }else{
                synchronized($GLFW_LOCK){
                    glfwEventQueue.add(event);
                }
                synchronized(eventThread){
                    eventThread.notify();
                }
                try{
                    event.wait();
                }catch(InterruptedException ignored){
                }
            }
        }
        return event;
    }

    private static Queue<GLFWEvent> glfwEventQueue = new LinkedList<>();

    private static void thread(){
        Runtime.getRuntime().addShutdownHook(new Thread(()->{
            shouldRun = false;
            eventThread.interrupt();
        }));
    
        RT.mainThread = Thread.currentThread();
        
        GLFWErrorCallback.createPrint(System.err).set();
        
        if(!glfwInit()){
            throw new RuntimeException("Could not init GLFW!");
        }

        while(shouldRun){
            GLFWEvent event;
            synchronized($GLFW_LOCK){
                if(!glfwEventQueue.isEmpty()){
                    event = glfwEventQueue.remove();
                }else{
                    event = null;
                }
            }
            if(event != null){
                //noinspection SynchronizationOnLocalVariableOrMethodParameter
                synchronized(event){
                    event.invoke();
                    event.notify();
                }
            }

            glfwPollEvents();
            synchronized(eventThread){
                boolean empty;
                synchronized($GLFW_LOCK){
                    empty = glfwEventQueue.isEmpty();
                }
                if(empty){
                    try{
                        eventThread.wait();
                    }catch(InterruptedException ignored){
                    }
                }
            }
            
//            try{
//                Thread.sleep(10);
//            }catch(InterruptedException ignored){}
        }
    }
    
    private static final Object contextMap$LOCK = new Object[0];
    private static final Map<Thread, Long> contextMap = new HashMap<>();
    public static void glfwMakeContextCurrent(long window){
        synchronized(contextMap$LOCK){
            GLFW.glfwMakeContextCurrent(window);
            if(window != NULL){
                contextMap.put(Thread.currentThread(), window);
            }else{
                contextMap.remove(Thread.currentThread());
            }
        }
    }
}
