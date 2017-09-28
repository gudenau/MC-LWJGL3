package net.gudenau.lwjgl3;

/**
 * Created by gudenau on 6/16/2017.
 * <p>
 * LWJGL3
 */
public class NotImplementedException extends RuntimeException{
    public NotImplementedException(){
        super(createMessage(Thread.currentThread().getStackTrace()));
    }

    private static String createMessage(StackTraceElement[] stackTrace){
        StackTraceElement element = stackTrace[1];

        return element.getClassName() + "." + element.getMethodName() + ":" + element.getLineNumber() + " is not implemented yet! PLEASE REPORT WHAT MOD CAUSED THIS TO GUDENAU!";
    }
}
