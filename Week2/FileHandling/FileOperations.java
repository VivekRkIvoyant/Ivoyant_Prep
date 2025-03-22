package Week2.FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileOperations {

    private static File file;

    public FileOperations(String f){
        this.file = new File("f");
    }

    public static void main(String[] args) {
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader("Java.txt"));
            String line;
            while((line=reader.readLine())!=null) {
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            try{
                if(reader!=null){
                    reader.close();
                }
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
        tryCatchFile();
        try {
            createFile();
        }catch (FileHandlingExceptionsClass e) {
            throw new RuntimeException(e);
        }
        readableFile();
        writableFile();
        existingFile();
        getFileName();
        getFileLength();
        absolutePath();


        try {
            deleteFile();
        }catch (FileHandlingExceptionsClass e){
            System.out.println(e.getMessage());
        }
    }

//    another way of writing try-catch without finally to close resources
    public static void tryCatchFile(){
        try(BufferedReader bf = new BufferedReader(new FileReader("java.txt"))){
            String line;
            while((line=bf.readLine())!=null){
                System.out.println(line);
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

   public static void createFile() throws FileHandlingExceptionsClass {
        try {
            if(file.createNewFile()){
                System.out.println("File Created: "+file.getName());
            }else {
                throw new FileHandlingExceptionsClass("File already present");
            }
        }catch (IOException e){
            throw new FileHandlingExceptionsClass("Exception Creating File");
        }
   }

   public static boolean readableFile(){
        return file.canRead();
   }

   public static boolean writableFile(){
        return file.canWrite();
   }

   public static boolean existingFile(){
        return file.exists();
   }

   public static String getFileName(){
        return file.getName();
   }

   public static String absolutePath(){
        return file.getAbsolutePath();
   }

   public static Integer getFileLength(){
        return (int) file.length();
   }

    public static void deleteFile() throws FileHandlingExceptionsClass {
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted: " + file.getName());
            } else {
                throw new FileHandlingExceptionsClass("File deletion failed.");
            }
        } else {
            throw new FileHandlingExceptionsClass("File does not exist.");
        }
    }
}
