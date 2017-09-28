package net.gudenau.lwjgl3;

import net.minecraft.launchwrapper.IClassTransformer;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.*;

import static org.objectweb.asm.Opcodes.*;

/**
 * Created by gudenau on 9/2/2017.
 * <p>
 * LWJGL3
 */
public class LWJGLSnooperInjector implements IClassTransformer{
    @Override
    public byte[] transform(String name, String transformedName, byte[] basicClass){
        if("net.minecraft.client.Minecraft".equals(name)){
            return transform(basicClass, false);
        }else if("bhz".equals(name)){
            return transform(basicClass, true);
        }
        
        return basicClass;
    }
    
    private byte[] transform(byte[] basicClass, boolean obfuscated){
        ClassReader classReader = new ClassReader(basicClass);
        ClassNode classNode = new ClassNode();
        classReader.accept(classNode, 0);
        
        String methodName = obfuscated ? "a" : "addServerStatsToSnooper";
        String snooperName = obfuscated ? "uj" : "net/minecraft/profiler/Snooper";
        String snooperMethod = obfuscated ? "a" : "addClientStat";
        
        for(MethodNode method : classNode.methods){
            if(methodName.equals(method.name)){
                InsnList patch = new InsnList();
    
                patch.add(new VarInsnNode(ALOAD, 1));
                patch.add(new LdcInsnNode("lwjgl_version"));
                patch.add(new MethodInsnNode(INVOKESTATIC, "org/lwjgl/Version", "getVersion", "()Ljava/lang/String;", false));
                patch.add(new MethodInsnNode(INVOKEVIRTUAL, snooperName, snooperMethod, "(Ljava/lang/String;Ljava/lang/Object;)V", false));
                
                method.instructions.insert(patch);
                
                break;
            }
        }
        
        ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
        classNode.accept(classWriter);
        return classWriter.toByteArray();
    }
}
