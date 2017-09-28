package net.gudenau.lwjgl3.compatibility.opengl;

import net.gudenau.lwjgl3.NotImplementedException;
import net.gudenau.lwjgl3.helper.FieldHelper;

import java.nio.*;

/**
 * Created by gudenau on 6/1/2017.
 * <p>
 * LWJGL3
 */
@SuppressWarnings({"unused", "SpellCheckingInspection"})
public class GL13{
    public static final int GL_TEXTURE0 = 0x84C0;
    public static final int GLTEXTURE1 = 0x84C1;
    public static final int GLTEXTURE2 = 0x84C2;
    public static final int GLTEXTURE3 = 0x84C3;
    public static final int GLTEXTURE4 = 0x84C4;
    public static final int GLTEXTURE5 = 0x84C5;
    public static final int GLTEXTURE6 = 0x84C6;
    public static final int GLTEXTURE7 = 0x84C7;
    public static final int GLTEXTURE8 = 0x84C8;
    public static final int GLTEXTURE9 = 0x84C9;
    public static final int GLTEXTURE10 = 0x84CA;
    public static final int GLTEXTURE11 = 0x84CB;
    public static final int GLTEXTURE12 = 0x84CC;
    public static final int GLTEXTURE13 = 0x84CD;
    public static final int GLTEXTURE14 = 0x84CE;
    public static final int GLTEXTURE15 = 0x84CF;
    public static final int GLTEXTURE16 = 0x84D0;
    public static final int GLTEXTURE17 = 0x84D1;
    public static final int GLTEXTURE18 = 0x84D2;
    public static final int GLTEXTURE19 = 0x84D3;
    public static final int GLTEXTURE20 = 0x84D4;
    public static final int GLTEXTURE21 = 0x84D5;
    public static final int GLTEXTURE22 = 0x84D6;
    public static final int GLTEXTURE23 = 0x84D7;
    public static final int GLTEXTURE24 = 0x84D8;
    public static final int GLTEXTURE25 = 0x84D9;
    public static final int GLTEXTURE26 = 0x84DA;
    public static final int GLTEXTURE27 = 0x84DB;
    public static final int GLTEXTURE28 = 0x84DC;
    public static final int GLTEXTURE29 = 0x84DD;
    public static final int GLTEXTURE30 = 0x84DE;
    public static final int GLTEXTURE31 = 0x84DF;
    public static final int GLACTIVE_TEXTURE = 0x84E0;
    public static final int GLCLIENT_ACTIVE_TEXTURE = 0x84E1;
    public static final int GLMAX_TEXTURE_UNITS = 0x84E2;
    public static final int GLNORMAL_MAP = 0x8511;
    public static final int GLREFLECTION_MAP = 0x8512;
    public static final int GLTEXTURE_CUBE_MAP = 0x8513;
    public static final int GLTEXTURE_BINDING_CUBE_MAP = 0x8514;
    public static final int GLTEXTURE_CUBE_MAP_POSITIVE_X = 0x8515;
    public static final int GLTEXTURE_CUBE_MAP_NEGATIVE_X = 0x8516;
    public static final int GLTEXTURE_CUBE_MAP_POSITIVE_Y = 0x8517;
    public static final int GLTEXTURE_CUBE_MAP_NEGATIVE_Y = 0x8518;
    public static final int GLTEXTURE_CUBE_MAP_POSITIVE_Z = 0x8519;
    public static final int GLTEXTURE_CUBE_MAP_NEGATIVE_Z = 0x851A;
    public static final int GLPROXY_TEXTURE_CUBE_MAP = 0x851B;
    public static final int GLMAX_CUBE_MAP_TEXTURE_SIZE = 0x851C;
    public static final int GLCOMPRESSED_ALPHA = 0x84E9;
    public static final int GLCOMPRESSED_LUMINANCE = 0x84EA;
    public static final int GLCOMPRESSED_LUMINANCE_ALPHA = 0x84EB;
    public static final int GLCOMPRESSED_INTENSITY = 0x84EC;
    public static final int GLCOMPRESSED_RGB = 0x84ED;
    public static final int GLCOMPRESSED_RGBA = 0x84EE;
    public static final int GLTEXTURE_COMPRESSION_HINT = 0x84EF;
    public static final int GLTEXTURE_COMPRESSED_IMAGE_SIZE = 0x86A0;
    public static final int GLTEXTURE_COMPRESSED = 0x86A1;
    public static final int GLNUM_COMPRESSED_TEXTURE_FORMATS = 0x86A2;
    public static final int GLCOMPRESSED_TEXTURE_FORMATS = 0x86A3;
    public static final int GLMULTISAMPLE = 0x809D;
    public static final int GLSAMPLE_ALPHA_TO_COVERAGE = 0x809E;
    public static final int GLSAMPLE_ALPHA_TO_ONE = 0x809F;
    public static final int GLSAMPLE_COVERAGE = 0x80A0;
    public static final int GLSAMPLE_BUFFERS = 0x80A8;
    public static final int GLSAMPLES = 0x80A9;
    public static final int GLSAMPLE_COVERAGE_VALUE = 0x80AA;
    public static final int GLSAMPLE_COVERAGE_INVERT = 0x80AB;
    public static final int GLMULTISAMPLE_BIT = 0x20000000;
    public static final int GLTRANSPOSE_MODELVIEW_MATRIX = 0x84E3;
    public static final int GLTRANSPOSE_PROJECTION_MATRIX = 0x84E4;
    public static final int GLTRANSPOSE_TEXTURE_MATRIX = 0x84E5;
    public static final int GLTRANSPOSE_COLOR_MATRIX = 0x84E6;
    public static final int GLCOMBINE = 0x8570;
    public static final int GLCOMBINE_RGB = 0x8571;
    public static final int GLCOMBINE_ALPHA = 0x8572;
    public static final int GLSOURCE0_RGB = 0x8580;
    public static final int GLSOURCE1_RGB = 0x8581;
    public static final int GLSOURCE2_RGB = 0x8582;
    public static final int GLSOURCE0_ALPHA = 0x8588;
    public static final int GLSOURCE1_ALPHA = 0x8589;
    public static final int GLSOURCE2_ALPHA = 0x858A;
    public static final int GLOPERAND0_RGB = 0x8590;
    public static final int GLOPERAND1_RGB = 0x8591;
    public static final int GLOPERAND2_RGB = 0x8592;
    public static final int GLOPERAND0_ALPHA = 0x8598;
    public static final int GLOPERAND1_ALPHA = 0x8599;
    public static final int GLOPERAND2_ALPHA = 0x859A;
    public static final int GLRGB_SCALE = 0x8573;
    public static final int GLADD_SIGNED = 0x8574;
    public static final int GLINTERPOLATE = 0x8575;
    public static final int GLSUBTRACT = 0x84E7;
    public static final int GLCONSTANT = 0x8576;
    public static final int GLPRIMARY_COLOR = 0x8577;
    public static final int GLPREVIOUS = 0x8578;
    public static final int GLDOT3_RGB = 0x86AE;
    public static final int GLDOT3_RGBA = 0x86AF;
    public static final int GLCLAMP_TO_BORDER = 0x812D;

    static {
        FieldHelper.copyStaticFields(org.lwjgl.opengl.GL13.class, GL13.class);
    }

    private GL13() {}

    public static void glActiveTexture(int texture) {
        org.lwjgl.opengl.GL13.glActiveTexture(texture);
    }

    public static void glClientActiveTexture(int texture) {
        org.lwjgl.opengl.GL13.glClientActiveTexture(texture);
    }

    public static void glCompressedTexImage1D(int target, int level, int internalformat, int width, int border, ByteBuffer data) {
        org.lwjgl.opengl.GL13.glCompressedTexImage1D(target, level, internalformat, width, border, data);
    }

    public static void glCompressedTexImage1D(int target, int level, int internalformat, int width, int border, int data_imageSize, long data_buffer_offset) {
        org.lwjgl.opengl.GL13.glCompressedTexImage1D(target, level, internalformat, width, border, data_imageSize, data_buffer_offset);
    }

    public static void glCompressedTexImage1D(int target, int level, int internalformat, int width, int border, int imageSize) {
        throw new NotImplementedException();
    }

    public static void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, ByteBuffer data) {
        org.lwjgl.opengl.GL13.glCompressedTexImage2D(target, level, internalformat, width, height, border, data);
    }

    public static void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int data_imageSize, long data_buffer_offset) {
        org.lwjgl.opengl.GL13.glCompressedTexImage2D(target, level, internalformat, width, height, border, data_imageSize, data_buffer_offset);
    }

    public static void glCompressedTexImage2D(int target, int level, int internalformat, int width, int height, int border, int imageSize) {
        throw new NotImplementedException();
    }

    public static void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, ByteBuffer data) {
        org.lwjgl.opengl.GL13.glCompressedTexImage3D(target, level, internalformat, width, height, depth, border, data);
    }

    public static void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int data_imageSize, long data_buffer_offset) {
        org.lwjgl.opengl.GL13.glCompressedTexImage3D(target, level, internalformat, width, height, depth, border, data_imageSize, data_buffer_offset);
    }

    public static void glCompressedTexImage3D(int target, int level, int internalformat, int width, int height, int depth, int border, int imageSize) {
        throw new NotImplementedException();
    }

    public static void glCompressedTexSubImage1D(int target, int level, int xoffset, int width, int format, ByteBuffer data) {
        org.lwjgl.opengl.GL13.glCompressedTexSubImage1D(target, level, xoffset, width, format, data);
    }

    public static void glCompressedTexSubImage1D(int target, int level, int xoffset, int width, int format, int data_imageSize, long data_buffer_offset) {
        org.lwjgl.opengl.GL13.glCompressedTexSubImage1D(target, level, xoffset, width, format, data_imageSize, data_buffer_offset);
    }

    public static void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, ByteBuffer data) {
        org.lwjgl.opengl.GL13.glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, data);
    }

    public static void glCompressedTexSubImage2D(int target, int level, int xoffset, int yoffset, int width, int height, int format, int data_imageSize, long data_buffer_offset) {
        org.lwjgl.opengl.GL13.glCompressedTexSubImage2D(target, level, xoffset, yoffset, width, height, format, data_imageSize, data_buffer_offset);
    }

    public static void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, ByteBuffer data) {
        org.lwjgl.opengl.GL13.glCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, data);
    }

    public static void glCompressedTexSubImage3D(int target, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int data_imageSize, long data_buffer_offset) {
        org.lwjgl.opengl.GL13.glCompressedTexSubImage3D(target, level, xoffset, yoffset, zoffset, width, height, depth, format, data_imageSize, data_buffer_offset);
    }

    public static void glGetCompressedTexImage(int target, int lod, ByteBuffer img) {
        org.lwjgl.opengl.GL13.glGetCompressedTexImage(target, lod, img);
    }

    public static void glGetCompressedTexImage(int target, int lod, IntBuffer img) {
        throw new NotImplementedException();
    }

    public static void glGetCompressedTexImage(int target, int lod, ShortBuffer img) {
        throw new NotImplementedException();
    }

    public static void glGetCompressedTexImage(int target, int lod, long img_buffer_offset) {
        org.lwjgl.opengl.GL13.glGetCompressedTexImage(target, lod, img_buffer_offset);
    }

    public static void glMultiTexCoord1f(int target, float s) {
        org.lwjgl.opengl.GL13.glMultiTexCoord1f(target, s);
    }

    public static void glMultiTexCoord1d(int target, double s) {
        org.lwjgl.opengl.GL13.glMultiTexCoord1d(target, s);
    }

    public static void glMultiTexCoord2f(int target, float s, float t) {
        org.lwjgl.opengl.GL13.glMultiTexCoord2f(target, s, t);
    }

    public static void glMultiTexCoord2d(int target, double s, double t) {
        org.lwjgl.opengl.GL13.glMultiTexCoord2d(target, s, t);
    }

    public static void glMultiTexCoord3f(int target, float s, float t, float r) {
        org.lwjgl.opengl.GL13.glMultiTexCoord3f(target, s, t, r);
    }

    public static void glMultiTexCoord3d(int target, double s, double t, double r) {
        org.lwjgl.opengl.GL13.glMultiTexCoord3d(target, s, t, r);
    }

    public static void glMultiTexCoord4f(int target, float s, float t, float r, float q) {
        org.lwjgl.opengl.GL13.glMultiTexCoord4f(target, s, t, r, q);
    }

    public static void glMultiTexCoord4d(int target, double s, double t, double r, double q) {
        org.lwjgl.opengl.GL13.glMultiTexCoord4d(target, s, t, r, q);
    }

    public static void glLoadTransposeMatrix(FloatBuffer m) {
        org.lwjgl.opengl.GL13.glLoadTransposeMatrixf(m);
    }

    public static void glLoadTransposeMatrix(DoubleBuffer m) {
        org.lwjgl.opengl.GL13.glLoadTransposeMatrixd(m);
    }

    public static void glMultTransposeMatrix(FloatBuffer m) {
        org.lwjgl.opengl.GL13.glMultTransposeMatrixf(m);
    }

    public static void glMultTransposeMatrix(DoubleBuffer m) {
        org.lwjgl.opengl.GL13.glMultTransposeMatrixd(m);
    }

    public static void glSampleCoverage(float value, boolean invert) {
        org.lwjgl.opengl.GL13.glSampleCoverage(value, invert);
    }
}
