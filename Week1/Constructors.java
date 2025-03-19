package Week1;

import java.util.Hashtable;

public class Constructors {
    static int age;
    static String name;
    public Constructors(String n,int a){
        this.age = a;
        this.name = n;
    }

    public static void main(String[] args) {
        Constructors c = new Constructors("vivek",22);
        System.out.println(c.age);
        System.out.println(c.name);
        Hashtable<Integer,Constructors> table = new Hashtable<>();
        table.put(1,new Constructors("Virat",18));
        table.put(2,new Constructors("Rohit",45));
        for(int i=0;i<table.size();i++){
            Constructors data = table.get(i);
            System.out.println(data.name+" "+data.age);
        }
    }
}
