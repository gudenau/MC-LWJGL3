package net.gudenau.lwjgl3.compatibility.opengl;

import org.lwjgl.glfw.GLFWImage;
import org.lwjgl.system.MemoryUtil;

import java.awt.image.BufferedImage;
import java.nio.ByteBuffer;

import static net.gudenau.lwjgl3.glfw.GLFWHelper.*;

/**
 * Created by gudenau on 6/16/2017.
 * <p>
 * LWJGL3
 */
class ContextWindow extends ContextGL{
    ContextWindow(long newWindow){
        super(newWindow);
    }

    void setVisible(boolean visible){
        if(visible){
            glfwShowWindow(getWindow());
        }else{
            glfwHideWindow(getWindow());
        }
    }

    void setIcon(BufferedImage[] icons){
        GLFWImage.Buffer imageBuffers = GLFWImage.calloc(icons.length);
        ByteBuffer[] buffers = new ByteBuffer[icons.length];

        for(int i = 0; i < icons.length; i++){
            BufferedImage icon = icons[i];
            int[] pixels = new int[icon.getWidth() * icon.getHeight()];
            ByteBuffer buffer = buffers[i] = MemoryUtil.memCalloc(pixels.length * Integer.BYTES);
            icon.getRGB(0, 0, icon.getWidth(), icon.getHeight(), pixels, 0, icon.getWidth());

            for(int pixel : pixels){
                //buffer.putInt(pixel << 8 | pixel >> 24 & 0xFF);
                buffer.put((byte)((pixel >>> 16) & 0xFF));
                buffer.put((byte)((pixel >>>  8) & 0xFF));
                buffer.put((byte)(pixel & 0xFF));
                buffer.put((byte)((pixel >>> 24) & 0xFF));
            }

            buffer.position(0);
            imageBuffers.get(i).set(icon.getWidth(), icon.getHeight(), buffer);
        }

        glfwSetWindowIcon(getWindow(), imageBuffers);

        for(ByteBuffer buffer : buffers){
            MemoryUtil.memFree(buffer);
        }
        imageBuffers.free();
    }
}
