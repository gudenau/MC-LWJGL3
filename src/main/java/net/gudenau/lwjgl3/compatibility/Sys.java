package net.gudenau.lwjgl3.compatibility;

import org.lwjgl.Version;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by gudenau on 5/30/2017.
 * <p>
 * LWJGL3
 */
public class Sys{
    private static final String VERSION = "2.9.4 HACKED TO " + Version.getVersion();

    private static final boolean is64Bit;

    private static void doLoadLibrary(final String lib_name) {}

    private static void loadLibrary(final String lib_name) {}

    private static final long timerOffset;

    static {
        timerOffset = System.nanoTime();
        is64Bit = "64".equals(System.getProperty("sun.arch.data.model"));
    }

    private Sys() {}

    public static String getVersion() {
        return VERSION;
    }

    public static void initialize() {}

    public static boolean is64Bit() {
        return is64Bit;
    }

    public static long getTimerResolution() {
        return 1000000000;
    }

    public static long getTime() {
        return (System.nanoTime() - timerOffset) & 0x7FFFFFFFFFFFFFFFL;
    }

    public static void alert(String title, String message) {
        //TODO Mouse grabbing
        /*boolean grabbed = Mouse.isGrabbed();
        if (grabbed) {
            Mouse.setGrabbed(false);
        }*/
        try{
            SwingUtilities.invokeAndWait(()->JOptionPane.showMessageDialog(
                null,
                message == null ? "" : message,
                title == null ? "" : title,
                JOptionPane.ERROR_MESSAGE
            ));
        }catch(InterruptedException | InvocationTargetException ignored){}
        /*if (grabbed) {
            Mouse.setGrabbed(true);
        }*/
    }

    public static boolean openURL(String url) {
        try{
            Desktop.getDesktop().browse(new URI(url));
            return true;
        }catch(IOException | URISyntaxException e){
            return false;
        }
    }

    public static String getClipboard() {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        try{
            return (String)clipboard.getData(DataFlavor.stringFlavor);
        }catch(UnsupportedFlavorException | IOException e){
            throw new RuntimeException("Could not read clipboard!", e);
        }
    }
}
