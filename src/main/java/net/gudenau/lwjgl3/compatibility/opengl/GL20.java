package net.gudenau.lwjgl3.compatibility.opengl;

import net.gudenau.lwjgl3.NotImplementedException;
import net.gudenau.lwjgl3.helper.FieldHelper;
import org.lwjgl.system.MemoryStack;

import java.nio.*;

/**
 * Created by gudenau on 6/1/2017.
 * <p>
 * LWJGL3
 */
@SuppressWarnings({"unused", "WeakerAccess", "UnusedReturnValue", "SpellCheckingInspection"})
public class GL20{
    public static final int GL_SHADING_LANGUAGE_VERSION = 0x8B8C;
    public static final int GL_CURRENT_PROGRAM = 0x8B8D;
    public static final int GL_SHADER_TYPE = 0x8B4F;
    public static final int GL_DELETE_STATUS = 0x8B80;
    public static final int GL_COMPILE_STATUS = 0x8B81;
    public static final int GL_LINK_STATUS = 0x8B82;
    public static final int GL_VALIDATE_STATUS = 0x8B83;
    public static final int GL_INFO_LOG_LENGTH = 0x8B84;
    public static final int GL_ATTACHED_SHADERS = 0x8B85;
    public static final int GL_ACTIVE_UNIFORMS = 0x8B86;
    public static final int GL_ACTIVE_UNIFORM_MAX_LENGTH = 0x8B87;
    public static final int GL_ACTIVE_ATTRIBUTES = 0x8B89;
    public static final int GL_ACTIVE_ATTRIBUTE_MAX_LENGTH = 0x8B8A;
    public static final int GL_SHADER_SOURCE_LENGTH = 0x8B88;
    public static final int GL_SHADER_OBJECT = 0x8B48;
    public static final int GL_FLOAT_VEC2 = 0x8B50;
    public static final int GL_FLOAT_VEC3 = 0x8B51;
    public static final int GL_FLOAT_VEC4 = 0x8B52;
    public static final int GL_INT_VEC2 = 0x8B53;
    public static final int GL_INT_VEC3 = 0x8B54;
    public static final int GL_INT_VEC4 = 0x8B55;
    public static final int GL_BOOL = 0x8B56;
    public static final int GL_BOOL_VEC2 = 0x8B57;
    public static final int GL_BOOL_VEC3 = 0x8B58;
    public static final int GL_BOOL_VEC4 = 0x8B59;
    public static final int GL_FLOAT_MAT2 = 0x8B5A;
    public static final int GL_FLOAT_MAT3 = 0x8B5B;
    public static final int GL_FLOAT_MAT4 = 0x8B5C;
    public static final int GL_SAMPLER_1D = 0x8B5D;
    public static final int GL_SAMPLER_2D = 0x8B5E;
    public static final int GL_SAMPLER_3D = 0x8B5F;
    public static final int GL_SAMPLER_CUBE = 0x8B60;
    public static final int GL_SAMPLER_1D_SHADOW = 0x8B61;
    public static final int GL_SAMPLER_2D_SHADOW = 0x8B62;
    public static final int GL_VERTEX_SHADER = 0x8B31;
    public static final int GL_MAX_VERTEX_UNIFORM_COMPONENTS = 0x8B4A;
    public static final int GL_MAX_VARYING_FLOATS = 0x8B4B;
    public static final int GL_MAX_VERTEX_ATTRIBS = 0x8869;
    public static final int GL_MAX_TEXTURE_IMAGE_UNITS = 0x8872;
    public static final int GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS = 0x8B4C;
    public static final int GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS = 0x8B4D;
    public static final int GL_MAX_TEXTURE_COORDS = 0x8871;
    public static final int GL_VERTEX_PROGRAM_POINT_SIZE = 0x8642;
    public static final int GL_VERTEX_PROGRAM_TWO_SIDE = 0x8643;
    public static final int GL_VERTEX_ATTRIB_ARRAY_ENABLED = 0x8622;
    public static final int GL_VERTEX_ATTRIB_ARRAY_SIZE = 0x8623;
    public static final int GL_VERTEX_ATTRIB_ARRAY_STRIDE = 0x8624;
    public static final int GL_VERTEX_ATTRIB_ARRAY_TYPE = 0x8625;
    public static final int GL_VERTEX_ATTRIB_ARRAY_NORMALIZED = 0x886A;
    public static final int GL_CURRENT_VERTEX_ATTRIB = 0x8626;
    public static final int GL_VERTEX_ATTRIB_ARRAY_POINTER = 0x8645;
    public static final int GL_FRAGMENT_SHADER = 0x8B30;
    public static final int GL_MAX_FRAGMENT_UNIFORM_COMPONENTS = 0x8B49;
    public static final int GL_FRAGMENT_SHADER_DERIVATIVE_HINT = 0x8B8B;
    public static final int GL_MAX_DRAW_BUFFERS = 0x8824;
    public static final int GL_DRAW_BUFFER0 = 0x8825;
    public static final int GL_DRAW_BUFFER1 = 0x8826;
    public static final int GL_DRAW_BUFFER2 = 0x8827;
    public static final int GL_DRAW_BUFFER3 = 0x8828;
    public static final int GL_DRAW_BUFFER4 = 0x8829;
    public static final int GL_DRAW_BUFFER5 = 0x882A;
    public static final int GL_DRAW_BUFFER6 = 0x882B;
    public static final int GL_DRAW_BUFFER7 = 0x882C;
    public static final int GL_DRAW_BUFFER8 = 0x882D;
    public static final int GL_DRAW_BUFFER9 = 0x882E;
    public static final int GL_DRAW_BUFFER10 = 0x882F;
    public static final int GL_DRAW_BUFFER11 = 0x8830;
    public static final int GL_DRAW_BUFFER12 = 0x8831;
    public static final int GL_DRAW_BUFFER13 = 0x8832;
    public static final int GL_DRAW_BUFFER14 = 0x8833;
    public static final int GL_DRAW_BUFFER15 = 0x8834;
    public static final int GL_POINT_SPRITE = 0x8861;
    public static final int GL_COORD_REPLACE = 0x8862;
    public static final int GL_POINT_SPRITE_COORD_ORIGIN = 0x8CA0;
    public static final int GL_LOWER_LEFT = 0x8CA1;
    public static final int GL_UPPER_LEFT = 0x8CA2;
    public static final int GL_STENCIL_BACK_FUNC = 0x8800;
    public static final int GL_STENCIL_BACK_FAIL = 0x8801;
    public static final int GL_STENCIL_BACK_PASS_DEPTH_FAIL = 0x8802;
    public static final int GL_STENCIL_BACK_PASS_DEPTH_PASS = 0x8803;
    public static final int GL_STENCIL_BACK_REF = 0x8CA3;
    public static final int GL_STENCIL_BACK_VALUE_MASK = 0x8CA4;
    public static final int GL_STENCIL_BACK_WRITEMASK = 0x8CA5;
    public static final int GL_BLEND_EQUATION_RGB = 0x8009;
    public static final int GL_BLEND_EQUATION_ALPHA = 0x883D;

    static {
        FieldHelper.copyStaticFields(org.lwjgl.opengl.GL20.class, GL20.class);
    }

    private GL20() {}
    
    public static void glShaderSource(int shader, ByteBuffer string) {
        byte[] data = new byte[string.limit()];
        string.position(0);
        string.get(data);
        string.position(0);

        org.lwjgl.opengl.GL20.glShaderSource(shader, new String(data));
    }

    public static void glShaderSource(int shader, CharSequence string) {
        org.lwjgl.opengl.GL20.glShaderSource(shader, string);
    }

    public static void glShaderSource(int shader, CharSequence[] strings) {
        org.lwjgl.opengl.GL20.glShaderSource(shader, strings);
    }

    public static int glCreateShader(int type) {
        return org.lwjgl.opengl.GL20.glCreateShader(type);
    }

    public static boolean glIsShader(int shader) {
        return org.lwjgl.opengl.GL20.glIsShader(shader);
    }

    public static void glCompileShader(int shader) {
        org.lwjgl.opengl.GL20.glCompileShader(shader);
    }

    public static void glDeleteShader(int shader) {
        org.lwjgl.opengl.GL20.glDeleteShader(shader);
    }

    public static int glCreateProgram() {
        return org.lwjgl.opengl.GL20.glCreateProgram();
    }

    public static boolean glIsProgram(int program) {
        return org.lwjgl.opengl.GL20.glIsProgram(program);
    }

    public static void glAttachShader(int program, int shader) {
        org.lwjgl.opengl.GL20.glAttachShader(program, shader);
    }

    public static void glDetachShader(int program, int shader) {
        org.lwjgl.opengl.GL20.glDetachShader(program, shader);
    }

    public static void glLinkProgram(int program) {
        org.lwjgl.opengl.GL20.glLinkProgram(program);
    }

    public static void glUseProgram(int program) {
        org.lwjgl.opengl.GL20.glUseProgram(program);
    }

    public static void glValidateProgram(int program) {
        org.lwjgl.opengl.GL20.glValidateProgram(program);
    }

    public static void glDeleteProgram(int program) {
        org.lwjgl.opengl.GL20.glDeleteProgram(program);
    }

    public static void glUniform1f(int location, float v0) {
        org.lwjgl.opengl.GL20.glUniform1f(location, v0);
    }

    public static void glUniform2f(int location, float v0, float v1) {
        org.lwjgl.opengl.GL20.glUniform2f(location, v0, v1);
    }

    public static void glUniform3f(int location, float v0, float v1, float v2) {
        org.lwjgl.opengl.GL20.glUniform3f(location, v0, v1, v2);
    }

    public static void glUniform4f(int location, float v0, float v1, float v2, float v3) {
        org.lwjgl.opengl.GL20.glUniform4f(location, v0, v1, v2, v3);
    }

    public static void glUniform1i(int location, int v0) {
        org.lwjgl.opengl.GL20.glUniform1i(location, v0);
    }

    public static void glUniform2i(int location, int v0, int v1) {
        org.lwjgl.opengl.GL20.glUniform2i(location, v0, v1);
    }

    public static void glUniform3i(int location, int v0, int v1, int v2) {
        org.lwjgl.opengl.GL20.glUniform3i(location, v0, v1, v2);
    }

    public static void glUniform4i(int location, int v0, int v1, int v2, int v3) {
        org.lwjgl.opengl.GL20.glUniform4i(location, v0, v1, v2, v3);
    }

    public static void glUniform1(int location, FloatBuffer values) {
        org.lwjgl.opengl.GL20.glUniform1fv(location, values);
    }

    public static void glUniform2(int location, FloatBuffer values) {
        org.lwjgl.opengl.GL20.glUniform2fv(location, values);
    }

    public static void glUniform3(int location, FloatBuffer values) {
        org.lwjgl.opengl.GL20.glUniform3fv(location, values);
    }

    public static void glUniform4(int location, FloatBuffer values) {
        org.lwjgl.opengl.GL20.glUniform4fv(location, values);
    }

    public static void glUniform1(int location, IntBuffer values) {
        org.lwjgl.opengl.GL20.glUniform1iv(location, values);
    }

    public static void glUniform2(int location, IntBuffer values) {
        org.lwjgl.opengl.GL20.glUniform2iv(location, values);
    }

    public static void glUniform3(int location, IntBuffer values) {
        org.lwjgl.opengl.GL20.glUniform3iv(location, values);
    }

    public static void glUniform4(int location, IntBuffer values) {
        org.lwjgl.opengl.GL20.glUniform4iv(location, values);
    }

    public static void glUniformMatrix2(int location, boolean transpose, FloatBuffer matrices) {
        org.lwjgl.opengl.GL20.glUniformMatrix2fv(location, transpose, matrices);
    }

    public static void glUniformMatrix3(int location, boolean transpose, FloatBuffer matrices) {
        org.lwjgl.opengl.GL20.glUniformMatrix3fv(location, transpose, matrices);
    }

    public static void glUniformMatrix4(int location, boolean transpose, FloatBuffer matrices) {
        org.lwjgl.opengl.GL20.glUniformMatrix4fv(location, transpose, matrices);
    }

    public static void glGetShader(int shader, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL20.glGetShaderiv(shader, pname, params);
    }

    @Deprecated
    public static int glGetShader(int shader, int pname) {
        return org.lwjgl.opengl.GL20.glGetShaderi(shader, pname);
    }

    public static int glGetShaderi(int shader, int pname) {
        return org.lwjgl.opengl.GL20.glGetShaderi(shader, pname);
    }

    public static void glGetProgram(int program, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL20.glGetProgramiv(program, pname, params);
    }

    @Deprecated
    public static int glGetProgram(int program, int pname) {
        return org.lwjgl.opengl.GL20.glGetProgrami(program, pname);
    }

    public static int glGetProgrami(int program, int pname) {
        return org.lwjgl.opengl.GL20.glGetProgrami(program, pname);
    }

    public static void glGetShaderInfoLog(int shader, IntBuffer length, ByteBuffer infoLog) {
        org.lwjgl.opengl.GL20.glGetShaderInfoLog(shader, length, infoLog);
    }

    public static String glGetShaderInfoLog(int shader, int maxLength) {
        return org.lwjgl.opengl.GL20.glGetShaderInfoLog(shader, maxLength);
    }

    public static void glGetProgramInfoLog(int program, IntBuffer length, ByteBuffer infoLog) {
        org.lwjgl.opengl.GL20.glGetProgramInfoLog(program, length, infoLog);
    }

    public static String glGetProgramInfoLog(int program, int maxLength) {
        return org.lwjgl.opengl.GL20.glGetProgramInfoLog(program, maxLength);
    }

    public static void glGetAttachedShaders(int program, IntBuffer count, IntBuffer shaders) {
        org.lwjgl.opengl.GL20.glGetAttachedShaders(program, count, shaders);
    }

    public static int glGetUniformLocation(int program, ByteBuffer name) {
        return org.lwjgl.opengl.GL20.glGetUniformLocation(program, name);
    }

    public static int glGetUniformLocation(int program, CharSequence name) {
        return org.lwjgl.opengl.GL20.glGetUniformLocation(program, name);
    }

    public static void glGetActiveUniform(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
        org.lwjgl.opengl.GL20.glGetActiveUniform(program, index, length, size, type, name);
    }

    public static String glGetActiveUniform(int program, int index, int maxLength, IntBuffer sizeType) {
        throw new NotImplementedException();
    }

    public static String glGetActiveUniform(int program, int index, int maxLength) {
        throw new NotImplementedException();
    }

    public static int glGetActiveUniformSize(int program, int index) {
        throw new NotImplementedException();
    }

    public static int glGetActiveUniformType(int program, int index) {
        throw new NotImplementedException();
    }

    public static void glGetUniform(int program, int location, FloatBuffer params) {
        org.lwjgl.opengl.GL20.glGetUniformfv(program, location, params);
    }

    public static void glGetUniform(int program, int location, IntBuffer params) {
        org.lwjgl.opengl.GL20.glGetUniformiv(program, location, params);
    }

    public static void glGetShaderSource(int shader, IntBuffer length, ByteBuffer source) {
        org.lwjgl.opengl.GL20.glGetShaderSource(shader, length, source);
    }

    public static String glGetShaderSource(int shader, int maxLength) {
        return org.lwjgl.opengl.GL20.glGetShaderSource(shader, maxLength);
    }

    public static void glVertexAttrib1s(int index, short x) {
        org.lwjgl.opengl.GL20.glVertexAttrib1s(index, x);
    }

    public static void glVertexAttrib1f(int index, float x) {
        org.lwjgl.opengl.GL20.glVertexAttrib1f(index, x);
    }

    public static void glVertexAttrib1d(int index, double x) {
        org.lwjgl.opengl.GL20.glVertexAttrib1d(index, x);
    }

    public static void glVertexAttrib2s(int index, short x, short y) {
        org.lwjgl.opengl.GL20.glVertexAttrib2s(index, x, y);
    }

    public static void glVertexAttrib2f(int index, float x, float y) {
        org.lwjgl.opengl.GL20.glVertexAttrib2f(index, x, y);
    }

    public static void glVertexAttrib2d(int index, double x, double y) {
        org.lwjgl.opengl.GL20.glVertexAttrib2d(index, x, y);
    }

    public static void glVertexAttrib3s(int index, short x, short y, short z) {
        org.lwjgl.opengl.GL20.glVertexAttrib3s(index, x, y, z);
    }

    public static void glVertexAttrib3f(int index, float x, float y, float z) {
        org.lwjgl.opengl.GL20.glVertexAttrib3f(index, x, y, z);
    }

    public static void glVertexAttrib3d(int index, double x, double y, double z) {
        org.lwjgl.opengl.GL20.glVertexAttrib3d(index, x, y, z);
    }

    public static void glVertexAttrib4s(int index, short x, short y, short z, short w) {
        org.lwjgl.opengl.GL20.glVertexAttrib4s(index, x, y, z, w);
    }

    public static void glVertexAttrib4f(int index, float x, float y, float z, float w) {
        org.lwjgl.opengl.GL20.glVertexAttrib4f(index, x, y, z, w);
    }

    public static void glVertexAttrib4d(int index, double x, double y, double z, double w) {
        org.lwjgl.opengl.GL20.glVertexAttrib4d(index, x, y, z, w);
    }

    public static void glVertexAttrib4Nub(int index, byte x, byte y, byte z, byte w) {
        org.lwjgl.opengl.GL20.glVertexAttrib4Nub(index, x, y, z, w);
    }

    public static void glVertexAttribPointer(int index, int size, boolean normalized, int stride, DoubleBuffer buffer) {
        try(MemoryStack stack = MemoryStack.stackPush()){
            ByteBuffer bytes = stack.calloc(buffer.limit() * Double.BYTES);
            buffer.position(0);
            bytes.asDoubleBuffer().put(buffer);
            buffer.position(0);
            bytes.position(0);
            org.lwjgl.opengl.GL20.glVertexAttribPointer(index, size, GL11.GL_DOUBLE, normalized, stride, bytes);
        }
    }

    public static void glVertexAttribPointer(int index, int size, boolean normalized, int stride, FloatBuffer buffer) {
        org.lwjgl.opengl.GL20.glVertexAttribPointer(index, size, GL11.GL_FLOAT, normalized, stride, buffer);
    }

    public static void glVertexAttribPointer(int index, int size, boolean unsigned, boolean normalized, int stride, ByteBuffer buffer) {
        org.lwjgl.opengl.GL20.glVertexAttribPointer(index, size, GL11.GL_BYTE, normalized, stride, buffer);
    }

    public static void glVertexAttribPointer(int index, int size, boolean unsigned, boolean normalized, int stride, IntBuffer buffer) {
        org.lwjgl.opengl.GL20.glVertexAttribPointer(index, size, unsigned ? GL11.GL_UNSIGNED_INT : GL11.GL_INT, normalized, stride, buffer);
    }

    public static void glVertexAttribPointer(int index, int size, boolean unsigned, boolean normalized, int stride, ShortBuffer buffer) {
        org.lwjgl.opengl.GL20.glVertexAttribPointer(index, size, unsigned ? GL11.GL_UNSIGNED_SHORT : GL11.GL_SHORT, normalized, stride, buffer);
    }

    public static void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long buffer_buffer_offset) {
        org.lwjgl.opengl.GL20.glVertexAttribPointer(index, size, type, normalized, stride, buffer_buffer_offset);
    }

    public static void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, ByteBuffer buffer) {
        org.lwjgl.opengl.GL20.glVertexAttribPointer(index, size, type, normalized, stride, buffer);
    }

    public static void glEnableVertexAttribArray(int index) {
        org.lwjgl.opengl.GL20.glEnableVertexAttribArray(index);
    }

    public static void glDisableVertexAttribArray(int index) {
        org.lwjgl.opengl.GL20.glDisableVertexAttribArray(index);
    }

    public static void glGetVertexAttrib(int index, int pname, FloatBuffer params) {
        org.lwjgl.opengl.GL20.glGetVertexAttribfv(index, pname, params);
    }

    public static void glGetVertexAttrib(int index, int pname, DoubleBuffer params) {
        throw new NotImplementedException();
    }

    public static void glGetVertexAttrib(int index, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL20.glGetVertexAttribiv(index, pname, params);
    }

    public static ByteBuffer glGetVertexAttribPointer(int index, int pname, long result_size) {
        throw new RuntimeException("GL20.glGetVertexAttribPointer(int index, int pname, long result_size) is not implemented!");
    }

    public static void glGetVertexAttribPointer(int index, int pname, ByteBuffer pointer) {
        throw new NotImplementedException();
    }

    public static void glBindAttribLocation(int program, int index, ByteBuffer name) {
        org.lwjgl.opengl.GL20.glBindAttribLocation(program, index, name);
    }

    public static void glBindAttribLocation(int program, int index, CharSequence name) {
        org.lwjgl.opengl.GL20.glBindAttribLocation(program, index, name);
    }

    public static void glGetActiveAttrib(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name) {
        org.lwjgl.opengl.GL20.glGetActiveAttrib(program, index, length, size, type, name);
    }

    public static String glGetActiveAttrib(int program, int index, int maxLength, IntBuffer sizeType) {
        throw new NotImplementedException();
    }

    public static String glGetActiveAttrib(int program, int index, int maxLength) {
        throw new NotImplementedException();
    }

    public static int glGetActiveAttribSize(int program, int index) {
        throw new NotImplementedException();
    }

    public static int glGetActiveAttribType(int program, int index) {
        throw new NotImplementedException();
    }

    public static int glGetAttribLocation(int program, ByteBuffer name) {
        return org.lwjgl.opengl.GL20.glGetAttribLocation(program, name);
    }
    
    public static int glGetAttribLocation(int program, CharSequence name) {
        return org.lwjgl.opengl.GL20.glGetAttribLocation(program, name);
    }

    public static void glDrawBuffers(IntBuffer buffers) {
        org.lwjgl.opengl.GL20.glDrawBuffers(buffers);
    }

    public static void glDrawBuffers(int buffer) {
        org.lwjgl.opengl.GL20.glDrawBuffers(buffer);
    }

    public static void glStencilOpSeparate(int face, int sfail, int dpfail, int dppass) {
        org.lwjgl.opengl.GL20.glStencilOpSeparate(face, sfail, dpfail, dppass);
    }

    public static void glStencilFuncSeparate(int face, int func, int ref, int mask) {
        org.lwjgl.opengl.GL20.glStencilFuncSeparate(face, func, ref, mask);
    }

    public static void glStencilMaskSeparate(int face, int mask) {
        org.lwjgl.opengl.GL20.glStencilMaskSeparate(face, mask);
    }

    public static void glBlendEquationSeparate(int modeRGB, int modeAlpha) {
        org.lwjgl.opengl.GL20.glBlendEquationSeparate(modeRGB, modeAlpha);
    }
}
