package Week2.OOPS;

public class Introduction {
    private int a;
    private int b;

    private void addTwoNumbers(){
        System.out.println(a+b);
    }

    private void productOfTwoNumbers(){
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        String str = new String("Java Strings");

        System.out.println(str);

        Introduction intro = new Introduction();
        intro.a = 2;
        intro.b = 3;

        intro.addTwoNumbers();
        intro.productOfTwoNumbers();
    }
}
