package net.gudenau.lwjgl3.compatibility.openal;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;

@SuppressWarnings({"unused", "WeakerAccess", "SpellCheckingInspection"})
public class EFX10{
    public static final java.lang.String ALC_EXT_EFX_NAME = "ALC_EXT_EFX";
    public static final int ALC_EFX_MAJOR_VERSION = 0x20001;
    public static final int ALC_EFX_MINOR_VERSION = 0x20002;
    public static final int ALC_MAX_AUXILIARY_SENDS = 0x20003;
    public static final int AL_METERS_PER_UNIT = 0x20004;
    public static final int AL_DIRECT_FILTER = 0x20005;
    public static final int AL_AUXILIARY_SEND_FILTER = 0x20006;
    public static final int AL_AIR_ABSORPTION_FACTOR = 0x20007;
    public static final int AL_ROOM_ROLLOFF_FACTOR = 0x20008;
    public static final int AL_CONE_OUTER_GAINHF = 0x20009;
    public static final int AL_DIRECT_FILTER_GAINHF_AUTO = 0x2000A;
    public static final int AL_AUXILIARY_SEND_FILTER_GAIN_AUTO = 0x2000B;
    public static final int AL_AUXILIARY_SEND_FILTER_GAINHF_AUTO = 0x2000C;
    public static final int AL_EFFECTSLOT_EFFECT = 0x1;
    public static final int AL_EFFECTSLOT_GAIN = 0x2;
    public static final int AL_EFFECTSLOT_AUXILIARY_SEND_AUTO = 0x3;
    public static final int AL_EFFECTSLOT_NULL = 0x0;
    public static final int AL_REVERB_DENSITY = 0x1;
    public static final int AL_REVERB_DIFFUSION = 0x2;
    public static final int AL_REVERB_GAIN = 0x3;
    public static final int AL_REVERB_GAINHF = 0x4;
    public static final int AL_REVERB_DECAY_TIME = 0x5;
    public static final int AL_REVERB_DECAY_HFRATIO = 0x6;
    public static final int AL_REVERB_REFLECTIONS_GAIN = 0x7;
    public static final int AL_REVERB_REFLECTIONS_DELAY = 0x8;
    public static final int AL_REVERB_LATE_REVERB_GAIN = 0x9;
    public static final int AL_REVERB_LATE_REVERB_DELAY = 0xA;
    public static final int AL_REVERB_AIR_ABSORPTION_GAINHF = 0xB;
    public static final int AL_REVERB_ROOM_ROLLOFF_FACTOR = 0xC;
    public static final int AL_REVERB_DECAY_HFLIMIT = 0xD;
    public static final int AL_EAXREVERB_DENSITY = 0x1;
    public static final int AL_EAXREVERB_DIFFUSION = 0x2;
    public static final int AL_EAXREVERB_GAIN = 0x3;
    public static final int AL_EAXREVERB_GAINHF = 0x4;
    public static final int AL_EAXREVERB_GAINLF = 0x5;
    public static final int AL_EAXREVERB_DECAY_TIME = 0x6;
    public static final int AL_EAXREVERB_DECAY_HFRATIO = 0x7;
    public static final int AL_EAXREVERB_DECAY_LFRATIO = 0x8;
    public static final int AL_EAXREVERB_REFLECTIONS_GAIN = 0x9;
    public static final int AL_EAXREVERB_REFLECTIONS_DELAY = 0xA;
    public static final int AL_EAXREVERB_REFLECTIONS_PAN = 0xB;
    public static final int AL_EAXREVERB_LATE_REVERB_GAIN = 0xC;
    public static final int AL_EAXREVERB_LATE_REVERB_DELAY = 0xD;
    public static final int AL_EAXREVERB_LATE_REVERB_PAN = 0xE;
    public static final int AL_EAXREVERB_ECHO_TIME = 0xF;
    public static final int AL_EAXREVERB_ECHO_DEPTH = 0x10;
    public static final int AL_EAXREVERB_MODULATION_TIME = 0x11;
    public static final int AL_EAXREVERB_MODULATION_DEPTH = 0x12;
    public static final int AL_EAXREVERB_AIR_ABSORPTION_GAINHF = 0x13;
    public static final int AL_EAXREVERB_HFREFERENCE = 0x14;
    public static final int AL_EAXREVERB_LFREFERENCE = 0x15;
    public static final int AL_EAXREVERB_ROOM_ROLLOFF_FACTOR = 0x16;
    public static final int AL_EAXREVERB_DECAY_HFLIMIT = 0x17;
    public static final int AL_CHORUS_WAVEFORM = 0x1;
    public static final int AL_CHORUS_PHASE = 0x2;
    public static final int AL_CHORUS_RATE = 0x3;
    public static final int AL_CHORUS_DEPTH = 0x4;
    public static final int AL_CHORUS_FEEDBACK = 0x5;
    public static final int AL_CHORUS_DELAY = 0x6;
    public static final int AL_DISTORTION_EDGE = 0x1;
    public static final int AL_DISTORTION_GAIN = 0x2;
    public static final int AL_DISTORTION_LOWPASS_CUTOFF = 0x3;
    public static final int AL_DISTORTION_EQCENTER = 0x4;
    public static final int AL_DISTORTION_EQBANDWIDTH = 0x5;
    public static final int AL_ECHO_DELAY = 0x1;
    public static final int AL_ECHO_LRDELAY = 0x2;
    public static final int AL_ECHO_DAMPING = 0x3;
    public static final int AL_ECHO_FEEDBACK = 0x4;
    public static final int AL_ECHO_SPREAD = 0x5;
    public static final int AL_FLANGER_WAVEFORM = 0x1;
    public static final int AL_FLANGER_PHASE = 0x2;
    public static final int AL_FLANGER_RATE = 0x3;
    public static final int AL_FLANGER_DEPTH = 0x4;
    public static final int AL_FLANGER_FEEDBACK = 0x5;
    public static final int AL_FLANGER_DELAY = 0x6;
    public static final int AL_FREQUENCY_SHIFTER_FREQUENCY = 0x1;
    public static final int AL_FREQUENCY_SHIFTER_LEFT_DIRECTION = 0x2;
    public static final int AL_FREQUENCY_SHIFTER_RIGHT_DIRECTION = 0x3;
    public static final int AL_VOCAL_MORPHER_PHONEMEA = 0x1;
    public static final int AL_VOCAL_MORPHER_PHONEMEA_COARSE_TUNING = 0x2;
    public static final int AL_VOCAL_MORPHER_PHONEMEB = 0x3;
    public static final int AL_VOCAL_MORPHER_PHONEMEB_COARSE_TUNING = 0x4;
    public static final int AL_VOCAL_MORPHER_WAVEFORM = 0x5;
    public static final int AL_VOCAL_MORPHER_RATE = 0x6;
    public static final int AL_PITCH_SHIFTER_COARSE_TUNE = 0x1;
    public static final int AL_PITCH_SHIFTER_FINE_TUNE = 0x2;
    public static final int AL_RING_MODULATOR_FREQUENCY = 0x1;
    public static final int AL_RING_MODULATOR_HIGHPASS_CUTOFF = 0x2;
    public static final int AL_RING_MODULATOR_WAVEFORM = 0x3;
    public static final int AL_AUTOWAH_ATTACK_TIME = 0x1;
    public static final int AL_AUTOWAH_RELEASE_TIME = 0x2;
    public static final int AL_AUTOWAH_RESONANCE = 0x3;
    public static final int AL_AUTOWAH_PEAK_GAIN = 0x4;
    public static final int AL_COMPRESSOR_ONOFF = 0x1;
    public static final int AL_EQUALIZER_LOW_GAIN = 0x1;
    public static final int AL_EQUALIZER_LOW_CUTOFF = 0x2;
    public static final int AL_EQUALIZER_MID1_GAIN = 0x3;
    public static final int AL_EQUALIZER_MID1_CENTER = 0x4;
    public static final int AL_EQUALIZER_MID1_WIDTH = 0x5;
    public static final int AL_EQUALIZER_MID2_GAIN = 0x6;
    public static final int AL_EQUALIZER_MID2_CENTER = 0x7;
    public static final int AL_EQUALIZER_MID2_WIDTH = 0x8;
    public static final int AL_EQUALIZER_HIGH_GAIN = 0x9;
    public static final int AL_EQUALIZER_HIGH_CUTOFF = 0xA;
    public static final int AL_EFFECT_FIRST_PARAMETER = 0x0;
    public static final int AL_EFFECT_LAST_PARAMETER = 0x8000;
    public static final int AL_EFFECT_TYPE = 0x8001;
    public static final int AL_EFFECT_NULL = 0x0;
    public static final int AL_EFFECT_REVERB = 0x1;
    public static final int AL_EFFECT_CHORUS = 0x2;
    public static final int AL_EFFECT_DISTORTION = 0x3;
    public static final int AL_EFFECT_ECHO = 0x4;
    public static final int AL_EFFECT_FLANGER = 0x5;
    public static final int AL_EFFECT_FREQUENCY_SHIFTER = 0x6;
    public static final int AL_EFFECT_VOCAL_MORPHER = 0x7;
    public static final int AL_EFFECT_PITCH_SHIFTER = 0x8;
    public static final int AL_EFFECT_RING_MODULATOR = 0x9;
    public static final int AL_EFFECT_AUTOWAH = 0xA;
    public static final int AL_EFFECT_COMPRESSOR = 0xB;
    public static final int AL_EFFECT_EQUALIZER = 0xC;
    public static final int AL_EFFECT_EAXREVERB = 0x8000;
    public static final int AL_LOWPASS_GAIN = 0x1;
    public static final int AL_LOWPASS_GAINHF = 0x2;
    public static final int AL_HIGHPASS_GAIN = 0x1;
    public static final int AL_HIGHPASS_GAINLF = 0x2;
    public static final int AL_BANDPASS_GAIN = 0x1;
    public static final int AL_BANDPASS_GAINLF = 0x2;
    public static final int AL_BANDPASS_GAINHF = 0x3;
    public static final int AL_FILTER_FIRST_PARAMETER = 0x0;
    public static final int AL_FILTER_LAST_PARAMETER = 0x8000;
    public static final int AL_FILTER_TYPE = 0x8001;
    public static final int AL_FILTER_NULL = 0x0;
    public static final int AL_FILTER_LOWPASS = 0x1;
    public static final int AL_FILTER_HIGHPASS = 0x2;
    public static final int AL_FILTER_BANDPASS = 0x3;
    public static final float AL_MIN_AIR_ABSORPTION_FACTOR = 0.0f;
    public static final float AL_MAX_AIR_ABSORPTION_FACTOR = 10.0f;
    public static final float AL_DEFAULT_AIR_ABSORPTION_FACTOR = 0.0f;
    public static final float AL_MIN_ROOM_ROLLOFF_FACTOR = 0.0f;
    public static final float AL_MAX_ROOM_ROLLOFF_FACTOR = 10.0f;
    public static final float AL_DEFAULT_ROOM_ROLLOFF_FACTOR = 0.0f;
    public static final float AL_MIN_CONE_OUTER_GAINHF = 0.0f;
    public static final float AL_MAX_CONE_OUTER_GAINHF = 1.0f;
    public static final float AL_DEFAULT_CONE_OUTER_GAINHF = 1.0f;
    public static final int AL_MIN_DIRECT_FILTER_GAINHF_AUTO = 0x0;
    public static final int AL_MAX_DIRECT_FILTER_GAINHF_AUTO = 0x1;
    public static final int AL_DEFAULT_DIRECT_FILTER_GAINHF_AUTO = 0x1;
    public static final int AL_MIN_AUXILIARY_SEND_FILTER_GAIN_AUTO = 0x0;
    public static final int AL_MAX_AUXILIARY_SEND_FILTER_GAIN_AUTO = 0x1;
    public static final int AL_DEFAULT_AUXILIARY_SEND_FILTER_GAIN_AUTO = 0x1;
    public static final int AL_MIN_AUXILIARY_SEND_FILTER_GAINHF_AUTO = 0x0;
    public static final int AL_MAX_AUXILIARY_SEND_FILTER_GAINHF_AUTO = 0x1;
    public static final int AL_DEFAULT_AUXILIARY_SEND_FILTER_GAINHF_AUTO = 0x1;
    public static final float AL_MIN_METERS_PER_UNIT = 1.4E-45f;
    public static final float AL_MAX_METERS_PER_UNIT = 3.4028235E38f;
    public static final float AL_DEFAULT_METERS_PER_UNIT = 1.0f;
    public static final float AL_REVERB_MIN_DENSITY = 0.0f;
    public static final float AL_REVERB_MAX_DENSITY = 1.0f;
    public static final float AL_REVERB_DEFAULT_DENSITY = 1.0f;
    public static final float AL_REVERB_MIN_DIFFUSION = 0.0f;
    public static final float AL_REVERB_MAX_DIFFUSION = 1.0f;
    public static final float AL_REVERB_DEFAULT_DIFFUSION = 1.0f;
    public static final float AL_REVERB_MIN_GAIN = 0.0f;
    public static final float AL_REVERB_MAX_GAIN = 1.0f;
    public static final float AL_REVERB_DEFAULT_GAIN = 0.32f;
    public static final float AL_REVERB_MIN_GAINHF = 0.0f;
    public static final float AL_REVERB_MAX_GAINHF = 1.0f;
    public static final float AL_REVERB_DEFAULT_GAINHF = 0.89f;
    public static final float AL_REVERB_MIN_DECAY_TIME = 0.1f;
    public static final float AL_REVERB_MAX_DECAY_TIME = 20.0f;
    public static final float AL_REVERB_DEFAULT_DECAY_TIME = 1.49f;
    public static final float AL_REVERB_MIN_DECAY_HFRATIO = 0.1f;
    public static final float AL_REVERB_MAX_DECAY_HFRATIO = 2.0f;
    public static final float AL_REVERB_DEFAULT_DECAY_HFRATIO = 0.83f;
    public static final float AL_REVERB_MIN_REFLECTIONS_GAIN = 0.0f;
    public static final float AL_REVERB_MAX_REFLECTIONS_GAIN = 3.16f;
    public static final float AL_REVERB_DEFAULT_REFLECTIONS_GAIN = 0.05f;
    public static final float AL_REVERB_MIN_REFLECTIONS_DELAY = 0.0f;
    public static final float AL_REVERB_MAX_REFLECTIONS_DELAY = 0.3f;
    public static final float AL_REVERB_DEFAULT_REFLECTIONS_DELAY = 0.0070f;
    public static final float AL_REVERB_MIN_LATE_REVERB_GAIN = 0.0f;
    public static final float AL_REVERB_MAX_LATE_REVERB_GAIN = 10.0f;
    public static final float AL_REVERB_DEFAULT_LATE_REVERB_GAIN = 1.26f;
    public static final float AL_REVERB_MIN_LATE_REVERB_DELAY = 0.0f;
    public static final float AL_REVERB_MAX_LATE_REVERB_DELAY = 0.1f;
    public static final float AL_REVERB_DEFAULT_LATE_REVERB_DELAY = 0.011f;
    public static final float AL_REVERB_MIN_AIR_ABSORPTION_GAINHF = 0.892f;
    public static final float AL_REVERB_MAX_AIR_ABSORPTION_GAINHF = 1.0f;
    public static final float AL_REVERB_DEFAULT_AIR_ABSORPTION_GAINHF = 0.994f;
    public static final float AL_REVERB_MIN_ROOM_ROLLOFF_FACTOR = 0.0f;
    public static final float AL_REVERB_MAX_ROOM_ROLLOFF_FACTOR = 10.0f;
    public static final float AL_REVERB_DEFAULT_ROOM_ROLLOFF_FACTOR = 0.0f;
    public static final int AL_REVERB_MIN_DECAY_HFLIMIT = 0x0;
    public static final int AL_REVERB_MAX_DECAY_HFLIMIT = 0x1;
    public static final int AL_REVERB_DEFAULT_DECAY_HFLIMIT = 0x1;
    public static final float AL_EAXREVERB_MIN_DENSITY = 0.0f;
    public static final float AL_EAXREVERB_MAX_DENSITY = 1.0f;
    public static final float AL_EAXREVERB_DEFAULT_DENSITY = 1.0f;
    public static final float AL_EAXREVERB_MIN_DIFFUSION = 0.0f;
    public static final float AL_EAXREVERB_MAX_DIFFUSION = 1.0f;
    public static final float AL_EAXREVERB_DEFAULT_DIFFUSION = 1.0f;
    public static final float AL_EAXREVERB_MIN_GAIN = 0.0f;
    public static final float AL_EAXREVERB_MAX_GAIN = 1.0f;
    public static final float AL_EAXREVERB_DEFAULT_GAIN = 0.32f;
    public static final float AL_EAXREVERB_MIN_GAINHF = 0.0f;
    public static final float AL_EAXREVERB_MAX_GAINHF = 1.0f;
    public static final float AL_EAXREVERB_DEFAULT_GAINHF = 0.89f;
    public static final float AL_EAXREVERB_MIN_GAINLF = 0.0f;
    public static final float AL_EAXREVERB_MAX_GAINLF = 1.0f;
    public static final float AL_EAXREVERB_DEFAULT_GAINLF = 1.0f;
    public static final float AL_EAXREVERB_MIN_DECAY_TIME = 0.1f;
    public static final float AL_EAXREVERB_MAX_DECAY_TIME = 20.0f;
    public static final float AL_EAXREVERB_DEFAULT_DECAY_TIME = 1.49f;
    public static final float AL_EAXREVERB_MIN_DECAY_HFRATIO = 0.1f;
    public static final float AL_EAXREVERB_MAX_DECAY_HFRATIO = 2.0f;
    public static final float AL_EAXREVERB_DEFAULT_DECAY_HFRATIO = 0.83f;
    public static final float AL_EAXREVERB_MIN_DECAY_LFRATIO = 0.1f;
    public static final float AL_EAXREVERB_MAX_DECAY_LFRATIO = 2.0f;
    public static final float AL_EAXREVERB_DEFAULT_DECAY_LFRATIO = 1.0f;
    public static final float AL_EAXREVERB_MIN_REFLECTIONS_GAIN = 0.0f;
    public static final float AL_EAXREVERB_MAX_REFLECTIONS_GAIN = 3.16f;
    public static final float AL_EAXREVERB_DEFAULT_REFLECTIONS_GAIN = 0.05f;
    public static final float AL_EAXREVERB_MIN_REFLECTIONS_DELAY = 0.0f;
    public static final float AL_EAXREVERB_MAX_REFLECTIONS_DELAY = 0.3f;
    public static final float AL_EAXREVERB_DEFAULT_REFLECTIONS_DELAY = 0.0070f;
    public static final float AL_EAXREVERB_DEFAULT_REFLECTIONS_PAN_XYZ = 0.0f;
    public static final float AL_EAXREVERB_MIN_LATE_REVERB_GAIN = 0.0f;
    public static final float AL_EAXREVERB_MAX_LATE_REVERB_GAIN = 10.0f;
    public static final float AL_EAXREVERB_DEFAULT_LATE_REVERB_GAIN = 1.26f;
    public static final float AL_EAXREVERB_MIN_LATE_REVERB_DELAY = 0.0f;
    public static final float AL_EAXREVERB_MAX_LATE_REVERB_DELAY = 0.1f;
    public static final float AL_EAXREVERB_DEFAULT_LATE_REVERB_DELAY = 0.011f;
    public static final float AL_EAXREVERB_DEFAULT_LATE_REVERB_PAN_XYZ = 0.0f;
    public static final float AL_EAXREVERB_MIN_ECHO_TIME = 0.075f;
    public static final float AL_EAXREVERB_MAX_ECHO_TIME = 0.25f;
    public static final float AL_EAXREVERB_DEFAULT_ECHO_TIME = 0.25f;
    public static final float AL_EAXREVERB_MIN_ECHO_DEPTH = 0.0f;
    public static final float AL_EAXREVERB_MAX_ECHO_DEPTH = 1.0f;
    public static final float AL_EAXREVERB_DEFAULT_ECHO_DEPTH = 0.0f;
    public static final float AL_EAXREVERB_MIN_MODULATION_TIME = 0.04f;
    public static final float AL_EAXREVERB_MAX_MODULATION_TIME = 4.0f;
    public static final float AL_EAXREVERB_DEFAULT_MODULATION_TIME = 0.25f;
    public static final float AL_EAXREVERB_MIN_MODULATION_DEPTH = 0.0f;
    public static final float AL_EAXREVERB_MAX_MODULATION_DEPTH = 1.0f;
    public static final float AL_EAXREVERB_DEFAULT_MODULATION_DEPTH = 0.0f;
    public static final float AL_EAXREVERB_MIN_AIR_ABSORPTION_GAINHF = 0.892f;
    public static final float AL_EAXREVERB_MAX_AIR_ABSORPTION_GAINHF = 1.0f;
    public static final float AL_EAXREVERB_DEFAULT_AIR_ABSORPTION_GAINHF = 0.994f;
    public static final float AL_EAXREVERB_MIN_HFREFERENCE = 1000.0f;
    public static final float AL_EAXREVERB_MAX_HFREFERENCE = 20000.0f;
    public static final float AL_EAXREVERB_DEFAULT_HFREFERENCE = 5000.0f;
    public static final float AL_EAXREVERB_MIN_LFREFERENCE = 20.0f;
    public static final float AL_EAXREVERB_MAX_LFREFERENCE = 1000.0f;
    public static final float AL_EAXREVERB_DEFAULT_LFREFERENCE = 250.0f;
    public static final float AL_EAXREVERB_MIN_ROOM_ROLLOFF_FACTOR = 0.0f;
    public static final float AL_EAXREVERB_MAX_ROOM_ROLLOFF_FACTOR = 10.0f;
    public static final float AL_EAXREVERB_DEFAULT_ROOM_ROLLOFF_FACTOR = 0.0f;
    public static final int AL_EAXREVERB_MIN_DECAY_HFLIMIT = 0x0;
    public static final int AL_EAXREVERB_MAX_DECAY_HFLIMIT = 0x1;
    public static final int AL_EAXREVERB_DEFAULT_DECAY_HFLIMIT = 0x1;
    public static final int AL_CHORUS_WAVEFORM_SINUSOID = 0x0;
    public static final int AL_CHORUS_WAVEFORM_TRIANGLE = 0x1;
    public static final int AL_CHORUS_MIN_WAVEFORM = 0x0;
    public static final int AL_CHORUS_MAX_WAVEFORM = 0x1;
    public static final int AL_CHORUS_DEFAULT_WAVEFORM = 0x1;
    public static final int AL_CHORUS_MIN_PHASE = 0xFFFFFF4C;
    public static final int AL_CHORUS_MAX_PHASE = 0xB4;
    public static final int AL_CHORUS_DEFAULT_PHASE = 0x5A;
    public static final float AL_CHORUS_MIN_RATE = 0.0f;
    public static final float AL_CHORUS_MAX_RATE = 10.0f;
    public static final float AL_CHORUS_DEFAULT_RATE = 1.1f;
    public static final float AL_CHORUS_MIN_DEPTH = 0.0f;
    public static final float AL_CHORUS_MAX_DEPTH = 1.0f;
    public static final float AL_CHORUS_DEFAULT_DEPTH = 0.1f;
    public static final float AL_CHORUS_MIN_FEEDBACK = -1.0f;
    public static final float AL_CHORUS_MAX_FEEDBACK = 1.0f;
    public static final float AL_CHORUS_DEFAULT_FEEDBACK = 0.25f;
    public static final float AL_CHORUS_MIN_DELAY = 0.0f;
    public static final float AL_CHORUS_MAX_DELAY = 0.016f;
    public static final float AL_CHORUS_DEFAULT_DELAY = 0.016f;
    public static final float AL_DISTORTION_MIN_EDGE = 0.0f;
    public static final float AL_DISTORTION_MAX_EDGE = 1.0f;
    public static final float AL_DISTORTION_DEFAULT_EDGE = 0.2f;
    public static final float AL_DISTORTION_MIN_GAIN = 0.01f;
    public static final float AL_DISTORTION_MAX_GAIN = 1.0f;
    public static final float AL_DISTORTION_DEFAULT_GAIN = 0.05f;
    public static final float AL_DISTORTION_MIN_LOWPASS_CUTOFF = 80.0f;
    public static final float AL_DISTORTION_MAX_LOWPASS_CUTOFF = 24000.0f;
    public static final float AL_DISTORTION_DEFAULT_LOWPASS_CUTOFF = 8000.0f;
    public static final float AL_DISTORTION_MIN_EQCENTER = 80.0f;
    public static final float AL_DISTORTION_MAX_EQCENTER = 24000.0f;
    public static final float AL_DISTORTION_DEFAULT_EQCENTER = 3600.0f;
    public static final float AL_DISTORTION_MIN_EQBANDWIDTH = 80.0f;
    public static final float AL_DISTORTION_MAX_EQBANDWIDTH = 24000.0f;
    public static final float AL_DISTORTION_DEFAULT_EQBANDWIDTH = 3600.0f;
    public static final float AL_ECHO_MIN_DELAY = 0.0f;
    public static final float AL_ECHO_MAX_DELAY = 0.207f;
    public static final float AL_ECHO_DEFAULT_DELAY = 0.1f;
    public static final float AL_ECHO_MIN_LRDELAY = 0.0f;
    public static final float AL_ECHO_MAX_LRDELAY = 0.404f;
    public static final float AL_ECHO_DEFAULT_LRDELAY = 0.1f;
    public static final float AL_ECHO_MIN_DAMPING = 0.0f;
    public static final float AL_ECHO_MAX_DAMPING = 0.99f;
    public static final float AL_ECHO_DEFAULT_DAMPING = 0.5f;
    public static final float AL_ECHO_MIN_FEEDBACK = 0.0f;
    public static final float AL_ECHO_MAX_FEEDBACK = 1.0f;
    public static final float AL_ECHO_DEFAULT_FEEDBACK = 0.5f;
    public static final float AL_ECHO_MIN_SPREAD = -1.0f;
    public static final float AL_ECHO_MAX_SPREAD = 1.0f;
    public static final float AL_ECHO_DEFAULT_SPREAD = -1.0f;
    public static final int AL_FLANGER_WAVEFORM_SINUSOID = 0x0;
    public static final int AL_FLANGER_WAVEFORM_TRIANGLE = 0x1;
    public static final int AL_FLANGER_MIN_WAVEFORM = 0x0;
    public static final int AL_FLANGER_MAX_WAVEFORM = 0x1;
    public static final int AL_FLANGER_DEFAULT_WAVEFORM = 0x1;
    public static final int AL_FLANGER_MIN_PHASE = 0xFFFFFF4C;
    public static final int AL_FLANGER_MAX_PHASE = 0xB4;
    public static final int AL_FLANGER_DEFAULT_PHASE = 0x0;
    public static final float AL_FLANGER_MIN_RATE = 0.0f;
    public static final float AL_FLANGER_MAX_RATE = 10.0f;
    public static final float AL_FLANGER_DEFAULT_RATE = 0.27f;
    public static final float AL_FLANGER_MIN_DEPTH = 0.0f;
    public static final float AL_FLANGER_MAX_DEPTH = 1.0f;
    public static final float AL_FLANGER_DEFAULT_DEPTH = 1.0f;
    public static final float AL_FLANGER_MIN_FEEDBACK = -1.0f;
    public static final float AL_FLANGER_MAX_FEEDBACK = 1.0f;
    public static final float AL_FLANGER_DEFAULT_FEEDBACK = -0.5f;
    public static final float AL_FLANGER_MIN_DELAY = 0.0f;
    public static final float AL_FLANGER_MAX_DELAY = 0.0040f;
    public static final float AL_FLANGER_DEFAULT_DELAY = 0.0020f;
    public static final float AL_FREQUENCY_SHIFTER_MIN_FREQUENCY = 0.0f;
    public static final float AL_FREQUENCY_SHIFTER_MAX_FREQUENCY = 24000.0f;
    public static final float AL_FREQUENCY_SHIFTER_DEFAULT_FREQUENCY = 0.0f;
    public static final int AL_FREQUENCY_SHIFTER_MIN_LEFT_DIRECTION = 0x0;
    public static final int AL_FREQUENCY_SHIFTER_MAX_LEFT_DIRECTION = 0x2;
    public static final int AL_FREQUENCY_SHIFTER_DEFAULT_LEFT_DIRECTION = 0x0;
    public static final int AL_FREQUENCY_SHIFTER_DIRECTION_DOWN = 0x0;
    public static final int AL_FREQUENCY_SHIFTER_DIRECTION_UP = 0x1;
    public static final int AL_FREQUENCY_SHIFTER_DIRECTION_OFF = 0x2;
    public static final int AL_FREQUENCY_SHIFTER_MIN_RIGHT_DIRECTION = 0x0;
    public static final int AL_FREQUENCY_SHIFTER_MAX_RIGHT_DIRECTION = 0x2;
    public static final int AL_FREQUENCY_SHIFTER_DEFAULT_RIGHT_DIRECTION = 0x0;
    public static final int AL_VOCAL_MORPHER_MIN_PHONEMEA = 0x0;
    public static final int AL_VOCAL_MORPHER_MAX_PHONEMEA = 0x1D;
    public static final int AL_VOCAL_MORPHER_DEFAULT_PHONEMEA = 0x0;
    public static final int AL_VOCAL_MORPHER_MIN_PHONEMEA_COARSE_TUNING = 0xFFFFFFE8;
    public static final int AL_VOCAL_MORPHER_MAX_PHONEMEA_COARSE_TUNING = 0x18;
    public static final int AL_VOCAL_MORPHER_DEFAULT_PHONEMEA_COARSE_TUNING = 0x0;
    public static final int AL_VOCAL_MORPHER_MIN_PHONEMEB = 0x0;
    public static final int AL_VOCAL_MORPHER_MAX_PHONEMEB = 0x1D;
    public static final int AL_VOCAL_MORPHER_DEFAULT_PHONEMEB = 0xA;
    public static final int AL_VOCAL_MORPHER_MIN_PHONEMEB_COARSE_TUNING = 0xFFFFFFE8;
    public static final int AL_VOCAL_MORPHER_MAX_PHONEMEB_COARSE_TUNING = 0x18;
    public static final int AL_VOCAL_MORPHER_DEFAULT_PHONEMEB_COARSE_TUNING = 0x0;
    public static final int AL_VOCAL_MORPHER_PHONEME_A = 0x0;
    public static final int AL_VOCAL_MORPHER_PHONEME_E = 0x1;
    public static final int AL_VOCAL_MORPHER_PHONEME_I = 0x2;
    public static final int AL_VOCAL_MORPHER_PHONEME_O = 0x3;
    public static final int AL_VOCAL_MORPHER_PHONEME_U = 0x4;
    public static final int AL_VOCAL_MORPHER_PHONEME_AA = 0x5;
    public static final int AL_VOCAL_MORPHER_PHONEME_AE = 0x6;
    public static final int AL_VOCAL_MORPHER_PHONEME_AH = 0x7;
    public static final int AL_VOCAL_MORPHER_PHONEME_AO = 0x8;
    public static final int AL_VOCAL_MORPHER_PHONEME_EH = 0x9;
    public static final int AL_VOCAL_MORPHER_PHONEME_ER = 0xA;
    public static final int AL_VOCAL_MORPHER_PHONEME_IH = 0xB;
    public static final int AL_VOCAL_MORPHER_PHONEME_IY = 0xC;
    public static final int AL_VOCAL_MORPHER_PHONEME_UH = 0xD;
    public static final int AL_VOCAL_MORPHER_PHONEME_UW = 0xE;
    public static final int AL_VOCAL_MORPHER_PHONEME_B = 0xF;
    public static final int AL_VOCAL_MORPHER_PHONEME_D = 0x10;
    public static final int AL_VOCAL_MORPHER_PHONEME_F = 0x11;
    public static final int AL_VOCAL_MORPHER_PHONEME_G = 0x12;
    public static final int AL_VOCAL_MORPHER_PHONEME_J = 0x13;
    public static final int AL_VOCAL_MORPHER_PHONEME_K = 0x14;
    public static final int AL_VOCAL_MORPHER_PHONEME_L = 0x15;
    public static final int AL_VOCAL_MORPHER_PHONEME_M = 0x16;
    public static final int AL_VOCAL_MORPHER_PHONEME_N = 0x17;
    public static final int AL_VOCAL_MORPHER_PHONEME_P = 0x18;
    public static final int AL_VOCAL_MORPHER_PHONEME_R = 0x19;
    public static final int AL_VOCAL_MORPHER_PHONEME_S = 0x1A;
    public static final int AL_VOCAL_MORPHER_PHONEME_T = 0x1B;
    public static final int AL_VOCAL_MORPHER_PHONEME_V = 0x1C;
    public static final int AL_VOCAL_MORPHER_PHONEME_Z = 0x1D;
    public static final int AL_VOCAL_MORPHER_WAVEFORM_SINUSOID = 0x0;
    public static final int AL_VOCAL_MORPHER_WAVEFORM_TRIANGLE = 0x1;
    public static final int AL_VOCAL_MORPHER_WAVEFORM_SAWTOOTH = 0x2;
    public static final int AL_VOCAL_MORPHER_MIN_WAVEFORM = 0x0;
    public static final int AL_VOCAL_MORPHER_MAX_WAVEFORM = 0x2;
    public static final int AL_VOCAL_MORPHER_DEFAULT_WAVEFORM = 0x0;
    public static final float AL_VOCAL_MORPHER_MIN_RATE = 0.0f;
    public static final float AL_VOCAL_MORPHER_MAX_RATE = 10.0f;
    public static final float AL_VOCAL_MORPHER_DEFAULT_RATE = 1.41f;
    public static final int AL_PITCH_SHIFTER_MIN_COARSE_TUNE = 0xFFFFFFF4;
    public static final int AL_PITCH_SHIFTER_MAX_COARSE_TUNE = 0xC;
    public static final int AL_PITCH_SHIFTER_DEFAULT_COARSE_TUNE = 0xC;
    public static final int AL_PITCH_SHIFTER_MIN_FINE_TUNE = 0xFFFFFFCE;
    public static final int AL_PITCH_SHIFTER_MAX_FINE_TUNE = 0x32;
    public static final int AL_PITCH_SHIFTER_DEFAULT_FINE_TUNE = 0x0;
    public static final float AL_RING_MODULATOR_MIN_FREQUENCY = 0.0f;
    public static final float AL_RING_MODULATOR_MAX_FREQUENCY = 8000.0f;
    public static final float AL_RING_MODULATOR_DEFAULT_FREQUENCY = 440.0f;
    public static final float AL_RING_MODULATOR_MIN_HIGHPASS_CUTOFF = 0.0f;
    public static final float AL_RING_MODULATOR_MAX_HIGHPASS_CUTOFF = 24000.0f;
    public static final float AL_RING_MODULATOR_DEFAULT_HIGHPASS_CUTOFF = 800.0f;
    public static final int AL_RING_MODULATOR_SINUSOID = 0x0;
    public static final int AL_RING_MODULATOR_SAWTOOTH = 0x1;
    public static final int AL_RING_MODULATOR_SQUARE = 0x2;
    public static final int AL_RING_MODULATOR_MIN_WAVEFORM = 0x0;
    public static final int AL_RING_MODULATOR_MAX_WAVEFORM = 0x2;
    public static final int AL_RING_MODULATOR_DEFAULT_WAVEFORM = 0x0;
    public static final float AL_AUTOWAH_MIN_ATTACK_TIME = 1.0E-4f;
    public static final float AL_AUTOWAH_MAX_ATTACK_TIME = 1.0f;
    public static final float AL_AUTOWAH_DEFAULT_ATTACK_TIME = 0.06f;
    public static final float AL_AUTOWAH_MIN_RELEASE_TIME = 1.0E-4f;
    public static final float AL_AUTOWAH_MAX_RELEASE_TIME = 1.0f;
    public static final float AL_AUTOWAH_DEFAULT_RELEASE_TIME = 0.06f;
    public static final float AL_AUTOWAH_MIN_RESONANCE = 2.0f;
    public static final float AL_AUTOWAH_MAX_RESONANCE = 1000.0f;
    public static final float AL_AUTOWAH_DEFAULT_RESONANCE = 1000.0f;
    public static final float AL_AUTOWAH_MIN_PEAK_GAIN = 3.0E-5f;
    public static final float AL_AUTOWAH_MAX_PEAK_GAIN = 31621.0f;
    public static final float AL_AUTOWAH_DEFAULT_PEAK_GAIN = 11.22f;
    public static final int AL_COMPRESSOR_MIN_ONOFF = 0x0;
    public static final int AL_COMPRESSOR_MAX_ONOFF = 0x1;
    public static final int AL_COMPRESSOR_DEFAULT_ONOFF = 0x1;
    public static final float AL_EQUALIZER_MIN_LOW_GAIN = 0.126f;
    public static final float AL_EQUALIZER_MAX_LOW_GAIN = 7.943f;
    public static final float AL_EQUALIZER_DEFAULT_LOW_GAIN = 1.0f;
    public static final float AL_EQUALIZER_MIN_LOW_CUTOFF = 50.0f;
    public static final float AL_EQUALIZER_MAX_LOW_CUTOFF = 800.0f;
    public static final float AL_EQUALIZER_DEFAULT_LOW_CUTOFF = 200.0f;
    public static final float AL_EQUALIZER_MIN_MID1_GAIN = 0.126f;
    public static final float AL_EQUALIZER_MAX_MID1_GAIN = 7.943f;
    public static final float AL_EQUALIZER_DEFAULT_MID1_GAIN = 1.0f;
    public static final float AL_EQUALIZER_MIN_MID1_CENTER = 200.0f;
    public static final float AL_EQUALIZER_MAX_MID1_CENTER = 3000.0f;
    public static final float AL_EQUALIZER_DEFAULT_MID1_CENTER = 500.0f;
    public static final float AL_EQUALIZER_MIN_MID1_WIDTH = 0.01f;
    public static final float AL_EQUALIZER_MAX_MID1_WIDTH = 1.0f;
    public static final float AL_EQUALIZER_DEFAULT_MID1_WIDTH = 1.0f;
    public static final float AL_EQUALIZER_MIN_MID2_GAIN = 0.126f;
    public static final float AL_EQUALIZER_MAX_MID2_GAIN = 7.943f;
    public static final float AL_EQUALIZER_DEFAULT_MID2_GAIN = 1.0f;
    public static final float AL_EQUALIZER_MIN_MID2_CENTER = 1000.0f;
    public static final float AL_EQUALIZER_MAX_MID2_CENTER = 8000.0f;
    public static final float AL_EQUALIZER_DEFAULT_MID2_CENTER = 3000.0f;
    public static final float AL_EQUALIZER_MIN_MID2_WIDTH = 0.01f;
    public static final float AL_EQUALIZER_MAX_MID2_WIDTH = 1.0f;
    public static final float AL_EQUALIZER_DEFAULT_MID2_WIDTH = 1.0f;
    public static final float AL_EQUALIZER_MIN_HIGH_GAIN = 0.126f;
    public static final float AL_EQUALIZER_MAX_HIGH_GAIN = 7.943f;
    public static final float AL_EQUALIZER_DEFAULT_HIGH_GAIN = 1.0f;
    public static final float AL_EQUALIZER_MIN_HIGH_CUTOFF = 4000.0f;
    public static final float AL_EQUALIZER_MAX_HIGH_CUTOFF = 16000.0f;
    public static final float AL_EQUALIZER_DEFAULT_HIGH_CUTOFF = 6000.0f;
    public static final float LOWPASS_MIN_GAIN = 0.0f;
    public static final float LOWPASS_MAX_GAIN = 1.0f;
    public static final float LOWPASS_DEFAULT_GAIN = 1.0f;
    public static final float LOWPASS_MIN_GAINHF = 0.0f;
    public static final float LOWPASS_MAX_GAINHF = 1.0f;
    public static final float LOWPASS_DEFAULT_GAINHF = 1.0f;
    public static final float HIGHPASS_MIN_GAIN = 0.0f;
    public static final float HIGHPASS_MAX_GAIN = 1.0f;
    public static final float HIGHPASS_DEFAULT_GAIN = 1.0f;
    public static final float HIGHPASS_MIN_GAINLF = 0.0f;
    public static final float HIGHPASS_MAX_GAINLF = 1.0f;
    public static final float HIGHPASS_DEFAULT_GAINLF = 1.0f;
    public static final float BANDPASS_MIN_GAIN = 0.0f;
    public static final float BANDPASS_MAX_GAIN = 1.0f;
    public static final float BANDPASS_DEFAULT_GAIN = 1.0f;
    public static final float BANDPASS_MIN_GAINHF = 0.0f;
    public static final float BANDPASS_MAX_GAINHF = 1.0f;
    public static final float BANDPASS_DEFAULT_GAINHF = 1.0f;
    public static final float BANDPASS_MIN_GAINLF = 0.0f;
    public static final float BANDPASS_MAX_GAINLF = 1.0f;
    public static final float BANDPASS_DEFAULT_GAINLF = 1.0f;

    private EFX10(){}

    public static void alGenAuxiliaryEffectSlots(IntBuffer auxiliaryeffectslots){
        org.lwjgl.openal.EXTEfx.alGenAuxiliaryEffectSlots(auxiliaryeffectslots);
    }

    public static int alGenAuxiliaryEffectSlots(){
        return org.lwjgl.openal.EXTEfx.alGenAuxiliaryEffectSlots();
    }

    public static void alDeleteAuxiliaryEffectSlots(IntBuffer auxiliaryeffectslots){
        org.lwjgl.openal.EXTEfx.alDeleteAuxiliaryEffectSlots(auxiliaryeffectslots);
    }

    public static void alDeleteAuxiliaryEffectSlots(int auxiliaryeffectslot){
        org.lwjgl.openal.EXTEfx.alDeleteAuxiliaryEffectSlots(auxiliaryeffectslot);
    }

    public static boolean alIsAuxiliaryEffectSlot(int auxiliaryeffectslot){
        return org.lwjgl.openal.EXTEfx.alIsAuxiliaryEffectSlot(auxiliaryeffectslot);
    }

    public static void alAuxiliaryEffectSloti(int auxiliaryeffectslot, int param, int value){
        org.lwjgl.openal.EXTEfx.alAuxiliaryEffectSloti(auxiliaryeffectslot, param, value);
    }

    public static void alAuxiliaryEffectSlot(int auxiliaryeffectslot, int param, IntBuffer values){
        org.lwjgl.openal.EXTEfx.alAuxiliaryEffectSlotiv(auxiliaryeffectslot, param, values);
    }

    public static void alAuxiliaryEffectSlotf(int auxiliaryeffectslot, int param, float value){
        org.lwjgl.openal.EXTEfx.alAuxiliaryEffectSlotf(auxiliaryeffectslot, param, value);
    }

    public static void alAuxiliaryEffectSlot(int auxiliaryeffectslot, int param, FloatBuffer values){
        org.lwjgl.openal.EXTEfx.alAuxiliaryEffectSlotfv(auxiliaryeffectslot, param, values);
    }

    public static int alGetAuxiliaryEffectSloti(int auxiliaryeffectslot, int param){
        return org.lwjgl.openal.EXTEfx.alGetAuxiliaryEffectSloti(auxiliaryeffectslot, param);
    }

    public static void alGetAuxiliaryEffectSlot(int auxiliaryeffectslot, int param, IntBuffer intdata){
        org.lwjgl.openal.EXTEfx.alGetAuxiliaryEffectSlotiv(auxiliaryeffectslot, param, intdata);
    }

    public static float alGetAuxiliaryEffectSlotf(int auxiliaryeffectslot, int param){
        return org.lwjgl.openal.EXTEfx.alGetAuxiliaryEffectSlotf(auxiliaryeffectslot, param);
    }

    public static void alGetAuxiliaryEffectSlot(int auxiliaryeffectslot, int param, FloatBuffer floatdata){
        org.lwjgl.openal.EXTEfx.alGetAuxiliaryEffectSlotfv(auxiliaryeffectslot, param, floatdata);
    }

    public static void alGenEffects(IntBuffer effects){
        org.lwjgl.openal.EXTEfx.alGenEffects(effects);
    }

    public static int alGenEffects(){
        return org.lwjgl.openal.EXTEfx.alGenEffects();
    }

    public static void alDeleteEffects(IntBuffer effects){
        org.lwjgl.openal.EXTEfx.alDeleteEffects(effects);
    }

    public static void alDeleteEffects(int effect){
        org.lwjgl.openal.EXTEfx.alDeleteEffects(effect);
    }

    public static boolean alIsEffect(int effect){
        return org.lwjgl.openal.EXTEfx.alIsEffect(effect);
    }

    public static void alEffecti(int effect, int param, int value){
        org.lwjgl.openal.EXTEfx.alEffecti(effect, param, value);
    }

    public static void alEffect(int effect, int param, IntBuffer values){
        org.lwjgl.openal.EXTEfx.alEffectiv(effect, param, values);
    }

    public static void alEffectf(int effect, int param, float value){
        org.lwjgl.openal.EXTEfx.alEffectf(effect, param, value);
    }

    public static void alEffect(int effect, int param, FloatBuffer values){
        org.lwjgl.openal.EXTEfx.alEffectfv(effect, param, values);
    }

    public static int alGetEffecti(int effect, int param){
        return org.lwjgl.openal.EXTEfx.alGetEffecti(effect, param);
    }

    public static void alGetEffect(int effect, int param, IntBuffer intdata){
        org.lwjgl.openal.EXTEfx.alGetEffectiv(effect, param, intdata);
    }

    public static float alGetEffectf(int effect, int param){
        return org.lwjgl.openal.EXTEfx.alGetEffectf(effect, param);
    }

    public static void alGetEffect(int effect, int param, FloatBuffer floatdata){
        org.lwjgl.openal.EXTEfx.alGetEffectfv(effect, param, floatdata);
    }

    public static void alGenFilters(IntBuffer filters){
        org.lwjgl.openal.EXTEfx.alGenFilters(filters);
    }

    public static int alGenFilters(){
        return org.lwjgl.openal.EXTEfx.alGenFilters();
    }

    public static void alDeleteFilters(IntBuffer filters){
        org.lwjgl.openal.EXTEfx.alDeleteFilters(filters);
    }

    public static void alDeleteFilters(int filter){
        org.lwjgl.openal.EXTEfx.alDeleteFilters(filter);
    }

    public static boolean alIsFilter(int filter){
        return org.lwjgl.openal.EXTEfx.alIsFilter(filter);
    }

    public static void alFilteri(int filter, int param, int value){
        org.lwjgl.openal.EXTEfx.alFilteri(filter, param, value);
    }

    public static void alFilter(int filter, int param, IntBuffer values){
        org.lwjgl.openal.EXTEfx.alFilteriv(filter, param, values);
    }

    public static void alFilterf(int filter, int param, float value){
        org.lwjgl.openal.EXTEfx.alFilterf(filter, param, value);
    }

    public static void alFilter(int filter, int param, FloatBuffer values){
        org.lwjgl.openal.EXTEfx.alFilterfv(filter, param, values);
    }

    public static int alGetFilteri(int filter, int param){
        return org.lwjgl.openal.EXTEfx.alGetFilteri(filter, param);
    }

    public static void alGetFilter(int filter, int param, IntBuffer intdata){
        org.lwjgl.openal.EXTEfx.alGetFilteriv(filter, param, intdata);
    }

    public static float alGetFilterf(int filter, int param){
        return org.lwjgl.openal.EXTEfx.alGetFilterf(filter, param);
    }

    public static void alGetFilter(int filter, int param, FloatBuffer floatdata){
        org.lwjgl.openal.EXTEfx.alGetFilterfv(filter, param, floatdata);
    }
}
