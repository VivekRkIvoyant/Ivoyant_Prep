package Week1;

public class Basics {

    public static void main(String[] args) {

        System.out.println("Hello World");
        printNumbers(0);
    }

    public static void printNumbers(int n){
        if(n==5){
            System.out.println(n);
            return;
        }
        printNumbers(n+1);
        System.out.println(n);
    }
}
