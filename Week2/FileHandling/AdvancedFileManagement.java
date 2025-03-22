package Week2.FileHandling;

import java.io.*;
import java.util.Scanner;

public class AdvancedFileManagement {
    private static File file = new File("home.txt");

    public static void main(String[] args) {
        createFile();
        readFromFile();
        System.out.println(new File(file.getAbsolutePath()));
        writeIntoFile();
        readFromFile();
        deleteFile();
    }

    public static void createFile(){
        try{
            if(file.createNewFile()){
                System.out.println("File Created: "+file.getName());
            }else {
                System.out.println("File already exists");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void readFromFile(){
        try{
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void writeIntoFile(){
        try{
            FileWriter fW = new FileWriter("/Users/vivekrk/Desktop/Ivoyant_Practice/home.txt");
            fW.write("This is written from function call");
            fW.close();
            System.out.println("Successfully Written");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void deleteFile() {
        try {
            if (!file.exists()) {
                throw new FileNotFoundException("File not found");
            }
            if (file.delete()) {
                System.out.println("File Deleted");
            } else {
                System.out.println("Failed in deleting file");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
