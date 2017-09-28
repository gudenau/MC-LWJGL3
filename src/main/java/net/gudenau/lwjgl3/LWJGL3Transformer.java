package net.gudenau.lwjgl3;

import net.minecraft.launchwrapper.IClassTransformer;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import org.objectweb.asm.util.CheckClassAdapter;

import java.io.File;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by gudenau on 5/30/2017.
 * <p>
 * LWJGL3
 */
public class LWJGL3Transformer implements IClassTransformer{
    private static final String LWJGL3_ANNOTATION = "Lnet/gudenau/lwjgl3/api/UsesLWJGL3;";

    private static final boolean DUMP_CLASSES = false;

    private static long addedTime = 0;

    static{
        Runtime.getRuntime().addShutdownHook(new Thread(()->System.out.printf("LWJGL3 transformations added %fs to load time.", addedTime / 10000000000D)));
    }

    @Override
    public byte[] transform(String name, String transformedName, byte[] basicClass){
        long time = System.nanoTime();

        ClassReader classReader = new ClassReader(basicClass);
        ClassNode classNode = new ClassNode();
        classReader.accept(classNode, 0);

        if(shouldTransform(classNode)){
            remapClasses(classNode);
        }
        
        ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
        classNode.accept(classWriter);

        byte[] code = classWriter.toByteArray();
        
        //CheckClassAdapter.verify(new ClassReader(code), false, new PrintWriter(System.err));
        
        if(DUMP_CLASSES){
            String replacedName = transformedName.replaceAll("\\.", "\\" + File.separator);
            java.io.File file = new java.io.File("dump" + File.separatorChar + replacedName + ".class");
            //noinspection ResultOfMethodCallIgnored
            file.getParentFile().mkdirs();
            try(java.io.OutputStream outputStream = new java.io.FileOutputStream(file)){
                outputStream.write(code);
                outputStream.flush();
            }catch(java.io.IOException ignored){}
        }

        addedTime += System.nanoTime() - time;
        return code;
    }

    private void remapClasses(ClassNode classNode){
        if(classNode.superName.startsWith("org/lwjgl/")){
            classNode.superName = "net/gudenau/lwjgl3/compatibility/" + classNode.superName.substring(10);
        }

        for(FieldNode field : classNode.fields){
            if(field.desc.contains("org/lwjgl")){
                field.desc = field.desc.replaceAll("org/lwjgl/", "net/gudenau/lwjgl3/compatibility/");
            }
        }

        for(MethodNode methodNode : classNode.methods){
            InsnList instructions = methodNode.instructions;

            if(methodNode.desc.contains("org/lwjgl/")){
                methodNode.desc = methodNode.desc.replaceAll("org/lwjgl/", "net/gudenau/lwjgl3/compatibility/");
            }

            for(int i = 0; i < instructions.size(); i++){
                AbstractInsnNode insnNode = instructions.get(i);

                if(insnNode instanceof FrameNode){
                    FrameNode frameNode = (FrameNode)insnNode;
                    replaceTypesWithArrays(frameNode.stack);
                    replaceTypesWithArrays(frameNode.local);
                }else if(insnNode instanceof MethodInsnNode){
                    MethodInsnNode methodInsnNode = (MethodInsnNode)insnNode;
                    if(methodInsnNode.owner.startsWith("org/lwjgl/")){
                        methodInsnNode.owner = "net/gudenau/lwjgl3/compatibility/" + methodInsnNode.owner.substring(10);
                    }
                    if(methodInsnNode.desc.contains("org/lwjgl/")){
                        methodInsnNode.desc = methodInsnNode.desc.replaceAll("org/lwjgl/", "net/gudenau/lwjgl3/compatibility/");
                    }
                }else if(insnNode instanceof TypeInsnNode){
                    TypeInsnNode typeNode = (TypeInsnNode)insnNode;
                    if(typeNode.desc.startsWith("org/lwjgl/")){
                        typeNode.desc = "net/gudenau/lwjgl3/compatibility/" + typeNode.desc.substring(10);
                    }
                }else if(insnNode instanceof FieldInsnNode){
                    FieldInsnNode fieldNode = (FieldInsnNode)insnNode;
                    if(fieldNode.owner.startsWith("org/lwjgl/")){
                        fieldNode.owner = "net/gudenau/lwjgl3/compatibility/" + fieldNode.owner.substring(10);
                    }
                    if(fieldNode.desc.contains("org/lwjgl/")){
                        fieldNode.desc = fieldNode.desc.replaceAll("org/lwjgl/", "net/gudenau/lwjgl3/compatibility/");
                    }
                }
            }

            if(methodNode.localVariables != null){
                for(LocalVariableNode localVariable : methodNode.localVariables){
                    if(localVariable.desc.startsWith("Lorg/lwjgl/")){
                        localVariable.desc = "Lnet/gudenau/lwjgl3/compatibility/" + localVariable.desc.substring(11);
                    }
                }
            }

            if(methodNode.exceptions != null){
                List<String> exceptions = methodNode.exceptions;

                for(int i = 0; i < exceptions.size(); i++){
                    String exception = exceptions.get(i);
                    if(exception.startsWith("org/lwjgl/")){
                        exceptions.set(i, "net/gudenau/lwjgl3/compatibility/" + exception.substring(10));
                    }
                }
            }

            if(methodNode.tryCatchBlocks != null){
                List<TryCatchBlockNode> tryCatchBlocks = methodNode.tryCatchBlocks;
                for(TryCatchBlockNode catchBlockNode : tryCatchBlocks){
                    if(catchBlockNode.type != null && catchBlockNode.type.startsWith("org/lwjgl/")){
                        catchBlockNode.type = "net/gudenau/lwjgl3/compatibility/" + catchBlockNode.type.substring(10);
                    }
                }
            }
        }
    }

    private void replaceTypesWithArrays(List<Object> list){
        if(list == null){
            return;
        }
        for(int o = 0; o < list.size(); o++){
            Object stackObject = list.get(o);
            if(stackObject instanceof String){
                String stackString = (String)stackObject;
                if(stackString.contains("org/lwjgl/")){
                    list.set(o, stackString.replaceAll("org/lwjgl/", "net/gudenau/lwjgl3/compatibility/"));
                }
            }
        }
    }

    private boolean shouldTransform(ClassNode classNode){
        if(classNode.visibleAnnotations != null){
            for(AnnotationNode annotationNode : classNode.visibleAnnotations){
                if(LWJGL3_ANNOTATION.equals(annotationNode.desc)){
                    return false;
                }
            }
        }

        return true;
    }
}
