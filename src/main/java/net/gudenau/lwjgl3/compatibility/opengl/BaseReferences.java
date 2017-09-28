package net.gudenau.lwjgl3.compatibility.opengl;

/**
 * Created by gudenau on 5/30/2017.
 * <p>
 * LWJGL3
 */
import java.nio.Buffer;
import java.util.Arrays;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL13.*;
import static org.lwjgl.opengl.GL20.*;

class BaseReferences {

    int elementArrayBuffer;
    int arrayBuffer;
    final Buffer[] glVertexAttribPointer_buffer;
    final Buffer[] glTexCoordPointer_buffer;
    int glClientActiveTexture;

    int vertexArrayObject;

    int pixelPackBuffer;
    int pixelUnpackBuffer;

    int indirectBuffer;

    BaseReferences(ContextCapabilities caps) {
        int max_vertex_attribs;
        if ( caps.OpenGL20 || caps.GL_ARB_vertex_shader )
            max_vertex_attribs = glGetInteger(GL_MAX_VERTEX_ATTRIBS);
        else
            max_vertex_attribs = 0;
        glVertexAttribPointer_buffer = new Buffer[max_vertex_attribs];

        int max_texture_units;
        if ( caps.OpenGL20 )
            max_texture_units = glGetInteger(GL_MAX_TEXTURE_IMAGE_UNITS);
        else if ( caps.OpenGL13 || caps.GL_ARB_multitexture )
            max_texture_units = glGetInteger(GL_MAX_TEXTURE_UNITS);
        else
            max_texture_units = 1;
        glTexCoordPointer_buffer = new Buffer[max_texture_units];
    }

    void clear() {
        this.elementArrayBuffer = 0;
        this.arrayBuffer = 0;
        this.glClientActiveTexture = 0;
        Arrays.fill(glVertexAttribPointer_buffer, null);
        Arrays.fill(glTexCoordPointer_buffer, null);

        this.vertexArrayObject = 0;

        this.pixelPackBuffer = 0;
        this.pixelUnpackBuffer = 0;

        this.indirectBuffer = 0;
    }

    void copy(BaseReferences references, int mask) {
        if ( (mask & GL_CLIENT_VERTEX_ARRAY_BIT) != 0 ) {
            this.elementArrayBuffer = references.elementArrayBuffer;
            this.arrayBuffer = references.arrayBuffer;
            this.glClientActiveTexture = references.glClientActiveTexture;
            System.arraycopy(references.glVertexAttribPointer_buffer, 0, glVertexAttribPointer_buffer, 0, glVertexAttribPointer_buffer.length);
            System.arraycopy(references.glTexCoordPointer_buffer, 0, glTexCoordPointer_buffer, 0, glTexCoordPointer_buffer.length);

            this.vertexArrayObject = references.vertexArrayObject;

            this.indirectBuffer = references.indirectBuffer;
        }

        if ( (mask & GL_CLIENT_PIXEL_STORE_BIT) != 0 ) {
            this.pixelPackBuffer = references.pixelPackBuffer;
            this.pixelUnpackBuffer = references.pixelUnpackBuffer;
        }
    }
}