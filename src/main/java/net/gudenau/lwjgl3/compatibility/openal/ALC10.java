package net.gudenau.lwjgl3.compatibility.openal;

import java.nio.IntBuffer;
import java.util.HashMap;

import static org.lwjgl.system.MemoryUtil.NULL;

/**
 * Created by gudenau on 6/1/2017.
 * <p>
 * LWJGL3
 */
@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue"})
public class ALC10{
    static final HashMap<Long, ALCcontext> contexts = new HashMap<>();
    static final HashMap<Long, ALCdevice> devices = new HashMap<>();
    public static final int ALC_INVALID = 0;
    public static final int ALC_FALSE = 0;
    public static final int ALC_TRUE = 1;
    public static final int ALC_NO_ERROR = ALC_FALSE;
    public static final int ALC_MAJOR_VERSION = 0x1000;
    public static final int ALC_MINOR_VERSION = 0x1001;
    public static final int ALC_ATTRIBUTES_SIZE = 0x1002;
    public static final int ALC_ALL_ATTRIBUTES = 0x1003;
    public static final int ALC_DEFAULT_DEVICE_SPECIFIER = 0x1004;
    public static final int ALC_DEVICE_SPECIFIER = 0x1005;
    public static final int ALC_EXTENSIONS = 0x1006;
    public static final int ALC_FREQUENCY = 0x1007;
    public static final int ALC_REFRESH = 0x1008;
    public static final int ALC_SYNC = 0x1009;
    public static final int ALC_INVALID_DEVICE = 0xA001;
    public static final int ALC_INVALID_CONTEXT = 0xA002;
    public static final int ALC_INVALID_ENUM = 0xA003;
    public static final int ALC_INVALID_VALUE = 0xA004;
    public static final int ALC_OUT_OF_MEMORY = 0xA005;

    public static String alcGetString(ALCdevice device, int pname) {
        return org.lwjgl.openal.ALC10.alcGetString(device.device, pname);
    }

    public static void alcGetInteger(ALCdevice device, int pname, IntBuffer integerdata) {
        org.lwjgl.openal.ALC10.alcGetIntegerv(getDevice(device), pname, integerdata);
        Util.checkALCError(device);
    }

    public static ALCdevice alcOpenDevice(String devicename) {
        long device_address = org.lwjgl.openal.ALC10.alcOpenDevice(devicename);
        if(device_address != NULL) {
            ALCdevice device = new ALCdevice(device_address);
            synchronized (ALC10.devices) {
                devices.put(device_address, device);
            }
            return device;
        }
        return null;
    }

    public static boolean alcCloseDevice(ALCdevice device) {
        boolean result = org.lwjgl.openal.ALC10.alcCloseDevice(getDevice(device));
        synchronized (devices) {
            device.setInvalid();
            devices.remove(device.device);
        }
        return result;

    }

    public static ALCcontext alcCreateContext(ALCdevice device, IntBuffer attrList) {
        long context_address = org.lwjgl.openal.ALC10.alcCreateContext(getDevice(device), attrList);
        Util.checkALCError(device);

        if(context_address != NULL) {
            ALCcontext context = new ALCcontext(context_address);
            synchronized (ALC10.contexts) {
                contexts.put(context_address, context);
                device.addContext(context);
            }
            return context;
        }
        return null;
    }

    public static int alcMakeContextCurrent(ALCcontext context) {
        return org.lwjgl.openal.ALC10.alcMakeContextCurrent(getContext(context)) ? ALC_TRUE : ALC_FALSE;
    }

    public static void alcProcessContext(ALCcontext context) {
        org.lwjgl.openal.ALC10.alcProcessContext(getContext(context));
    }

    public static ALCcontext alcGetCurrentContext() {
        ALCcontext context = null;
        long context_address = org.lwjgl.openal.ALC10.alcGetCurrentContext();
        if(context_address != 0) {
            synchronized (ALC10.contexts) {
                context = ALC10.contexts.get(context_address);
            }
        }
        return context;
    }

    public static ALCdevice alcGetContextsDevice(ALCcontext context) {
        ALCdevice device = null;
        long device_address = org.lwjgl.openal.ALC10.alcGetContextsDevice(getContext(context));
        if (device_address != 0) {
            synchronized (ALC10.devices) {
                device = ALC10.devices.get(device_address);
            }
        }
        return device;
    }

    public static void alcSuspendContext(ALCcontext context) {
        org.lwjgl.openal.ALC10.alcSuspendContext(getContext(context));
    }

    public static void alcDestroyContext(ALCcontext context) {
        //noinspection Duplicates
        synchronized(ALC10.contexts) {
            ALCdevice device = alcGetContextsDevice(context);
            org.lwjgl.openal.ALC10.alcDestroyContext(getContext(context));
            device.removeContext(context);
            context.setInvalid();
        }
    }

    public static int alcGetError(ALCdevice device) {
        return org.lwjgl.openal.ALC10.alcGetError(getDevice(device));
    }

    public static boolean alcIsExtensionPresent(ALCdevice device, String extName) {
        boolean result = org.lwjgl.openal.ALC10.alcIsExtensionPresent(getDevice(device), extName);
        Util.checkALCError(device);
        return result;
    }

    public static int alcGetEnumValue(ALCdevice device, String enumName) {
        int result = org.lwjgl.openal.ALC10.alcGetEnumValue(getDevice(device), enumName);
        Util.checkALCError(device);
        return result;
    }

    static long getDevice(ALCdevice device) {
        if(device != null) {
            Util.checkALCValidDevice(device);
            return device.device;
        }
        return 0L;
    }

    static long getContext(ALCcontext context) {
        if(context != null) {
            Util.checkALCValidContext(context);
            return context.context;
        }
        return 0L;
    }
}
