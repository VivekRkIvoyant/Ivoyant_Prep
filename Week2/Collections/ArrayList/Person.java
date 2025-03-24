package Week2.Collections.ArrayList;

import java.util.ArrayList;

public class Person {

    public int rollNumber;
    public String userName;

    public Person(int roll,String name){
        this.rollNumber = roll;
        this.userName = name;
    }

    public static void main(String[] args) {

        ArrayList<Person> arr= new ArrayList<>();
        Person p1 = new Person(122,"vivek");
        Person p2 = new Person(47,"likhith");
        Person p3 = new Person(16,"gobi");

        arr.add(p1);
        arr.add(p2);
        arr.add(p3);
        removeElement(arr,"gobi");
        addElementAtIndex(arr,0);
        for(Person p:arr){
            System.out.println(p.rollNumber+" "+p.userName);
        }

        System.out.println(arr.size());
    }

    public static void removeElement(ArrayList<Person>arr,String name){
        arr.removeIf(p -> p.userName.equals(name));
    }

    public static void addElementAtIndex(ArrayList<Person> arr,int i){
        arr.add(i,new Person(121,"Darshan"));
    }
}
