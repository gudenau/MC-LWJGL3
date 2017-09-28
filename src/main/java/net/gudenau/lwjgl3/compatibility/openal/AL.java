package net.gudenau.lwjgl3.compatibility.openal;

import net.gudenau.lwjgl3.compatibility.LWJGLException;
import net.gudenau.lwjgl3.compatibility.Sys;
import org.lwjgl.system.MemoryStack;

/**
 * Created by gudenau on 5/31/2017.
 * <p>
 * LWJGL3
 */
@SuppressWarnings({"unused", "WeakerAccess", "SpellCheckingInspection", "SameParameterValue"})
public class AL{
    static ALCdevice device;
    static ALCcontext context;
    private static boolean created;

    static {
        Sys.initialize();
    }

    private AL() {}

    public static boolean isCreated() {
        return created;
    }

    public static void create(String deviceArguments, int contextFrequency, int contextRefresh, boolean contextSynchronized) throws LWJGLException{
        create(deviceArguments, contextFrequency, contextRefresh, contextSynchronized, true);
    }

    public static void create(String deviceArguments, int contextFrequency, int contextRefresh, boolean contextSynchronized, boolean openDevice) throws LWJGLException {
        if (created){
            throw new IllegalStateException("Only one OpenAL context may be instantiated at any one time.");
        }
        init(deviceArguments, contextFrequency, contextRefresh, contextSynchronized, openDevice);
        created = true;
    }

    private static void init(String deviceArguments, int contextFrequency, int contextRefresh, boolean contextSynchronized, boolean openDevice) throws LWJGLException {
        try {
            if(openDevice) {
                device = ALC10.alcOpenDevice(deviceArguments);
                if (device == null) {
                    throw new LWJGLException("Could not open ALC device");
                }

                if (contextFrequency == -1) {
                    context = ALC10.alcCreateContext(device, null);
                } else {
                    try(MemoryStack stack = MemoryStack.stackPush()){
                        context = ALC10.alcCreateContext(device,
                            ALCcontext.createAttributeList(
                                contextFrequency,
                                contextRefresh,
                                contextSynchronized ? ALC10.ALC_TRUE : ALC10.ALC_FALSE,
                                stack));
                    }
                }
                ALC10.alcMakeContextCurrent(context);
            }
        } catch (LWJGLException e) {
            destroy();
            throw e;
        }

        ALC11.initialize();
    }

    public static void create() throws LWJGLException {
        create(null, 44100, 60, false);
    }

    public static void destroy() {
        if (context != null) {
            ALC10.alcMakeContextCurrent(null);
            ALC10.alcDestroyContext(context);
            context = null;
        }
        if (device != null) {
            ALC10.alcCloseDevice(device);
            device = null;
        }

        created = false;
    }

    public static ALCcontext getContext() {
        return context;
    }

    public static ALCdevice getDevice() {
        return device;
    }
}
