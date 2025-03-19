package Week1;

public class Vehicle extends HelloWorld{

    public static void car(){
        System.out.println("This is the vehicle class");
    }

    public static void truck(){
        System.out.println("This is truck from HelloWorld");
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.car();
        v.truck();
    }
}
