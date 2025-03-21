package Week2.Exception;

import java.io.IOException;
import java.rmi.server.ExportException;
import java.util.logging.FileHandler;

public class AdvancedException {

    public static void main(String[] args) {
        try{
            callOne();
        }catch (Exception m){
            StackTraceElement[] stack = m.getStackTrace();
            for (StackTraceElement stackTraceElement : stack) {
                System.out.println(stackTraceElement);
            }
        }finally {
            System.out.println("Execution Finished");
        }
        fileReaderException();
        funCall();
    }

    public static void callThree(){
        int[] arr = new int[10];
        arr[11] = 5;
        System.out.println(arr[11]);
    }

    public static void callTwo(){
        callThree();
    }

    public static void callOne(){
        callTwo();
    }

    public static void fileReaderException(){
        try{
            FileHandler fH = new FileHandler("home.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This is Finally Block");
        }
    }

    public static void throwsExceptionHandling() throws IOException{
        FileHandler fh = new FileHandler();
    }

    public static void nextFunctionCall() throws Exception{
        throwsExceptionHandling();
    }

    public static void functionCall() throws Throwable{
        nextFunctionCall();
    }

    public static void funCall(){
        try{
            functionCall();
        }catch (Throwable e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally Block FunCall");
        }
    }
}
