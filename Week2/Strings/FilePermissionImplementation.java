package Week2.Strings;

import java.io.FilePermission;

public class FilePermissionImplementation {

    static FilePermission fp1 = new FilePermission("home.txt","read, write , delete");
    static FilePermission fp2 = new FilePermission("test.txt","write");
    static FilePermission fp3 = new FilePermission("home.txt","read");

    public static void main(String[] args) {

        getHashCodes();
        getFileActions();
        compareFiles();
    }

    public static void getHashCodes(){
        int i = fp1.hashCode();
        System.out.println(i);
        int j= fp2.hashCode();
        System.out.println(j);
        int k = fp3.hashCode();
        System.out.println(k);
    }

    public static void compareFiles(){
        System.out.println(fp1.equals(fp2));
        System.out.println(fp2.equals(fp3));
        System.out.println(fp3.equals(fp1));
    }

    public static void getFileActions(){
        System.out.println(fp1.getActions());
        System.out.println(fp2.getActions());
        System.out.println(fp3.getActions());
    }
}
