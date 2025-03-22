package Week2.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileImplementations {

    static File file = new File("test.txt");

    public static void main(String[] args) {
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.canRead());
        System.out.println(file.exists());
        System.out.println(file.length());
        System.out.println(file.canWrite());

        try{
            createFile();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        writeIntoFile();
    }

    public static void createFile() throws FileHandlingExceptionsClass {
        try {
            if(file.createNewFile()){
                System.out.println("File created");
            }else {
                System.out.println("File not created");
            }
        }catch (IOException e){
            throw new FileHandlingExceptionsClass("This file was not created");
        }
    }

    public static void writeIntoFile(){
        try{
            if(file.exists()){
                FileWriter fw = new FileWriter("/Users/vivekrk/Desktop/Ivoyant_Practice/test.txt");
                fw.write("Hello there this is txt file msg inserted from write file method");
                fw.close();
                System.out.println("Message Inserted");
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally Block Code");
        }
    }
}
