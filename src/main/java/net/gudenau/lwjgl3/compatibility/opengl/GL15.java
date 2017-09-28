package net.gudenau.lwjgl3.compatibility.opengl;

import net.gudenau.lwjgl3.NotImplementedException;
import net.gudenau.lwjgl3.helper.FieldHelper;

import java.nio.*;

/**
 * Created by gudenau on 5/31/2017.
 * <p>
 * LWJGL3
 */
@SuppressWarnings({"unused", "SpellCheckingInspection"})
public final class GL15 {
    public static final int GL_ARRAY_BUFFER = 0x8892;
    public static final int GL_ELEMENT_ARRAY_BUFFER = 0x8893;
    public static final int GL_ARRAY_BUFFER_BINDING = 0x8894;
    public static final int GL_ELEMENT_ARRAY_BUFFER_BINDING = 0x8895;
    public static final int GL_VERTEX_ARRAY_BUFFER_BINDING = 0x8896;
    public static final int GL_NORMAL_ARRAY_BUFFER_BINDING = 0x8897;
    public static final int GL_COLOR_ARRAY_BUFFER_BINDING = 0x8898;
    public static final int GL_INDEX_ARRAY_BUFFER_BINDING = 0x8899;
    public static final int GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING = 0x889A;
    public static final int GL_EDGE_FLAG_ARRAY_BUFFER_BINDING = 0x889B;
    public static final int GL_SECONDARY_COLOR_ARRAY_BUFFER_BINDING = 0x889C;
    public static final int GL_FOG_COORDINATE_ARRAY_BUFFER_BINDING = 0x889D;
    public static final int GL_WEIGHT_ARRAY_BUFFER_BINDING = 0x889E;
    public static final int GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = 0x889F;
    public static final int GL_STREAM_DRAW = 0x88E0;
    public static final int GL_STREAM_READ = 0x88E1;
    public static final int GL_STREAM_COPY = 0x88E2;
    public static final int GL_STATIC_DRAW = 0x88E4;
    public static final int GL_STATIC_READ = 0x88E5;
    public static final int GL_STATIC_COPY = 0x88E6;
    public static final int GL_DYNAMIC_DRAW = 0x88E8;
    public static final int GL_DYNAMIC_READ = 0x88E9;
    public static final int GL_DYNAMIC_COPY = 0x88EA;
    public static final int GL_READ_ONLY = 0x88B8;
    public static final int GL_WRITE_ONLY = 0x88B9;
    public static final int GL_READ_WRITE = 0x88BA;
    public static final int GL_BUFFER_SIZE = 0x8764;
    public static final int GL_BUFFER_USAGE = 0x8765;
    public static final int GL_BUFFER_ACCESS = 0x88BB;
    public static final int GL_BUFFER_MAPPED = 0x88BC;
    public static final int GL_BUFFER_MAP_POINTER = 0x88BD;
    public static final int GL_FOG_COORD_SRC = 0x8450;
    public static final int GL_FOG_COORD = 0x8451;
    public static final int GL_CURRENT_FOG_COORD = 0x8453;
    public static final int GL_FOG_COORD_ARRAY_TYPE = 0x8454;
    public static final int GL_FOG_COORD_ARRAY_STRIDE = 0x8455;
    public static final int GL_FOG_COORD_ARRAY_POINTER = 0x8456;
    public static final int GL_FOG_COORD_ARRAY = 0x8457;
    public static final int GL_FOG_COORD_ARRAY_BUFFER_BINDING = 0x889D;
    public static final int GL_SRC0_RGB = 0x8580;
    public static final int GL_SRC1_RGB = 0x8581;
    public static final int GL_SRC2_RGB = 0x8582;
    public static final int GL_SRC0_ALPHA = 0x8588;
    public static final int GL_SRC1_ALPHA = 0x8589;
    public static final int GL_SRC2_ALPHA = 0x858A;
    public static final int GL_SAMPLES_PASSED = 0x8914;
    public static final int GL_QUERY_COUNTER_BITS = 0x8864;
    public static final int GL_CURRENT_QUERY = 0x8865;
    public static final int GL_QUERY_RESULT = 0x8866;
    public static final int GL_QUERY_RESULT_AVAILABLE = 0x8867;

    static {
        FieldHelper.copyStaticFields(org.lwjgl.opengl.GL15.class, GL15.class);
    }

    private GL15() {}

    public static void glBindBuffer(int target, int buffer) {
        org.lwjgl.opengl.GL15.glBindBuffer(target, buffer);
    }

    public static void glDeleteBuffers(IntBuffer buffers) {
        org.lwjgl.opengl.GL15.glDeleteBuffers(buffers);
    }

    public static void glDeleteBuffers(int buffer) {
        org.lwjgl.opengl.GL15.glDeleteBuffers(buffer);
    }

    public static void glGenBuffers(IntBuffer buffers) {
        org.lwjgl.opengl.GL15.glGenBuffers(buffers);
    }

    public static int glGenBuffers() {
        return org.lwjgl.opengl.GL15.glGenBuffers();
    }

    public static boolean glIsBuffer(int buffer) {
        return org.lwjgl.opengl.GL15.glIsBuffer(buffer);
    }

    public static void glBufferData(int target, long data_size, int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data_size, usage);
    }
    
    public static void glBufferData(int target, ByteBuffer data, int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }
    
    public static void glBufferData(int target, DoubleBuffer data, int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }
    
    public static void glBufferData(int target, FloatBuffer data, int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }
    
    public static void glBufferData(int target, IntBuffer data, int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }
    
    public static void glBufferData(int target, ShortBuffer data, int usage) {
        org.lwjgl.opengl.GL15.glBufferData(target, data, usage);
    }
    
    public static void glBufferSubData(int target, long offset, ByteBuffer data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }
    
    public static void glBufferSubData(int target, long offset, DoubleBuffer data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }
    
    public static void glBufferSubData(int target, long offset, FloatBuffer data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }
    
    public static void glBufferSubData(int target, long offset, IntBuffer data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }
    
    public static void glBufferSubData(int target, long offset, ShortBuffer data) {
        org.lwjgl.opengl.GL15.glBufferSubData(target, offset, data);
    }

    public static void glGetBufferSubData(int target, long offset, ByteBuffer data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }
    
    public static void glGetBufferSubData(int target, long offset, DoubleBuffer data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }
    
    public static void glGetBufferSubData(int target, long offset, FloatBuffer data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }
    
    public static void glGetBufferSubData(int target, long offset, IntBuffer data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }
    
    public static void glGetBufferSubData(int target, long offset, ShortBuffer data) {
        org.lwjgl.opengl.GL15.glGetBufferSubData(target, offset, data);
    }

    public static ByteBuffer glMapBuffer(int target, int access, ByteBuffer old_buffer) {
        return org.lwjgl.opengl.GL15.glMapBuffer(target, access, old_buffer);
    }

    public static ByteBuffer glMapBuffer(int target, int access, long length, ByteBuffer old_buffer) {
        return org.lwjgl.opengl.GL15.glMapBuffer(target, access, length, old_buffer);
    }

    public static boolean glUnmapBuffer(int target) {
        return org.lwjgl.opengl.GL15.glUnmapBuffer(target);
    }

    public static void glGetBufferParameter(int target, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL15.glGetBufferParameteriv(target, pname, params);
    }

    @Deprecated
    public static int glGetBufferParameter(int target, int pname) {
        return org.lwjgl.opengl.GL15.glGetBufferParameteri(target, pname);
    }

    public static int glGetBufferParameteri(int target, int pname) {
        return org.lwjgl.opengl.GL15.glGetBufferParameteri(target, pname);
    }

    public static ByteBuffer glGetBufferPointer(int target, int pname) {
        throw new NotImplementedException();
    }

    public static void glGenQueries(IntBuffer ids) {
        org.lwjgl.opengl.GL15.glGenQueries(ids);
    }

    public static int glGenQueries() {
        return org.lwjgl.opengl.GL15.glGenQueries();
    }

    public static void glDeleteQueries(IntBuffer ids) {
        org.lwjgl.opengl.GL15.glDeleteQueries(ids);
    }

    public static void glDeleteQueries(int id) {
        org.lwjgl.opengl.GL15.glDeleteQueries(id);
    }

    public static boolean glIsQuery(int id) {
        return org.lwjgl.opengl.GL15.glIsQuery(id);
    }

    public static void glBeginQuery(int target, int id) {
        org.lwjgl.opengl.GL15.glBeginQuery(target, id);
    }

    public static void glEndQuery(int target) {
        org.lwjgl.opengl.GL15.glEndQuery(target);
    }

    public static void glGetQuery(int target, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL15.glGetQueryiv(target, pname, params);
    }

    @Deprecated
    public static int glGetQuery(int target, int pname) {
        return org.lwjgl.opengl.GL15.glGetQueryi(target, pname);
    }

    public static int glGetQueryi(int target, int pname) {
        return org.lwjgl.opengl.GL15.glGetQueryi(target, pname);
    }

    public static void glGetQueryObject(int id, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL15.glGetQueryObjectiv(id, pname, params);
    }

    public static int glGetQueryObjecti(int id, int pname) {
        return org.lwjgl.opengl.GL15.glGetQueryObjecti(id, pname);
    }

    public static void glGetQueryObjectu(int id, int pname, IntBuffer params) {
        org.lwjgl.opengl.GL15.glGetQueryObjectuiv(id, pname, params);
    }

    public static int glGetQueryObjectui(int id, int pname) {
        return org.lwjgl.opengl.GL15.glGetQueryObjectui(id, pname);
    }
}
