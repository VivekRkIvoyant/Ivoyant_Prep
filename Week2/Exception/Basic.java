package Week2.Exception;

public class Basic {

    public static void main(String[] args) {
        indexOutOfBoundException();
        divideByZeroException();
        int[] num = {10, 200, 30, 40};
        int[] den = {1, 2, 0, 4};
        checkForException(num, den);
        nullPointerException();
    }

    public static void indexOutOfBoundException() {
        int[] arr = new int[3];
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(arr[i] = i);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        } finally {
            System.out.println("Programme Continues...");
        }
    }

    public static void divideByZeroException() {
        try {
            int n = 10;
            int m = 0;
            System.out.println(n / m);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Execution Continues...");
        }
    }

    public static void checkForException(int[] numerator, int[] denominator) {
        for (int i = 0; i < denominator.length + 1; i++) {
            try{
                System.out.println(numerator[i]/denominator[i]);
            }catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }catch (IndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }finally {
                System.out.println("This is still running");
            }
        }
        System.out.println("Loops Completed");
    }

    public static void nullPointerException(){
        Basic b = null;
        try{
            System.out.println(b.toString());
        } catch (Exception e){
            System.out.println("This is Exception block: "+e.getMessage());
        } catch (Throwable e){
            System.out.println("This is Throwable block: "+e.getMessage());
        }finally {
            System.out.println("Finally Block Code");
        }
    }
}

//Types of exception
/*
* 1.Runtime Exception - DivideByZero , IndexOutOfBound , NullPointer , IllegalArguments
* 2.IO Exception - FileNotFound , EO (Exception)
* 3.SQL Exception - Socket , UnknownHost
* */
