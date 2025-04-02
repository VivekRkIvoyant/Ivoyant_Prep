package Week3.SerilizationAndDeserilization;

import java.io.*;

public class Serilization{

    public static void main(String[] args) throws IOException {
        Employee emp = new Employee();
        emp.name = "Rahul";
        emp.city = "DVG";
        FileOutputStream fileInputStream = new FileOutputStream("Week3/SerilizationAndDeserilization/main.txt");
        ObjectOutputStream out = new ObjectOutputStream(fileInputStream);

        out.writeObject(emp);
        out.close();
        fileInputStream.close();
        System.out.println("Data is saved");
    }
}

