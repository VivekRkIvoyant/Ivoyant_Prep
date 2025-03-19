package Week1;

import java.util.HashMap;
import java.util.HashSet;

public class Construct extends Constructors{
    static int sal;
    static String company;
    public Construct(String n,int a,String c,int s){
        super(n,a);
        this.sal = s;
        this.company = c;
    }

    public static void main(String[] args) {
        HashMap<Integer,Construct> map = new HashMap<>();
        HashSet<Construct> set = new HashSet<>();
        map.put(1,new Construct("vivek",22,"Ivoyant",10000));
        map.put(2,new Construct("Virat",15,"School",1000));
        set.add(new Construct("vivek",12,"Ivy",1200000));
        set.add(new Construct("vivek",12,"Ivy",1200000));
        System.out.println("Name"+" "+"Age"+" "+"Company"+" "+"Salary");
        System.out.println();
        for(Construct c:set){
            System.out.println(c.name +" "+ c.age +" "+ c.company +" "+ c.sal);
            System.out.println();
        }
        System.out.println(map.size());

    }
}
