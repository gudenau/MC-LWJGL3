package net.gudenau.lwjgl3.compatibility.openal;

import java.nio.IntBuffer;

import org.lwjgl.openal.ALC10;
import org.lwjgl.system.MemoryStack;

/**
 * Created by gudenau on 6/1/2017.
 * <p>
 * LWJGL3
 */
public class ALCcontext{
    /** Address of actual context */
    final long context;

    /** Whether this context is valid */
    private boolean valid;

    /**
     * Creates a new instance of ALCcontext
     *
     * @param context address of actual context
     */
    ALCcontext(long context) {
        this.context = context;
        this.valid = true;
    }

    /*
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object context) {
        if(context instanceof ALCcontext) {
            return ((ALCcontext)context).context == this.context;
        }
        return super.equals(context);
    }

    /**
     * Creates an attribute list in a ByteBuffer
     * @param contextFrequency Frequency to add
     * @param contextRefresh Refresh rate to add
     * @param contextSynchronized Whether to synchronize the context
     * @param stack
     * @return attribute list
     */
    static IntBuffer createAttributeList(int contextFrequency, int contextRefresh, int contextSynchronized, MemoryStack stack) {
        IntBuffer attribList = stack.callocInt(7);

        attribList.put(0, ALC10.ALC_FREQUENCY);
        attribList.put(1, contextFrequency);
        attribList.put(2, ALC10.ALC_REFRESH);
        attribList.put(3, contextRefresh);
        attribList.put(4, ALC10.ALC_SYNC);
        attribList.put(5, contextSynchronized);
        attribList.put(6, 0); //terminating int

        return attribList;
    }

    /**
     * Marks this context as invalid
     *
     */
    void setInvalid() {
        valid = false;
    }

    /**
     * @return true if this context is still valid
     */
    public boolean isValid() {
        return valid;
    }

    long getContextPointer(){
        return context;
    }
}
