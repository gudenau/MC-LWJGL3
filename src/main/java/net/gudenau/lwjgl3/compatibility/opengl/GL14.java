package net.gudenau.lwjgl3.compatibility.opengl;

import net.gudenau.lwjgl3.helper.FieldHelper;

import java.nio.*;

import static net.gudenau.lwjgl3.compatibility.opengl.GL11.*;
import static org.lwjgl.system.MemoryUtil.memAddress;

/**
 * Created by gudenau on 6/1/2017.
 * <p>
 * LWJGL3
 */
@SuppressWarnings({"unused", "SpellCheckingInspection"})
public class GL14{
    public static final int GL_GENERATE_MIPMAP = 0x8191;
    public static final int GL_GENERATE_MIPMAP_HINT = 0x8192;
    public static final int GL_DEPTH_COMPONENT16 = 0x81A5;
    public static final int GL_DEPTH_COMPONENT24 = 0x81A6;
    public static final int GL_DEPTH_COMPONENT32 = 0x81A7;
    public static final int GL_TEXTURE_DEPTH_SIZE = 0x884A;
    public static final int GL_DEPTH_TEXTURE_MODE = 0x884B;
    public static final int GL_TEXTURE_COMPARE_MODE = 0x884C;
    public static final int GL_TEXTURE_COMPARE_FUNC = 0x884D;
    public static final int GL_COMPARE_R_TO_TEXTURE = 0x884E;
    public static final int GL_FOG_COORDINATE_SOURCE = 0x8450;
    public static final int GL_FOG_COORDINATE = 0x8451;
    public static final int GL_FRAGMENT_DEPTH = 0x8452;
    public static final int GL_CURRENT_FOG_COORDINATE = 0x8453;
    public static final int GL_FOG_COORDINATE_ARRAY_TYPE = 0x8454;
    public static final int GL_FOG_COORDINATE_ARRAY_STRIDE = 0x8455;
    public static final int GL_FOG_COORDINATE_ARRAY_POINTER = 0x8456;
    public static final int GL_FOG_COORDINATE_ARRAY = 0x8457;
    public static final int GL_POINT_SIZE_MIN = 0x8126;
    public static final int GL_POINT_SIZE_MAX = 0x8127;
    public static final int GL_POINT_FADE_THRESHOLD_SIZE = 0x8128;
    public static final int GL_POINT_DISTANCE_ATTENUATION = 0x8129;
    public static final int GL_COLOR_SUM = 0x8458;
    public static final int GL_CURRENT_SECONDARY_COLOR = 0x8459;
    public static final int GL_SECONDARY_COLOR_ARRAY_SIZE = 0x845A;
    public static final int GL_SECONDARY_COLOR_ARRAY_TYPE = 0x845B;
    public static final int GL_SECONDARY_COLOR_ARRAY_STRIDE = 0x845C;
    public static final int GL_SECONDARY_COLOR_ARRAY_POINTER = 0x845D;
    public static final int GL_SECONDARY_COLOR_ARRAY = 0x845E;
    public static final int GL_BLEND_DST_RGB = 0x80C8;
    public static final int GL_BLEND_SRC_RGB = 0x80C9;
    public static final int GL_BLEND_DST_ALPHA = 0x80CA;
    public static final int GL_BLEND_SRC_ALPHA = 0x80CB;
    public static final int GL_INCR_WRAP = 0x8507;
    public static final int GL_DECR_WRAP = 0x8508;
    public static final int GL_TEXTURE_FILTER_CONTROL = 0x8500;
    public static final int GL_TEXTURE_LOD_BIAS = 0x8501;
    public static final int GL_MAX_TEXTURE_LOD_BIAS = 0x84FD;
    public static final int GL_MIRRORED_REPEAT = 0x8370;
    public static final int GL_BLEND_COLOR = 0x8005;
    public static final int GL_BLEND_EQUATION = 0x8009;
    public static final int GL_FUNC_ADD = 0x8006;
    public static final int GL_FUNC_SUBTRACT = 0x800A;
    public static final int GL_FUNC_REVERSE_SUBTRACT = 0x800B;
    public static final int GL_MIN = 0x8007;
    public static final int GL_MAX = 0x8008;

    static {
        FieldHelper.copyStaticFields(org.lwjgl.opengl.GL14.class, GL14.class);
    }

    private GL14() {}

    public static void glBlendEquation(int mode) {
        org.lwjgl.opengl.GL14.glBlendEquation(mode);
    }

    public static void glBlendColor(float red, float green, float blue, float alpha) {
        org.lwjgl.opengl.GL14.glBlendColor(red, green, blue, alpha);
    }

    public static void glFogCoordf(float coord) {
        org.lwjgl.opengl.GL14.glFogCoordf(coord);
    }

    public static void glFogCoordd(double coord) {
        org.lwjgl.opengl.GL14.glFogCoordd(coord);
    }

    public static void glFogCoordPointer(int stride, DoubleBuffer data) {
        org.lwjgl.opengl.GL14.glFogCoordPointer(GL_DOUBLE, stride, memAddress(data));
    }

    public static void glFogCoordPointer(int stride, FloatBuffer data) {
        org.lwjgl.opengl.GL14.glFogCoordPointer(GL_FLOAT, stride, data);
    }

    public static void glFogCoordPointer(int type, int stride, long data_buffer_offset) {
        org.lwjgl.opengl.GL14.glFogCoordPointer(type, stride, data_buffer_offset);
    }

    public static void glMultiDrawArrays(int mode, IntBuffer piFirst, IntBuffer piCount) {
        org.lwjgl.opengl.GL14.glMultiDrawArrays(mode, piFirst, piCount);
    }

    public static void glPointParameteri(int pname, int param) {
        org.lwjgl.opengl.GL14.glPointParameteri(pname, param);
    }

    public static void glPointParameterf(int pname, float param) {
        org.lwjgl.opengl.GL14.glPointParameterf(pname, param);
    }

    public static void glPointParameter(int pname, IntBuffer params) {
        org.lwjgl.opengl.GL14.glPointParameteriv(pname, params);
    }

    public static void glPointParameter(int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL14.glPointParameterfv(pname, params);
    }

    public static void glSecondaryColor3b(byte red, byte green, byte blue) {
        org.lwjgl.opengl.GL14.glSecondaryColor3b(red, green, blue);
    }

    public static void glSecondaryColor3f(float red, float green, float blue) {
        org.lwjgl.opengl.GL14.glSecondaryColor3f(red, green, blue);
    }

    public static void glSecondaryColor3d(double red, double green, double blue) {
        org.lwjgl.opengl.GL14.glSecondaryColor3d(red, green, blue);
    }

    public static void glSecondaryColor3ub(byte red, byte green, byte blue) {
        org.lwjgl.opengl.GL14.glSecondaryColor3ub(red, green, blue);
    }

    public static void glSecondaryColorPointer(int size, int stride, DoubleBuffer data) {
        org.lwjgl.opengl.GL14.glSecondaryColorPointer(size, GL_DOUBLE, stride, memAddress(data));
    }

    public static void glSecondaryColorPointer(int size, int stride, FloatBuffer data) {
        org.lwjgl.opengl.GL14.glSecondaryColorPointer(size, GL_FLOAT, stride, data);
    }

    public static void glSecondaryColorPointer(int size, boolean unsigned, int stride, ByteBuffer data) {
        org.lwjgl.opengl.GL14.glSecondaryColorPointer(size, unsigned ? GL_UNSIGNED_BYTE : GL_BYTE, stride, data);
    }

    public static void glSecondaryColorPointer(int size, int type, int stride, long data_buffer_offset) {
        org.lwjgl.opengl.GL14.glSecondaryColorPointer(size, type, stride, data_buffer_offset);
    }

    public static void glBlendFuncSeparate(int sfactorRGB, int dfactorRGB, int sfactorAlpha, int dfactorAlpha) {
        org.lwjgl.opengl.GL14.glBlendFuncSeparate(sfactorRGB, dfactorRGB, sfactorAlpha, dfactorAlpha);
    }

    public static void glWindowPos2f(float x, float y) {
        org.lwjgl.opengl.GL14.glWindowPos2f(x, y);
    }

    public static void glWindowPos2d(double x, double y) {
        org.lwjgl.opengl.GL14.glWindowPos2d(x, y);
    }

    public static void glWindowPos2i(int x, int y) {
        org.lwjgl.opengl.GL14.glWindowPos2i(x, y);
    }

    public static void glWindowPos3f(float x, float y, float z) {
        org.lwjgl.opengl.GL14.glWindowPos3f(x, y, z);
    }

    public static void glWindowPos3d(double x, double y, double z) {
        org.lwjgl.opengl.GL14.glWindowPos3d(x, y, z);
    }

    public static void glWindowPos3i(int x, int y, int z) {
        org.lwjgl.opengl.GL14.glWindowPos3i(x, y, z);
    }
}
