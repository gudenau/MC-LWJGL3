package net.gudenau.lwjgl3.compatibility.opengl;

import net.gudenau.lwjgl3.helper.FieldHelper;

import java.nio.*;

/**
 * Created by gudenau on 6/1/2017.
 * <p>
 * LWJGL3
 */
@SuppressWarnings({"unused", "SpellCheckingInspection"})
public class GL12{
    public static final int GL_TEXTURE_BINDING_3D = 0x806A;
    public static final int GL_PACK_SKIP_IMAGES = 0x806B;
    public static final int GL_PACK_IMAGE_HEIGHT = 0x806C;
    public static final int GL_UNPACK_SKIP_IMAGES = 0x806D;
    public static final int GL_UNPACK_IMAGE_HEIGHT = 0x806E;
    public static final int GL_TEXTURE_3D = 0x806F;
    public static final int GL_PROXY_TEXTURE_3D = 0x8070;
    public static final int GL_TEXTURE_DEPTH = 0x8071;
    public static final int GL_TEXTURE_WRAP_R = 0x8072;
    public static final int GL_MAX_3D_TEXTURE_SIZE = 0x8073;
    public static final int GL_BGR = 0x80E0;
    public static final int GL_BGRA = 0x80E1;
    public static final int GL_UNSIGNED_BYTE_3_3_2 = 0x8032;
    public static final int GL_UNSIGNED_BYTE_2_3_3_REV = 0x8362;
    public static final int GL_UNSIGNED_SHORT_5_6_5 = 0x8363;
    public static final int GL_UNSIGNED_SHORT_5_6_5_REV = 0x8364;
    public static final int GL_UNSIGNED_SHORT_4_4_4_4 = 0x8033;
    public static final int GL_UNSIGNED_SHORT_4_4_4_4_REV = 0x8365;
    public static final int GL_UNSIGNED_SHORT_5_5_5_1 = 0x8034;
    public static final int GL_UNSIGNED_SHORT_1_5_5_5_REV = 0x8366;
    public static final int GL_UNSIGNED_INT_8_8_8_8 = 0x8035;
    public static final int GL_UNSIGNED_INT_8_8_8_8_REV = 0x8367;
    public static final int GL_UNSIGNED_INT_10_10_10_2 = 0x8036;
    public static final int GL_UNSIGNED_INT_2_10_10_10_REV = 0x8368;
    public static final int GL_RESCALE_NORMAL = 0x803A;
    public static final int GL_LIGHT_MODEL_COLOR_CONTROL = 0x81F8;
    public static final int GL_SINGLE_COLOR = 0x81F9;
    public static final int GL_SEPARATE_SPECULAR_COLOR = 0x81FA;
    public static final int GL_CLAMP_TO_EDGE = 0x812F;
    public static final int GL_TEXTURE_MIN_LOD = 0x813A;
    public static final int GL_TEXTURE_MAX_LOD = 0x813B;
    public static final int GL_TEXTURE_BASE_LEVEL = 0x813C;
    public static final int GL_TEXTURE_MAX_LEVEL = 0x813D;
    public static final int GL_MAX_ELEMENTS_VERTICES = 0x80E8;
    public static final int GL_MAX_ELEMENTS_INDICES = 0x80E9;
    public static final int GL_ALIASED_POINT_SIZE_RANGE = 0x846D;
    public static final int GL_ALIASED_LINE_WIDTH_RANGE = 0x846E;
    public static final int GL_SMOOTH_POINT_SIZE_RANGE = 0xB12;
    public static final int GL_SMOOTH_POINT_SIZE_GRANULARITY = 0xB13;
    public static final int GL_SMOOTH_LINE_WIDTH_RANGE = 0xB22;
    public static final int GL_SMOOTH_LINE_WIDTH_GRANULARITY = 0xB23;

    static {
        FieldHelper.copyStaticFields(org.lwjgl.opengl.GL12.class, GL12.class);
    }

    private GL12() {}

    public static void glDrawRangeElements(int mode, int start, int end, ByteBuffer indices) {
        org.lwjgl.opengl.GL12.glDrawRangeElements(mode, start, end, indices);
    }

    public static void glDrawRangeElements(int mode, int start, int end, IntBuffer indices) {
        org.lwjgl.opengl.GL12.glDrawRangeElements(mode, start, end, indices);
    }

    public static void glDrawRangeElements(int mode, int start, int end, ShortBuffer indices) {
        org.lwjgl.opengl.GL12.glDrawRangeElements(mode, start, end, indices);
    }

    public static void glDrawRangeElements(int mode, int start, int end, int indices_count, int type, long indices_buffer_offset) {
        org.lwjgl.opengl.GL12.glDrawRangeElements(mode, start, end, indices_count, type, indices_buffer_offset);
    }

    public static void glTexImage3D(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, ByteBuffer pixels) {
        org.lwjgl.opengl.GL12.glTexImage3D(target, level, internalFormat, width, height, depth, border, format, type, pixels);
    }

    public static void glTexImage3D(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, DoubleBuffer pixels) {
        org.lwjgl.opengl.GL12.glTexImage3D(target, level, internalFormat, width, height, depth, border, format, type, pixels);
    }

    public static void glTexImage3D(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, FloatBuffer pixels) {
        org.lwjgl.opengl.GL12.glTexImage3D(target, level, internalFormat, width, height, depth, border, format, type, pixels);
    }

    public static void glTexImage3D(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, IntBuffer pixels) {
        org.lwjgl.opengl.GL12.glTexImage3D(target, level, internalFormat, width, height, depth, border, format, type, pixels);
    }

    public static void glTexImage3D(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, ShortBuffer pixels) {
        org.lwjgl.opengl.GL12.glTexImage3D(target, level, internalFormat, width, height, depth, border, format, type, pixels);
    }

    public static void glTexImage3D(int target, int level, int internalFormat, int width, int height, int depth, int border, int format, int type, long pixels_buffer_offset) {
        org.lwjgl.opengl.GL12.glTexImage3D(target, level, internalFormat, width, height, depth, border, format, type, pixels_buffer_offset);
    }

    public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer pixels) {
        org.lwjgl.opengl.GL12.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, DoubleBuffer pixels) {
        org.lwjgl.opengl.GL12.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer pixels) {
        org.lwjgl.opengl.GL12.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer pixels) {
        org.lwjgl.opengl.GL12.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer pixels) {
        org.lwjgl.opengl.GL12.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels);
    }

    public static void glTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long pixels_buffer_offset) {
        org.lwjgl.opengl.GL12.glTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, type, pixels_buffer_offset);
    }

    public static void glCopyTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int x, int y, int width, int height) {
        org.lwjgl.opengl.GL12.glCopyTexSubImage3D(target, level, xoffset, yoffset, zoffset, x, y, width, height);
    }
}
