package Week1;

public class Operators {
    public static void main(String[] args) {
        String name = "Vivek";
        int age = 19;

        if(name.length()>0 && age>18){
            System.out.println("Allowed as User");
        }
        else{
            System.out.println("Invalid");
        }

//        some examples of valid and invalid identifiers
//        String 123geek = "Geks for geks";
//        String my var = "GG";
//        int a+b = 3;
//        String sum&_Diff = "uses";

//        some examples of valid identifiers
        String var123 = "var123";
        String var$he = "var$he";
        String _name = "_name";

        int a = 4;
        int b = 2;
        System.out.println("The sum of two numbers: "+(a+b));
        System.out.println("The product of two numbers: "+a*b);
        System.out.println("The division of two numbers: "+a/b);
        System.out.println("The reminder of two numbers: "+b%a);
        System.out.println("The sub ans for two numbers: "+(a-b));
        System.out.println("The increment of one number: "+(a++));
        System.out.println("The decrement of one number: "+(--b));

    }
}
