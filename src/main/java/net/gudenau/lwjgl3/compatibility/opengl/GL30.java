package net.gudenau.lwjgl3.compatibility.opengl;

import net.gudenau.lwjgl3.NotImplementedException;
import net.gudenau.lwjgl3.helper.FieldHelper;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

/**
 * Created by gudenau on 5/31/2017.
 * <p>
 * LWJGL3
 */
@SuppressWarnings({"unused", "SpellCheckingInspection"})
public class GL30{
    public static final int GL_MAJOR_VERSION = 0x821B;
    public static final int GL_MINOR_VERSION = 0x821C;
    public static final int GL_NUM_EXTENSIONS = 0x821D;
    public static final int GL_CONTEXT_FLAGS = 0x821E;
    public static final int GL_CONTEXT_FLAG_FORWARD_COMPATIBLE_BIT = 0x1;
    public static final int GL_DEPTH_BUFFER = 0x8223;
    public static final int GL_STENCIL_BUFFER = 0x8224;
    public static final int GL_COMPRESSED_RED = 0x8225;
    public static final int GL_COMPRESSED_RG = 0x8226;
    public static final int GL_COMPARE_REF_TO_TEXTURE = 0x884E;
    public static final int GL_CLIP_DISTANCE0 = 0x3000;
    public static final int GL_CLIP_DISTANCE1 = 0x3001;
    public static final int GL_CLIP_DISTANCE2 = 0x3002;
    public static final int GL_CLIP_DISTANCE3 = 0x3003;
    public static final int GL_CLIP_DISTANCE4 = 0x3004;
    public static final int GL_CLIP_DISTANCE5 = 0x3005;
    public static final int GL_CLIP_DISTANCE6 = 0x3006;
    public static final int GL_CLIP_DISTANCE7 = 0x3007;
    public static final int GL_MAX_CLIP_DISTANCES = 0xD32;
    public static final int GL_MAX_VARYING_COMPONENTS = 0x8B4B;
    public static final int GL_BUFFER_ACCESS_FLAGS = 0x911F;
    public static final int GL_BUFFER_MAP_LENGTH = 0x9120;
    public static final int GL_BUFFER_MAP_OFFSET = 0x9121;

    public static final int GL_VERTEX_ATTRIB_ARRAY_INTEGER = 0x88FD;

    public static final int GL_SAMPLER_BUFFER = 0x8DC2;
    public static final int GL_SAMPLER_CUBE_SHADOW = 0x8DC5;
    public static final int GL_UNSIGNED_INT_VEC2 = 0x8DC6;
    public static final int GL_UNSIGNED_INT_VEC3 = 0x8DC7;
    public static final int GL_UNSIGNED_INT_VEC4 = 0x8DC8;
    public static final int GL_INT_SAMPLER_1D = 0x8DC9;
    public static final int GL_INT_SAMPLER_2D = 0x8DCA;
    public static final int GL_INT_SAMPLER_3D = 0x8DCB;
    public static final int GL_INT_SAMPLER_CUBE = 0x8DCC;
    public static final int GL_INT_SAMPLER_2D_RECT = 0x8DCD;
    public static final int GL_INT_SAMPLER_1D_ARRAY = 0x8DCE;
    public static final int GL_INT_SAMPLER_2D_ARRAY = 0x8DCF;
    public static final int GL_INT_SAMPLER_BUFFER = 0x8DD0;
    public static final int GL_UNSIGNED_INT_SAMPLER_1D = 0x8DD1;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D = 0x8DD2;
    public static final int GL_UNSIGNED_INT_SAMPLER_3D = 0x8DD3;
    public static final int GL_UNSIGNED_INT_SAMPLER_CUBE = 0x8DD4;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_RECT = 0x8DD5;
    public static final int GL_UNSIGNED_INT_SAMPLER_1D_ARRAY = 0x8DD6;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_ARRAY = 0x8DD7;
    public static final int GL_UNSIGNED_INT_SAMPLER_BUFFER = 0x8DD8;

    public static final int GL_MIN_PROGRAM_TEXEL_OFFSET = 0x8904;
    public static final int GL_MAX_PROGRAM_TEXEL_OFFSET = 0x8905;

    public static final int GL_QUERY_WAIT = 0x8E13;
    public static final int GL_QUERY_NO_WAIT = 0x8E14;
    public static final int GL_QUERY_BY_REGION_WAIT = 0x8E15;
    public static final int GL_QUERY_BY_REGION_NO_WAIT = 0x8E16;

    public static final int GL_MAP_READ_BIT = 0x1;
    public static final int GL_MAP_WRITE_BIT = 0x2;
    public static final int GL_MAP_INVALIDATE_RANGE_BIT = 0x4;
    public static final int GL_MAP_INVALIDATE_BUFFER_BIT = 0x8;
    public static final int GL_MAP_FLUSH_EXPLICIT_BIT = 0x10;
    public static final int GL_MAP_UNSYNCHRONIZED_BIT = 0x20;

    public static final int GL_CLAMP_VERTEX_COLOR = 0x891A;
    public static final int GL_CLAMP_FRAGMENT_COLOR = 0x891B;
    public static final int GL_CLAMP_READ_COLOR = 0x891C;

    public static final int GL_FIXED_ONLY = 0x891D;

    public static final int GL_DEPTH_COMPONENT32F = 0x8CAC;
    public static final int GL_DEPTH32F_STENCIL8 = 0x8CAD;

    public static final int GL_TEXTURE_RED_TYPE = 0x8C10;
    public static final int GL_TEXTURE_GREEN_TYPE = 0x8C11;
    public static final int GL_TEXTURE_BLUE_TYPE = 0x8C12;
    public static final int GL_TEXTURE_ALPHA_TYPE = 0x8C13;
    public static final int GL_TEXTURE_LUMINANCE_TYPE = 0x8C14;
    public static final int GL_TEXTURE_INTENSITY_TYPE = 0x8C15;
    public static final int GL_TEXTURE_DEPTH_TYPE = 0x8C16;

    public static final int GL_UNSIGNED_NORMALIZED = 0x8C17;

    public static final int GL_RGBA32F = 0x8814;
    public static final int GL_RGB32F = 0x8815;
    public static final int GL_ALPHA32F = 0x8816;
    public static final int GL_RGBA16F = 0x881A;
    public static final int GL_RGB16F = 0x881B;
    public static final int GL_ALPHA16F = 0x881C;

    public static final int GL_R11F_G11F_B10F = 0x8C3A;

    public static final int GL_UNSIGNED_INT_10F_11F_11F_REV = 0x8C3B;

    public static final int GL_RGB9_E5 = 0x8C3D;

    public static final int GL_UNSIGNED_INT_5_9_9_9_REV = 0x8C3E;

    public static final int GL_TEXTURE_SHARED_SIZE = 0x8C3F;

    public static final int GL_FRAMEBUFFER = 0x8D40;
    public static final int GL_READ_FRAMEBUFFER = 0x8CA8;
    public static final int GL_DRAW_FRAMEBUFFER = 0x8CA9;

    public static final int GL_RENDERBUFFER = 0x8D41;

    public static final int GL_STENCIL_INDEX1 = 0x8D46;
    public static final int GL_STENCIL_INDEX4 = 0x8D47;
    public static final int GL_STENCIL_INDEX8 = 0x8D48;
    public static final int GL_STENCIL_INDEX16 = 0x8D49;

    public static final int GL_RENDERBUFFER_WIDTH = 0x8D42;
    public static final int GL_RENDERBUFFER_HEIGHT = 0x8D43;
    public static final int GL_RENDERBUFFER_INTERNAL_FORMAT = 0x8D44;
    public static final int GL_RENDERBUFFER_RED_SIZE = 0x8D50;
    public static final int GL_RENDERBUFFER_GREEN_SIZE = 0x8D51;
    public static final int GL_RENDERBUFFER_BLUE_SIZE = 0x8D52;
    public static final int GL_RENDERBUFFER_ALPHA_SIZE = 0x8D53;
    public static final int GL_RENDERBUFFER_DEPTH_SIZE = 0x8D54;
    public static final int GL_RENDERBUFFER_STENCIL_SIZE = 0x8D55;

    public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE = 0x8CD0;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME = 0x8CD1;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL = 0x8CD2;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 0x8CD3;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING = 0x8210;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE = 0x8211;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_RED_SIZE = 0x8212;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_GREEN_SIZE = 0x8213;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_BLUE_SIZE = 0x8214;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE = 0x8215;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE = 0x8216;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE = 0x8217;

    public static final int GL_FRAMEBUFFER_DEFAULT = 0x8218;
    public static final int GL_INDEX = 0x8222;

    public static final int GL_COLOR_ATTACHMENT0 = 0x8CE0;
    public static final int GL_COLOR_ATTACHMENT1 = 0x8CE1;
    public static final int GL_COLOR_ATTACHMENT2 = 0x8CE2;
    public static final int GL_COLOR_ATTACHMENT3 = 0x8CE3;
    public static final int GL_COLOR_ATTACHMENT4 = 0x8CE4;
    public static final int GL_COLOR_ATTACHMENT5 = 0x8CE5;
    public static final int GL_COLOR_ATTACHMENT6 = 0x8CE6;
    public static final int GL_COLOR_ATTACHMENT7 = 0x8CE7;
    public static final int GL_COLOR_ATTACHMENT8 = 0x8CE8;
    public static final int GL_COLOR_ATTACHMENT9 = 0x8CE9;
    public static final int GL_COLOR_ATTACHMENT10 = 0x8CEA;
    public static final int GL_COLOR_ATTACHMENT11 = 0x8CEB;
    public static final int GL_COLOR_ATTACHMENT12 = 0x8CEC;
    public static final int GL_COLOR_ATTACHMENT13 = 0x8CED;
    public static final int GL_COLOR_ATTACHMENT14 = 0x8CEE;
    public static final int GL_COLOR_ATTACHMENT15 = 0x8CEF;
    public static final int GL_DEPTH_ATTACHMENT = 0x8D00;
    public static final int GL_STENCIL_ATTACHMENT = 0x8D20;
    public static final int GL_DEPTH_STENCIL_ATTACHMENT = 0x821A;

    public static final int GL_FRAMEBUFFER_COMPLETE = 0x8CD5;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT = 0x8CD6;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 0x8CD7;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER = 0x8CDB;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER = 0x8CDC;
    public static final int GL_FRAMEBUFFER_UNSUPPORTED = 0x8CDD;
    public static final int GL_FRAMEBUFFER_UNDEFINED = 0x8219;

    public static final int GL_FRAMEBUFFER_BINDING = 0x8CA6;
    public static final int GL_RENDERBUFFER_BINDING = 0x8CA7;
    public static final int GL_MAX_COLOR_ATTACHMENTS = 0x8CDF;
    public static final int GL_MAX_RENDERBUFFER_SIZE = 0x84E8;

    public static final int GL_INVALID_FRAMEBUFFER_OPERATION = 0x506;

    public static final int GL_HALF_FLOAT = 0x140B;

    public static final int GL_RENDERBUFFER_SAMPLES = 0x8CAB;

    public static final int GL_FRAMEBUFFER_INCOMPLETE_MULTISAMPLE = 0x8D56;

    public static final int GL_MAX_SAMPLES = 0x8D57;

    public static final int GL_DRAW_FRAMEBUFFER_BINDING = 0x8CA6;
    public static final int GL_READ_FRAMEBUFFER_BINDING = 0x8CAA;

    public static final int GL_RGBA_INTEGER_MODE = 0x8D9E;

    public static final int GL_RGBA32UI = 0x8D70;
    public static final int GL_RGB32UI = 0x8D71;
    public static final int GL_ALPHA32UI = 0x8D72;
    public static final int GL_RGBA16UI = 0x8D76;
    public static final int GL_RGB16UI = 0x8D77;
    public static final int GL_ALPHA16UI = 0x8D78;
    public static final int GL_RGBA8UI = 0x8D7C;
    public static final int GL_RGB8UI = 0x8D7D;
    public static final int GL_ALPHA8UI = 0x8D7E;
    public static final int GL_RGBA32I = 0x8D82;
    public static final int GL_RGB32I = 0x8D83;
    public static final int GL_ALPHA32I = 0x8D84;
    public static final int GL_RGBA16I = 0x8D88;
    public static final int GL_RGB16I = 0x8D89;
    public static final int GL_ALPHA16I = 0x8D8A;
    public static final int GL_RGBA8I = 0x8D8E;
    public static final int GL_RGB8I = 0x8D8F;
    public static final int GL_ALPHA8I = 0x8D90;

    public static final int GL_RED_INTEGER = 0x8D94;
    public static final int GL_GREEN_INTEGER = 0x8D95;
    public static final int GL_BLUE_INTEGER = 0x8D96;
    public static final int GL_ALPHA_INTEGER = 0x8D97;
    public static final int GL_RGB_INTEGER = 0x8D98;
    public static final int GL_RGBA_INTEGER = 0x8D99;
    public static final int GL_BGR_INTEGER = 0x8D9A;
    public static final int GL_BGRA_INTEGER = 0x8D9B;

    public static final int GL_TEXTURE_1D_ARRAY = 0x8C18;
    public static final int GL_TEXTURE_2D_ARRAY = 0x8C1A;

    public static final int GL_PROXY_TEXTURE_2D_ARRAY = 0x8C1B;

    public static final int GL_PROXY_TEXTURE_1D_ARRAY = 0x8C19;

    public static final int GL_TEXTURE_BINDING_1D_ARRAY = 0x8C1C;
    public static final int GL_TEXTURE_BINDING_2D_ARRAY = 0x8C1D;
    public static final int GL_MAX_ARRAY_TEXTURE_LAYERS = 0x88FF;

    public static final int GL_COMPARE_REF_DEPTH_TO_TEXTURE = 0x884E;

    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER = 0x8CD4;

    public static final int GL_SAMPLER_1D_ARRAY = 0x8DC0;
    public static final int GL_SAMPLER_2D_ARRAY = 0x8DC1;
    public static final int GL_SAMPLER_1D_ARRAY_SHADOW = 0x8DC3;
    public static final int GL_SAMPLER_2D_ARRAY_SHADOW = 0x8DC4;

    public static final int GL_DEPTH_STENCIL = 0x84F9;

    public static final int GL_UNSIGNED_INT_24_8 = 0x84FA;

    public static final int GL_DEPTH24_STENCIL8 = 0x88F0;

    public static final int GL_TEXTURE_STENCIL_SIZE = 0x88F1;

    public static final int GL_COMPRESSED_RED_RGTC1 = 0x8DBB;
    public static final int GL_COMPRESSED_SIGNED_RED_RGTC1 = 0x8DBC;
    public static final int GL_COMPRESSED_RG_RGTC2 = 0x8DBD;
    public static final int GL_COMPRESSED_SIGNED_RG_RGTC2 = 0x8DBE;

    public static final int GL_R8 = 0x8229;
    public static final int GL_R16 = 0x822A;
    public static final int GL_RG8 = 0x822B;
    public static final int GL_RG16 = 0x822C;
    public static final int GL_R16F = 0x822D;
    public static final int GL_R32F = 0x822E;
    public static final int GL_RG16F = 0x822F;
    public static final int GL_RG32F = 0x8230;
    public static final int GL_R8I = 0x8231;
    public static final int GL_R8UI = 0x8232;
    public static final int GL_R16I = 0x8233;
    public static final int GL_R16UI = 0x8234;
    public static final int GL_R32I = 0x8235;
    public static final int GL_R32UI = 0x8236;
    public static final int GL_RG8I = 0x8237;
    public static final int GL_RG8UI = 0x8238;
    public static final int GL_RG16I = 0x8239;
    public static final int GL_RG16UI = 0x823A;
    public static final int GL_RG32I = 0x823B;
    public static final int GL_RG32UI = 0x823C;

    public static final int GL_RG = 0x8227;
    public static final int GL_RG_INTEGER = 0x8228;

    public static final int GL_TRANSFORM_FEEDBACK_BUFFER = 0x8C8E;

    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_START = 0x8C84;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_SIZE = 0x8C85;

    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING = 0x8C8F;

    public static final int GL_INTERLEAVED_ATTRIBS = 0x8C8C;
    public static final int GL_SEPARATE_ATTRIBS = 0x8C8D;

    public static final int GL_PRIMITIVES_GENERATED = 0x8C87;
    public static final int GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN = 0x8C88;

    public static final int GL_RASTERIZER_DISCARD = 0x8C89;

    public static final int GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS = 0x8C8A;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS = 0x8C8B;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS = 0x8C80;

    public static final int GL_TRANSFORM_FEEDBACK_VARYINGS = 0x8C83;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_MODE = 0x8C7F;
    public static final int GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH = 0x8C76;

    public static final int GL_VERTEX_ARRAY_BINDING = 0x85B5;

    public static final int GL_FRAMEBUFFER_SRGB = 0x8DB9;

    public static final int GL_FRAMEBUFFER_SRGB_CAPABLE = 0x8DBA;

    static {
        FieldHelper.copyStaticFields(org.lwjgl.opengl.GL30.class, GL30.class);
    }

    private GL30(){
    }

    public static String glGetStringi(int name, int index){
        return org.lwjgl.opengl.GL30.glGetStringi(name, index);
    }

    public static void glClearBuffer(int buffer, int drawbuffer, FloatBuffer value){
        org.lwjgl.opengl.GL30.glClearBufferfv(buffer, drawbuffer, value);
    }

    public static void glClearBuffer(int buffer, int drawbuffer, IntBuffer value){
        org.lwjgl.opengl.GL30.glClearBufferiv(buffer, drawbuffer, value);
    }

    public static void glClearBufferu(int buffer, int drawbuffer, IntBuffer value){
        org.lwjgl.opengl.GL30.glClearBufferuiv(buffer, drawbuffer, value);
    }

    public static void glClearBufferfi(int buffer, int drawbuffer, float depth, int stencil){
        org.lwjgl.opengl.GL30.glClearBufferfi(buffer, drawbuffer, depth, stencil);
    }

    public static void glVertexAttribI1i(int index, int x){
        org.lwjgl.opengl.GL30.glVertexAttribI1i(index, x);
    }

    public static void glVertexAttribI2i(int index, int x, int y){
        org.lwjgl.opengl.GL30.glVertexAttribI2i(index, x, y);
    }

    public static void glVertexAttribI3i(int index, int x, int y, int z){
        org.lwjgl.opengl.GL30.glVertexAttribI3i(index, x, y, z);
    }

    public static void glVertexAttribI4i(int index, int x, int y, int z, int w){
        org.lwjgl.opengl.GL30.glVertexAttribI4i(index, x, y, z, w);
    }

    public static void glVertexAttribI1ui(int index, int x){
        org.lwjgl.opengl.GL30.glVertexAttribI1ui(index, x);
    }

    public static void glVertexAttribI2ui(int index, int x, int y){
        org.lwjgl.opengl.GL30.glVertexAttribI2ui(index, x, y);
    }

    public static void glVertexAttribI3ui(int index, int x, int y, int z){
        org.lwjgl.opengl.GL30.glVertexAttribI3ui(index, x, y, z);
    }

    public static void glVertexAttribI4ui(int index, int x, int y, int z, int w){
        org.lwjgl.opengl.GL30.glVertexAttribI4ui(index, x, y, z, w);
    }

    public static void glVertexAttribI1(int index, IntBuffer v){
        org.lwjgl.opengl.GL30.glVertexAttribI1iv(index, v);
    }

    public static void glVertexAttribI2(int index, IntBuffer v){
        org.lwjgl.opengl.GL30.glVertexAttribI2iv(index, v);
    }

    public static void glVertexAttribI3(int index, IntBuffer v){
        org.lwjgl.opengl.GL30.glVertexAttribI3iv(index, v);
    }

    public static void glVertexAttribI4(int index, IntBuffer v){
        org.lwjgl.opengl.GL30.glVertexAttribI4iv(index, v);
    }

    public static void glVertexAttribI1u(int index, IntBuffer v){
        org.lwjgl.opengl.GL30.glVertexAttribI1uiv(index, v);
    }

    public static void glVertexAttribI2u(int index, IntBuffer v){
        org.lwjgl.opengl.GL30.glVertexAttribI2uiv(index, v);
    }

    public static void glVertexAttribI3u(int index, IntBuffer v){
        org.lwjgl.opengl.GL30.glVertexAttribI3uiv(index, v);
    }

    public static void glVertexAttribI4u(int index, IntBuffer v){
        org.lwjgl.opengl.GL30.glVertexAttribI4uiv(index, v);
    }

    public static void glVertexAttribI4(int index, ByteBuffer v){
        org.lwjgl.opengl.GL30.glVertexAttribI4bv(index, v);
    }

    public static void glVertexAttribI4(int index, ShortBuffer v){
        org.lwjgl.opengl.GL30.glVertexAttribI4sv(index, v);
    }

    public static void glVertexAttribI4u(int index, ByteBuffer v){
        org.lwjgl.opengl.GL30.glVertexAttribI4ubv(index, v);
    }

    public static void glVertexAttribI4u(int index, ShortBuffer v){
        org.lwjgl.opengl.GL30.glVertexAttribI4usv(index, v);
    }

    public static void glVertexAttribIPointer(int index, int size, int type, int stride, ByteBuffer buffer){
        org.lwjgl.opengl.GL30.glVertexAttribIPointer(index, size, type, stride, buffer);
    }

    public static void glVertexAttribIPointer(int index, int size, int type, int stride, IntBuffer buffer){
        org.lwjgl.opengl.GL30.glVertexAttribIPointer(index, size, type, stride, buffer);
    }

    public static void glVertexAttribIPointer(int index, int size, int type, int stride, ShortBuffer buffer){
        org.lwjgl.opengl.GL30.glVertexAttribIPointer(index, size, type, stride, buffer);
    }

    public static void glVertexAttribIPointer(int index, int size, int type, int stride, long buffer_buffer_offset){
        org.lwjgl.opengl.GL30.glVertexAttribIPointer(index, size, type, stride, buffer_buffer_offset);
    }

    public static void glGetVertexAttribI(int index, int pname, IntBuffer params){
        org.lwjgl.opengl.GL30.glGetVertexAttribIiv(index, pname, params);
    }

    public static void glGetVertexAttribIu(int index, int pname, IntBuffer params){
        org.lwjgl.opengl.GL30.glGetVertexAttribIuiv(index, pname, params);
    }

    public static void glUniform1ui(int location, int v0){
        org.lwjgl.opengl.GL30.glUniform1ui(location, v0);
    }

    public static void glUniform2ui(int location, int v0, int v1){
        org.lwjgl.opengl.GL30.glUniform2ui(location, v0, v1);
    }

    public static void glUniform3ui(int location, int v0, int v1, int v2){
        org.lwjgl.opengl.GL30.glUniform3ui(location, v0, v1, v2);
    }

    public static void glUniform4ui(int location, int v0, int v1, int v2, int v3){
        org.lwjgl.opengl.GL30.glUniform4ui(location, v0, v1, v2, v3);
    }

    public static void glUniform1u(int location, IntBuffer value){
        org.lwjgl.opengl.GL30.glUniform1uiv(location, value);
    }

    public static void glUniform2u(int location, IntBuffer value){
        org.lwjgl.opengl.GL30.glUniform2uiv(location, value);
    }

    public static void glUniform3u(int location, IntBuffer value){
        org.lwjgl.opengl.GL30.glUniform3uiv(location, value);
    }

    public static void glUniform4u(int location, IntBuffer value){
        org.lwjgl.opengl.GL30.glUniform4uiv(location, value);
    }

    public static void glGetUniformu(int program, int location, IntBuffer params){
        org.lwjgl.opengl.GL30.glGetUniformuiv(program, location, params);
    }

    public static void glBindFragDataLocation(int program, int colorNumber, ByteBuffer name){
        org.lwjgl.opengl.GL30.glBindFragDataLocation(program, colorNumber, name);
    }

    public static void glBindFragDataLocation(int program, int colorNumber, CharSequence name){
        org.lwjgl.opengl.GL30.glBindFragDataLocation(program, colorNumber, name);
    }

    public static int glGetFragDataLocation(int program, ByteBuffer name){
        return org.lwjgl.opengl.GL30.glGetFragDataLocation(program, name);
    }

    public static int glGetFragDataLocation(int program, CharSequence name){
        return org.lwjgl.opengl.GL30.glGetFragDataLocation(program, name);
    }

    public static void glBeginConditionalRender(int id, int mode){
        org.lwjgl.opengl.GL30.glBeginConditionalRender(id, mode);
    }

    public static void glEndConditionalRender(){
        org.lwjgl.opengl.GL30.glEndConditionalRender();
    }

    public static ByteBuffer glMapBufferRange(int target, long offset, long length, int access, ByteBuffer old_buffer){
        return org.lwjgl.opengl.GL30.glMapBufferRange(target, offset, length, access, old_buffer);
    }

    public static void glFlushMappedBufferRange(int target, long offset, long length){
        org.lwjgl.opengl.GL30.glFlushMappedBufferRange(target, offset, length);
    }

    public static void glClampColor(int target, int clamp){
        org.lwjgl.opengl.GL30.glClampColor(target, clamp);
    }

    public static boolean glIsRenderbuffer(int renderbuffer){
        return org.lwjgl.opengl.GL30.glIsRenderbuffer(renderbuffer);
    }

    public static void glBindRenderbuffer(int target, int renderbuffer){
        org.lwjgl.opengl.GL30.glBindRenderbuffer(target, renderbuffer);
    }

    public static void glDeleteRenderbuffers(IntBuffer renderbuffers){
        org.lwjgl.opengl.GL30.glDeleteRenderbuffers(renderbuffers);
    }

    public static void glDeleteRenderbuffers(int renderbuffer){
        org.lwjgl.opengl.GL30.glDeleteRenderbuffers(renderbuffer);
    }

    public static void glGenRenderbuffers(IntBuffer renderbuffers){
        org.lwjgl.opengl.GL30.glGenRenderbuffers(renderbuffers);
    }

    public static int glGenRenderbuffers(){
        return org.lwjgl.opengl.GL30.glGenRenderbuffers();
    }

    public static void glRenderbufferStorage(int target, int internalformat, int width, int height){
        org.lwjgl.opengl.GL30.glRenderbufferStorage(target, internalformat, width, height);
    }

    public static void glGetRenderbufferParameter(int target, int pname, IntBuffer params){
        org.lwjgl.opengl.GL30.glGetRenderbufferParameteriv(target, pname, params);
    }

    @Deprecated
    public static int glGetRenderbufferParameter(int target, int pname){
        return org.lwjgl.opengl.GL30.glGetRenderbufferParameteri(target, pname);
    }

    public static int glGetRenderbufferParameteri(int target, int pname){
        return org.lwjgl.opengl.GL30.glGetRenderbufferParameteri(target, pname);
    }

    public static boolean glIsFramebuffer(int framebuffer){
        return org.lwjgl.opengl.GL30.glIsFramebuffer(framebuffer);
    }

    public static void glBindFramebuffer(int target, int framebuffer){
        org.lwjgl.opengl.GL30.glBindFramebuffer(target, framebuffer);
    }

    public static void glDeleteFramebuffers(IntBuffer framebuffers){
        org.lwjgl.opengl.GL30.glDeleteFramebuffers(framebuffers);
    }

    public static void glDeleteFramebuffers(int framebuffer){
        org.lwjgl.opengl.GL30.glDeleteFramebuffers(framebuffer);
    }

    public static void glGenFramebuffers(IntBuffer framebuffers){
        org.lwjgl.opengl.GL30.glGenFramebuffers(framebuffers);
    }

    public static int glGenFramebuffers(){
        return org.lwjgl.opengl.GL30.glGenFramebuffers();
    }

    public static int glCheckFramebufferStatus(int target){
        return org.lwjgl.opengl.GL30.glCheckFramebufferStatus(target);
    }

    public static void glFramebufferTexture1D(int target, int attachment, int textarget, int texture, int level){
        org.lwjgl.opengl.GL30.glFramebufferTexture1D(target, attachment, textarget, texture, level);
    }

    public static void glFramebufferTexture2D(int target, int attachment, int textarget, int texture, int level){
        org.lwjgl.opengl.GL30.glFramebufferTexture2D(target, attachment, textarget, texture, level);
    }

    public static void glFramebufferTexture3D(int target, int attachment, int textarget, int texture, int level, int zoffset){
        org.lwjgl.opengl.GL30.glFramebufferTexture3D(target, attachment, textarget, texture, level, zoffset);
    }

    public static void glFramebufferRenderbuffer(int target, int attachment, int renderbuffertarget, int renderbuffer){
        org.lwjgl.opengl.GL30.glFramebufferRenderbuffer(target, attachment, renderbuffertarget, renderbuffer);
    }

    public static void glGetFramebufferAttachmentParameter(int target, int attachment, int pname, IntBuffer params){
        org.lwjgl.opengl.GL30.glGetFramebufferAttachmentParameteriv(target, attachment, pname, params);
    }

    @Deprecated
    public static int glGetFramebufferAttachmentParameter(int target, int attachment, int pname){
        return org.lwjgl.opengl.GL30.glGetFramebufferAttachmentParameteri(target, attachment, pname);
    }

    public static int glGetFramebufferAttachmentParameteri(int target, int attachment, int pname){
        return org.lwjgl.opengl.GL30.glGetFramebufferAttachmentParameteri(target, attachment, pname);
    }

    public static void glGenerateMipmap(int target){
        org.lwjgl.opengl.GL30.glGenerateMipmap(target);
    }

    public static void glRenderbufferStorageMultisample(int target, int samples, int internalformat, int width, int height){
        org.lwjgl.opengl.GL30.glRenderbufferStorageMultisample(target, samples, internalformat, width, height);
    }

    public static void glBlitFramebuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter){
        org.lwjgl.opengl.GL30.glBlitFramebuffer(srcX0, srcY0, srcX1, srcY1, dstX0, dstY0, dstX1, dstY1, mask, filter);
    }

    public static void glTexParameterI(int target, int pname, IntBuffer params){
        org.lwjgl.opengl.GL30.glTexParameterIiv(target, pname, params);
    }

    public static void glTexParameterIi(int target, int pname, int param){
        org.lwjgl.opengl.GL30.glTexParameterIi(target, pname, param);
    }

    public static void glTexParameterIu(int target, int pname, IntBuffer params){
        org.lwjgl.opengl.GL30.glTexParameterIuiv(target, pname, params);
    }

    public static void glTexParameterIui(int target, int pname, int param){
        org.lwjgl.opengl.GL30.glTexParameterIui(target, pname, param);
    }

    public static void glGetTexParameterI(int target, int pname, IntBuffer params){
        org.lwjgl.opengl.GL30.glGetTexParameterIiv(target, pname, params);
    }

    public static int glGetTexParameterIi(int target, int pname){
        return org.lwjgl.opengl.GL30.glGetTexParameterIi(target, pname);
    }

    public static void glGetTexParameterIu(int target, int pname, IntBuffer params){
        org.lwjgl.opengl.GL30.glGetTexParameterIuiv(target, pname, params);
    }

    public static int glGetTexParameterIui(int target, int pname){
        return org.lwjgl.opengl.GL30.glGetTexParameterIui(target, pname);
    }

    public static void glFramebufferTextureLayer(int target, int attachment, int texture, int level, int layer){
        org.lwjgl.opengl.GL30.glFramebufferTextureLayer(target, attachment, texture, level, layer);
    }

    public static void glColorMaski(int buf, boolean r, boolean g, boolean b, boolean a){
        org.lwjgl.opengl.GL30.glColorMaski(buf, r, g, b, a);
    }

    public static void glGetBoolean(int value, int index, ByteBuffer data){
        org.lwjgl.opengl.GL30.glGetBooleani_v(value, index, data);
    }

    public static boolean glGetBoolean(int value, int index){
        return org.lwjgl.opengl.GL30.glGetBooleani(value, index);
    }

    public static void glGetInteger(int value, int index, IntBuffer data){
        org.lwjgl.opengl.GL30.glGetIntegeri_v(value, index, data);
    }

    public static int glGetInteger(int value, int index){
        return org.lwjgl.opengl.GL30.glGetIntegeri(value, index);
    }

    public static void glEnablei(int target, int index){
        org.lwjgl.opengl.GL30.glEnablei(target, index);
    }

    public static void glDisablei(int target, int index){
        org.lwjgl.opengl.GL30.glDisablei(target, index);
    }

    public static boolean glIsEnabledi(int target, int index){
        return org.lwjgl.opengl.GL30.glIsEnabledi(target, index);
    }

    public static void glBindBufferRange(int target, int index, int buffer, long offset, long size){
        org.lwjgl.opengl.GL30.glBindBufferRange(target, index, buffer, offset, size);
    }

    public static void glBindBufferBase(int target, int index, int buffer){
        org.lwjgl.opengl.GL30.glBindBufferBase(target, index, buffer);
    }

    public static void glBeginTransformFeedback(int primitiveMode){
        org.lwjgl.opengl.GL30.glBeginTransformFeedback(primitiveMode);
    }

    public static void glEndTransformFeedback(){
        org.lwjgl.opengl.GL30.glEndTransformFeedback();
    }

    public static void glTransformFeedbackVaryings(int program, int count, ByteBuffer varyings, int bufferMode){
        throw new NotImplementedException();
    }

    public static void glTransformFeedbackVaryings(int program, CharSequence[] varyings, int bufferMode){
        org.lwjgl.opengl.GL30.glTransformFeedbackVaryings(program, varyings, bufferMode);
    }

    public static void glGetTransformFeedbackVarying(int program, int index, IntBuffer length, IntBuffer size, IntBuffer type, ByteBuffer name){
        org.lwjgl.opengl.GL30.glGetTransformFeedbackVarying(program, index, length, size, type, name);
    }

    public static String glGetTransformFeedbackVarying(int program, int index, int bufSize, IntBuffer size, IntBuffer type){
        return org.lwjgl.opengl.GL30.glGetTransformFeedbackVarying(program, index, bufSize, size, type);
    }

    public static void glBindVertexArray(int array){
        org.lwjgl.opengl.GL30.glBindVertexArray(array);
    }

    public static void glDeleteVertexArrays(IntBuffer arrays){
        org.lwjgl.opengl.GL30.glDeleteVertexArrays(arrays);
    }

    public static void glDeleteVertexArrays(int array){
        org.lwjgl.opengl.GL30.glDeleteVertexArrays(array);
    }

    public static void glGenVertexArrays(IntBuffer arrays){
        org.lwjgl.opengl.GL30.glGenVertexArrays(arrays);
    }

    public static int glGenVertexArrays(){
        return org.lwjgl.opengl.GL30.glGenVertexArrays();
    }

    public static boolean glIsVertexArray(int array){
        return org.lwjgl.opengl.GL30.glIsVertexArray(array);
    }

}
