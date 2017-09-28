package net.gudenau.lwjgl3;

import lombok.SneakyThrows;
import net.minecraft.launchwrapper.Launch;
import net.minecraft.launchwrapper.LaunchClassLoader;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import sun.misc.Launcher;
import sun.misc.URLClassPath;

import javax.annotation.Nullable;
import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLConnection;
import java.util.*;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Created by gudenau on 5/30/2017.
 * <p>
 * LWJGL3
 */
@IFMLLoadingPlugin.TransformerExclusions("net.gudenau.lwjgl3.")
@SuppressWarnings("unused")
public class LWJGL3 implements IFMLLoadingPlugin{
    private static final String LWJGL3_VERSION = "3.1.2";
    private static final String LWJGL3_NAME = "lwjgl-" + LWJGL3_VERSION;
    private static final String LWJGL3_ARCHIVE = LWJGL3_NAME + ".zip";
    private static final String LWJGL3_URL = "https://gudenau.net/minecraft/libs/lwjgl/" + LWJGL3_VERSION + "/" + LWJGL3_ARCHIVE;
    
    static{
        if(LWJGL3.class.getProtectionDomain().getCodeSource().getLocation().getPath().endsWith(".jar")){
            try{
                tryToRemapLWJGL();
    
                try{
                    Class<?> clas = LWJGL3.class.getClassLoader().loadClass("org.lwjgl.Sys");
                    System.out.println(clas.getClassLoader().getClass().getName());
                    System.out.println(clas.getClassLoader() == Launcher.getLauncher().getClassLoader());
                }catch(Throwable ignored){}
                
                Class<?> Version = LWJGL3.class.getClassLoader().loadClass("org.lwjgl.Version");
                System.out.printf("%s\n", Version.getClassLoader().getClass().getName());
                Method method = Version.getDeclaredMethod("getVersion");
                method.setAccessible(true);
                System.out.println(method.invoke(null));
            }catch(Throwable t){
                throw new RuntimeException(t);
            }
        }
    }
    
    private static void tryToRemapLWJGL() throws ReflectiveOperationException, IOException{
        List<URL> newJars = getJars();
    
        ClassLoader classLoader = LWJGL3.class.getClassLoader();
        LaunchClassLoader launchClassLoader = (LaunchClassLoader)classLoader;
        while(classLoader != null){
            cleanClassloader(classLoader);
            classLoader = classLoader.getClass().getClassLoader();
        }
        
        cleanClassloader(Launcher.getLauncher().getClassLoader());
        
        //classLoader = LaunchClassLoader.class.getClassLoader();
        classLoader = Launcher.getLauncher().getClassLoader();
        Method method = URLClassLoader.class.getDeclaredMethod("addURL", URL.class);
        method.setAccessible(true);
        for(URL jar : newJars){
            method.invoke(classLoader, jar);
            launchClassLoader.addURL(jar);
        }
    }
    
    private static List<URL> getJars() throws IOException{
        File lwjglPath = new File(LWJGL3_NAME);
        if(!lwjglPath.exists()){
            downloadLWJGL();
        }
        
        File[] files = lwjglPath.listFiles((dir, name)->name.endsWith(".jar"));
        
        if(files == null){
            throw new RuntimeException("Failed to load LWJGL3!");
        }
        
        List<URL> urls = new ArrayList<>();
        Arrays.stream(files).forEach(file->{
            try{
                urls.add(file.toURI().toURL());
            }catch(MalformedURLException ignored){
            }
        });
        return urls;
    }
    
    private static void downloadLWJGL() throws IOException{
        System.out.println("Downloading LWJGL3 libs...");
        
        URLConnection connection = new URL(LWJGL3_URL).openConnection();
        connection.addRequestProperty("User-Agent", "Minecraft_LWJGL3");
        File archivePath = new File(LWJGL3_NAME);
        try(ZipInputStream archive = new ZipInputStream(connection.getInputStream())){
            ZipEntry entry;
            while((entry = archive.getNextEntry()) != null){
                extractFile(archive, entry, archivePath);
            }
        }
    }
    
    private static void extractFile(InputStream inputStream, ZipEntry entry, File archivePath) throws IOException{
        File file = new File(archivePath, entry.getName().replaceAll("/", File.separator));
        File parent = file.getParentFile();
        if(!parent.exists()){
            parent.mkdirs();
        }
        
        try(FileOutputStream outputStream = new FileOutputStream(file)){
            byte[] buffer = new byte[1024 * 4];
            int read;
            while((read = inputStream.read(buffer)) > 0){
                outputStream.write(buffer, 0, read);
            }
        }
    }
    
    private static void cleanClassloader(ClassLoader classLoader) throws ReflectiveOperationException{
        System.out.printf("Cleaning %s\n", classLoader.getClass().getName());
        
        if(classLoader instanceof LaunchClassLoader){
            @SuppressWarnings("unchecked")
            List<URL> sources = getField(LaunchClassLoader.class, (LaunchClassLoader)classLoader, List.class, "sources");
            nukeLWJGL(sources);
            
            @SuppressWarnings("unchecked")
            Map<String, Class<?>> cachedClasses = getField(LaunchClassLoader.class, (LaunchClassLoader)classLoader, Map.class, "cachedClasses");
            cachedClasses.keySet().stream().filter(pack->pack.startsWith("org.lwjgl.")).forEach(cachedClasses::remove);
        }
        
        Class<ClassLoader> LauncherClassLoaderClass = getLauncherClassLoaderClass();
        if(LauncherClassLoaderClass.isAssignableFrom(classLoader.getClass())){
            URLClassPath ucp = getField(LauncherClassLoaderClass, LauncherClassLoaderClass.cast(classLoader), URLClassPath.class, "ucp");
            cleanURLClassPath(ucp);
        }
        
        if(classLoader instanceof URLClassLoader){
            URLClassPath ucp = getField(URLClassLoader.class, (URLClassLoader)classLoader, URLClassPath.class, "ucp");
            cleanURLClassPath(ucp);
        }
        
        @SuppressWarnings("unchecked")
        Vector<Class<?>> classes = getField(ClassLoader.class, classLoader, Vector.class, "classes");
        classes.stream().filter(clas->clas.getName().startsWith("org.lwjgl.")).forEach(classes::remove);
    
        @SuppressWarnings("unchecked")
        HashMap<String, Package> packages = getField(ClassLoader.class, classLoader, HashMap.class, "packages");
        // This is synced in ClassLoader, might as well follow suit
        //noinspection SynchronizationOnLocalVariableOrMethodParameter
        synchronized(packages){
            //System.out.printf("%s:\n", classLoader.getClass().getName());
            //System.out.printf("Pre:\n");
            //packages.keySet().forEach(packag->System.out.printf("\t%s\n", packag));
            packages.keySet().stream().filter(packag->packag.startsWith("org.lwjgl.") || "org.lwjgl".equals(packag))
                .forEach(packag->{
                    packages.remove(packag);
                    System.out.printf("\t\tRemoved package $s", packag);
                });
            //System.out.printf("Post:\n");
            //packages.keySet().forEach(packag->System.out.printf("\t%s\n", packag));
        }
        
        if(classLoader.getParent() != null){
            cleanClassloader(classLoader.getParent());
        }
    }
    
    private static void cleanURLClassPath(URLClassPath ucp) throws ReflectiveOperationException{
        @SuppressWarnings("unchecked")
        ArrayList<URL> path = getField(URLClassPath.class, ucp, ArrayList.class, "path");
        nukeLWJGL(path);
    
        @SuppressWarnings("unchecked")
        Stack<URL> urls = getField(URLClassPath.class, ucp, Stack.class, "urls");
        // This is synced in URLClassPath, might as well follow suit
        //noinspection SynchronizationOnLocalVariableOrMethodParameter
        synchronized(urls){
            nukeLWJGL(urls);
        }
        
        @SuppressWarnings("unchecked")
        ArrayList<?> loaders = getField(URLClassPath.class, ucp, ArrayList.class, "loaders");
        Class<?> Loader = getSubclass(URLClassPath.class, "Loader");
        Method getBaseURL = Loader.getDeclaredMethod("getBaseURL");
        getBaseURL.setAccessible(true);
        List<Closeable> loadersToRemove = new ArrayList<>();
        for(Object loader : loaders){
            URL url = (URL)getBaseURL.invoke(loader);
            String path_ = url.getPath();
            if(path_.contains("lwjgl") && path_.contains("2.9.4")){
                loadersToRemove.add((Closeable)loader);
            }
        }
        loaders.removeAll(loadersToRemove);
        loadersToRemove.forEach(loader->{
            try{
                loader.close();
            }catch(IOException ignored){}
        });
        
        @SuppressWarnings("unchecked")
        HashMap<String, Object> lmap = getField(URLClassPath.class, ucp, HashMap.class, "lmap");
        lmap.entrySet().stream().filter(entry->loadersToRemove.contains(entry.getValue())).map(Map.Entry::getKey).collect(Collectors.toList()).forEach(lmap::remove);
    }
    
    private static Class<?> getSubclass(Class<?> type, String name){
        for(Class<?> clas : type.getDeclaredClasses()){
            if(name.equals(clas.getSimpleName())){
                return clas;
            }
        }
        return null;
    }
    
    private static Class<ClassLoader> launcherClassLoaderClass;
    private static Class<ClassLoader> getLauncherClassLoaderClass(){
        if(launcherClassLoaderClass == null){
            Class<?>[] classes = Launcher.class.getDeclaredClasses();
            for(Class<?> clas : classes){
                if("AppClassLoader".equals(clas.getSimpleName())){
                    //noinspection unchecked
                    return launcherClassLoaderClass = (Class<ClassLoader>)clas;
                }
            }
        }
        return launcherClassLoaderClass;
    }
    
    private static void nukeLWJGL(Collection<URL> sources){
        if(sources == null){
            return;
        }
        
        sources.removeAll(sources.stream().filter(url->{
            if(url != null){
                String path = url.getPath();
                path = path.substring(path.lastIndexOf('/'));
                boolean clean = path.contains("lwjgl") && path.contains("2.9.4");
                if(clean){
                    System.out.printf("\tRemoving %s\n", url.getPath());
                }else{
                    System.out.printf("\tKeeping %s\n", url.getPath());
                }
                return clean;
            }
            
            return false;
        }).collect(Collectors.toList()));
    }
    
    private static <T, C> T getField(Class<C> type, C instance, Class<T> fieldType, String fieldName) throws ReflectiveOperationException{
        Field field = type.getDeclaredField(fieldName);
        field.setAccessible(true);
        //noinspection unchecked
        return (T)field.get(instance);
    }
    
    @Override
    public String[] getASMTransformerClass(){
        return new String[]{
            "net.gudenau.lwjgl3.LWJGL3Transformer",
            "net.gudenau.lwjgl3.LWJGLSnooperInjector"
        };
    }
    
    @Override
    public String getModContainerClass(){
        return "net.gudenau.lwjgl3.LWJGL3Container";
    }
    
    @Nullable
    @Override
    public String getSetupClass(){
        return null;
    }
    
    @Override
    public void injectData(Map<String, Object> data){}
    
    @Override
    public String getAccessTransformerClass(){
        return null;
    }
}
