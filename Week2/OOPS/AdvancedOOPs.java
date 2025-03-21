package Week2.OOPS;

public class AdvancedOOPs {

    private static final String printMessage  = "Method Overloading: ";
    private static int age = 10;
    public String name;
    public String USN;

    public void getMessage(String printMessage){
        System.out.println(printMessage);
    }

    public static int getAge(){
        return age;
    }

    public static int setAge(int a){
        age = a;
        return age;
    }

    public AdvancedOOPs(String n,String usn){
        this.name = n;
        this.USN = usn;
    }

    public static void main(String[] args) {
        AdvancedOOPs adv1 = new AdvancedOOPs("vivek","GM122");
        adv1.getMessage(printMessage);
        printInfo(age);
        printInfo(age,adv1.name);
        printInfo(adv1.name,adv1.USN);
    }

    public static void printInfo(int age,String name){
        System.out.println(name+" "+age);
    }

    public static void printInfo(int age){
        System.out.println(age);
    }

    public static void printInfo(String name,String USN){
        System.out.println(name+" "+USN);
    }
}

