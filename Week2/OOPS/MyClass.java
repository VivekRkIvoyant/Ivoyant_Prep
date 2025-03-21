package Week2.OOPS;

public class MyClass extends AdvancedOOPs{

    public MyClass(String n,String usn){
        super(n,usn);
    }

    public StringBuffer sb = new StringBuffer();

    public static void main(String[] args) {
        MyClass myClass = new MyClass("rohit","45");
        printInfo(myClass.name,myClass.USN);
        System.out.println(setAge(100));
        System.out.println(getAge());
        printValue(404);
        myClass.insertIntoStringBuilder();
    }

    public static void printInfo(String name,String usn){
        System.out.println("This is from myClass : "+name+" "+usn);
    }

    public static void printValue(int a){
        System.out.println(a);
    }

    public void insertIntoStringBuilder(){
        sb.append("hEllo");
        sb.append("Hi");
        sb.append("World");
        String str = sb.toString();
        System.out.println(str);
    }
}
