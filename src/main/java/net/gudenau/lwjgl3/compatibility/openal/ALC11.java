package net.gudenau.lwjgl3.compatibility.openal;

import java.nio.ByteBuffer;

/**
 * Created by gudenau on 6/1/2017.
 * <p>
 * LWJGL3
 */
public class ALC11{
    public static final int ALC_DEFAULT_ALL_DEVICES_SPECIFIER = 0x1012;
    public static final int ALC_ALL_DEVICES_SPECIFIER = 0x1013;
    public static final int ALC_CAPTURE_DEVICE_SPECIFIER = 0x310;
    public static final int ALC_CAPTURE_DEFAULT_DEVICE_SPECIFIER = 0x311;
    public static final int ALC_CAPTURE_SAMPLES = 0x312;
    public static final int ALC_MONO_SOURCES = 0x1010;
    public static final int ALC_STEREO_SOURCES = 0x1011;


    public static ALCdevice alcCaptureOpenDevice(String devicename, int frequency, int format, int buffersize){
        long device_address = org.lwjgl.openal.ALC11.alcCaptureOpenDevice(devicename, frequency, format, buffersize);
        if(device_address != 0){
            ALCdevice device = new ALCdevice(device_address);
            synchronized(ALC10.devices){
                ALC10.devices.put(device_address, device);
            }
            return device;
        }
        return null;
    }

    public static boolean alcCaptureCloseDevice(ALCdevice device){
        boolean result = org.lwjgl.openal.ALC11.alcCaptureCloseDevice(ALC10.getDevice(device));
        synchronized(ALC10.devices){
            device.setInvalid();
            ALC10.devices.remove(device.device);
        }
        return result;
    }

    public static void alcCaptureStart(ALCdevice device){
        org.lwjgl.openal.ALC11.alcCaptureStart(ALC10.getDevice(device));
    }

    public static void alcCaptureStop(ALCdevice device){
        org.lwjgl.openal.ALC11.alcCaptureStop(ALC10.getDevice(device));
    }

    public static void alcCaptureSamples(ALCdevice device, ByteBuffer buffer, int samples){
        org.lwjgl.openal.ALC11.alcCaptureSamples(ALC10.getDevice(device), buffer, samples);
    }

    static boolean initialize(){
        return true;
    }
}
