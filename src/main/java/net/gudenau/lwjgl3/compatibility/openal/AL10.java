package net.gudenau.lwjgl3.compatibility.openal;

import java.nio.*;

@SuppressWarnings({"unused", "WeakerAccess", "SpellCheckingInspection"})
public class AL10{
    public static final int AL_INVALID = 0xFFFFFFFF;
    public static final int AL_NONE = 0x0;
    public static final int AL_FALSE = 0x0;
    public static final int AL_TRUE = 0x1;
    public static final int AL_SOURCE_TYPE = 0x1027;
    public static final int AL_SOURCE_ABSOLUTE = 0x201;
    public static final int AL_SOURCE_RELATIVE = 0x202;
    public static final int AL_CONE_INNER_ANGLE = 0x1001;
    public static final int AL_CONE_OUTER_ANGLE = 0x1002;
    public static final int AL_PITCH = 0x1003;
    public static final int AL_POSITION = 0x1004;
    public static final int AL_DIRECTION = 0x1005;
    public static final int AL_VELOCITY = 0x1006;
    public static final int AL_LOOPING = 0x1007;
    public static final int AL_BUFFER = 0x1009;
    public static final int AL_GAIN = 0x100A;
    public static final int AL_MIN_GAIN = 0x100D;
    public static final int AL_MAX_GAIN = 0x100E;
    public static final int AL_ORIENTATION = 0x100F;
    public static final int AL_REFERENCE_DISTANCE = 0x1020;
    public static final int AL_ROLLOFF_FACTOR = 0x1021;
    public static final int AL_CONE_OUTER_GAIN = 0x1022;
    public static final int AL_MAX_DISTANCE = 0x1023;
    public static final int AL_CHANNEL_MASK = 0x3000;
    public static final int AL_SOURCE_STATE = 0x1010;
    public static final int AL_INITIAL = 0x1011;
    public static final int AL_PLAYING = 0x1012;
    public static final int AL_PAUSED = 0x1013;
    public static final int AL_STOPPED = 0x1014;
    public static final int AL_BUFFERS_QUEUED = 0x1015;
    public static final int AL_BUFFERS_PROCESSED = 0x1016;
    public static final int AL_FORMAT_MONO8 = 0x1100;
    public static final int AL_FORMAT_MONO16 = 0x1101;
    public static final int AL_FORMAT_STEREO8 = 0x1102;
    public static final int AL_FORMAT_STEREO16 = 0x1103;
    public static final int AL_FORMAT_VORBIS_EXT = 0x10003;
    public static final int AL_FREQUENCY = 0x2001;
    public static final int AL_BITS = 0x2002;
    public static final int AL_CHANNELS = 0x2003;
    public static final int AL_SIZE = 0x2004;
    public static final int AL_DATA = 0x2005;
    public static final int AL_UNUSED = 0x2010;
    public static final int AL_NO_ERROR = 0x0;
    public static final int AL_INVALID_NAME = 0xA001;
    public static final int AL_INVALID_ENUM = 0xA002;
    public static final int AL_INVALID_VALUE = 0xA003;
    public static final int AL_INVALID_OPERATION = 0xA004;
    public static final int AL_OUT_OF_MEMORY = 0xA005;
    public static final int AL_VENDOR = 0xB001;
    public static final int AL_VERSION = 0xB002;
    public static final int AL_RENDERER = 0xB003;
    public static final int AL_EXTENSIONS = 0xB004;
    public static final int AL_DOPPLER_FACTOR = 0xC000;
    public static final int AL_DOPPLER_VELOCITY = 0xC001;
    public static final int AL_DISTANCE_MODEL = 0xD000;
    public static final int AL_INVERSE_DISTANCE = 0xD001;
    public static final int AL_INVERSE_DISTANCE_CLAMPED = 0xD002;

    private AL10() {}

    public static void alEnable(int capability) {
        org.lwjgl.openal.AL10.alEnable(capability);
    }

    public static void alDisable(int capability) {
        org.lwjgl.openal.AL10.alDisable(capability);
    }

    public static boolean alIsEnabled(int capability) {
        return org.lwjgl.openal.AL10.alIsEnabled(capability);
    }

    public static boolean alGetBoolean(int pname) {
        return org.lwjgl.openal.AL10.alGetBoolean(pname);
    }

    public static int alGetInteger(int pname) {
        return org.lwjgl.openal.AL10.alGetInteger(pname);
    }

    public static float alGetFloat(int pname) {
        return org.lwjgl.openal.AL10.alGetFloat(pname);
    }

    public static double alGetDouble(int pname) {
        return org.lwjgl.openal.AL10.alGetDouble(pname);
    }

    public static void alGetInteger(int pname, IntBuffer data) {
        org.lwjgl.openal.AL10.alGetIntegerv(pname, data);
    }

    public static void alGetFloat(int pname, FloatBuffer data) {
        org.lwjgl.openal.AL10.alGetFloatv(pname, data);
    }

    public static void alGetDouble(int pname, DoubleBuffer data) {
        org.lwjgl.openal.AL10.alGetDoublev(pname, data);
    }

    public static String alGetString(int pname) {
        return org.lwjgl.openal.AL10.alGetString(pname);
    }

    public static int alGetError() {
        return org.lwjgl.openal.AL10.alGetError();
    }

    public static boolean alIsExtensionPresent(String fname) {
        return org.lwjgl.openal.AL10.alIsExtensionPresent(fname);
    }

    public static int alGetEnumValue(String ename) {
        return org.lwjgl.openal.AL10.alGetEnumValue(ename);
    }

    public static void alListeneri(int pname, int value) {
        org.lwjgl.openal.AL10.alListeneri(pname, value);
    }

    public static void alListenerf(int pname, float value) {
        org.lwjgl.openal.AL10.alListenerf(pname, value);
    }

    public static void alListener(int pname, FloatBuffer value) {
        org.lwjgl.openal.AL10.alListenerfv(pname, value);
    }

    public static void alListener3f(int pname, float v1, float v2, float v3) {
        org.lwjgl.openal.AL10.alListener3f(pname, v1, v2, v3);
    }

    public static int alGetListeneri(int pname) {
        return org.lwjgl.openal.AL10.alGetListeneri(pname);
    }

    public static float alGetListenerf(int pname) {
        return org.lwjgl.openal.AL10.alGetListenerf(pname);
    }

    public static void alGetListener(int pname, FloatBuffer floatdata) {
        org.lwjgl.openal.AL10.alGetListenerfv(pname, floatdata);
    }

    public static void alGenSources(IntBuffer sources) {
        org.lwjgl.openal.AL10.alGenSources(sources);
    }

    public static int alGenSources() {
        return org.lwjgl.openal.AL10.alGenSources();
    }

    public static void alDeleteSources(IntBuffer sources) {
        org.lwjgl.openal.AL10.alDeleteSources(sources);
    }

    public static void alDeleteSources(int source) {
        org.lwjgl.openal.AL10.alDeleteSources(source);
    }

    public static boolean alIsSource(int id) {
        return org.lwjgl.openal.AL10.alIsSource(id);
    }

    public static void alSourcei(int source, int pname, int value) {
        org.lwjgl.openal.AL10.alSourcei(source, pname, value);
    }

    public static void alSourcef(int source, int pname, float value) {
        org.lwjgl.openal.AL10.alSourcef(source, pname, value);
    }

    public static void alSource(int source, int pname, FloatBuffer value) {
        org.lwjgl.openal.AL10.alSourcefv(source, pname, value);
    }

    public static void alSource3f(int source, int pname, float v1, float v2, float v3) {
        org.lwjgl.openal.AL10.alSource3f(source, pname, v1, v2, v3);
    }

    public static int alGetSourcei(int source, int pname) {
        return org.lwjgl.openal.AL10.alGetSourcei(source, pname);
    }

    public static float alGetSourcef(int source, int pname) {
        return org.lwjgl.openal.AL10.alGetSourcef(source, pname);
    }

    public static void alGetSource(int source, int pname, FloatBuffer floatdata) {
        org.lwjgl.openal.AL10.alGetSourcefv(source, pname, floatdata);
    }

    public static void alSourcePlay(IntBuffer sources) {
        org.lwjgl.openal.AL10.alSourcePlayv(sources);
    }

    public static void alSourcePause(IntBuffer sources) {
        org.lwjgl.openal.AL10.alSourcePausev(sources);
    }

    public static void alSourceStop(IntBuffer sources) {
        org.lwjgl.openal.AL10.alSourceStopv(sources);
    }

    public static void alSourceRewind(IntBuffer sources) {
        org.lwjgl.openal.AL10.alSourceRewindv(sources);
    }

    public static void alSourcePlay(int source) {
        org.lwjgl.openal.AL10.alSourcePlay(source);
    }

    public static void alSourcePause(int source) {
        org.lwjgl.openal.AL10.alSourcePause(source);
    }

    public static void alSourceStop(int source) {
        org.lwjgl.openal.AL10.alSourceStop(source);
    }

    public static void alSourceRewind(int source) {
        org.lwjgl.openal.AL10.alSourceRewind(source);
    }

    public static void alGenBuffers(IntBuffer buffers) {
        org.lwjgl.openal.AL10.alGenBuffers(buffers);
    }

    public static int alGenBuffers() {
        return org.lwjgl.openal.AL10.alGenBuffers();
    }

    public static void alDeleteBuffers(IntBuffer buffers) {
        org.lwjgl.openal.AL10.alDeleteBuffers(buffers);
    }

    public static void alDeleteBuffers(int buffer) {
        org.lwjgl.openal.AL10.alDeleteBuffers(buffer);
    }

    public static boolean alIsBuffer(int buffer) {
        return org.lwjgl.openal.AL10.alIsBuffer(buffer);
    }

    public static void alBufferData(int buffer, int format, ByteBuffer data, int freq) {
        org.lwjgl.openal.AL10.alBufferData(buffer, format, data, freq);
    }

    public static void alBufferData(int buffer, int format, IntBuffer data, int freq) {
        org.lwjgl.openal.AL10.alBufferData(buffer, format, data, freq);
    }

    public static void alBufferData(int buffer, int format, ShortBuffer data, int freq) {
        org.lwjgl.openal.AL10.alBufferData(buffer, format, data, freq);
    }

    public static int alGetBufferi(int buffer, int pname) {
        return org.lwjgl.openal.AL10.alGetBufferi(buffer, pname);
    }

    public static float alGetBufferf(int buffer, int pname) {
        return org.lwjgl.openal.AL10.alGetBufferf(buffer, pname);
    }

    public static void alSourceQueueBuffers(int source, IntBuffer buffers) {
        org.lwjgl.openal.AL10.alSourceQueueBuffers(source, buffers);
    }

    public static void alSourceQueueBuffers(int source, int buffer) {
        org.lwjgl.openal.AL10.alSourceQueueBuffers(source, buffer);
    }

    public static void alSourceUnqueueBuffers(int source, IntBuffer buffers) {
        org.lwjgl.openal.AL10.alSourceUnqueueBuffers(source, buffers);
    }

    public static int alSourceUnqueueBuffers(int source) {
        return org.lwjgl.openal.AL10.alSourceUnqueueBuffers(source);
    }

    public static void alDistanceModel(int value) {
        org.lwjgl.openal.AL10.alDistanceModel(value);
    }

    public static void alDopplerFactor(float value) {
        org.lwjgl.openal.AL10.alDopplerFactor(value);
    }

    public static void alDopplerVelocity(float value) {
        org.lwjgl.openal.AL10.alDopplerVelocity(value);
    }
}
