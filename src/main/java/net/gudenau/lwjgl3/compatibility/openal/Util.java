package net.gudenau.lwjgl3.compatibility.openal;

/**
 * Created by gudenau on 6/1/2017.
 * <p>
 * LWJGL3
 */
@SuppressWarnings({"WeakerAccess", "unused", "SpellCheckingInspection"})
public class Util{
    private Util() {}

    public static void checkALCError(ALCdevice device) {
        int err = ALC10.alcGetError(device);
        if (err != ALC10.ALC_NO_ERROR){
            throw new OpenALException(ALC10.alcGetString(AL.getDevice(), err));
        }
    }

    public static void checkALError() {
        int err = AL10.alGetError();
        if (err != AL10.AL_NO_ERROR)
            throw new OpenALException(err);
    }

    public static void checkALCValidDevice(ALCdevice device) {
        if(!device.isValid()) {
            throw new OpenALException("Invalid device: " + device);
        }
    }

    public static void checkALCValidContext(ALCcontext context) {
        if(!context.isValid()) {
            throw new OpenALException("Invalid context: " + context);
        }
    }
}
