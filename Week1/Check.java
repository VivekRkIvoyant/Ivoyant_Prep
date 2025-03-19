package Week1;

class Check {
    public static void main(String[] args) {
        System.out.println("Hello Java Code");
        System.out.println("Java is case sensitive");

//        class names cannot start with numbers or special characters
        System.out.println("There are 4 types of access modifiers in java: ");
        System.out.println("1. Default\n" +
                "2. Private\n" +
                "3.Protected\n" +
                "4.Public");
        Check c = new Check();
        c.helper();
        System.out.println("The output sum is : "+" "+sumUp(5,2));
        System.out.println(returnString("vivek",'r'));
        System.out.println("\n");
        System.out.println("This is the result of factorial of the number"+factorial(5));
        System.out.println(recCallPrint(10));
    }

    public void helper(){
        System.out.println("This is helper function");
    }

    public static int sumUp(int a,Integer b){
        int sum = a+b;
        return sum;
    }

    public static String returnString(String s,char c){
        String res = s+c;
        return res;
    }

    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static int recCallPrint(int n){
        if(n==1){
            return 1;
        }
        System.out.println(n);
        return recCallPrint(n-1);
    }
}
