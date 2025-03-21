package Week2.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Person {
    public String name;
    public int age;

    public static ArrayList<Person> per = new ArrayList<>();

    public Person(String n,int a){
        this.name = n;
        this.age = a;
    }

    public static void main(String[] args) {
        Person p1 = new Person("vivek",12);
        Person p2 = new Person("virat",13);

        Person[] personArray = new Person[2];
        personArray[0] = p1;
        personArray[1] = p2;

        for(int i=0;i<personArray.length;i++){
            System.out.println(personArray[i].name+" "+personArray[i].age);
        }
        addIntoArrayList(personArray,per);
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println(findElementInArrayList(2,arr));
    }

    public static ArrayList<Person> addIntoArrayList(Person[] personArray,ArrayList<Person> per){
        for(int i=0;i<personArray.length;i++){
            per.add(personArray[i]);
        }
        return per;
    }

    public static int findElementInArrayList(int target,ArrayList<Integer> arr){
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==target){
                return i;
            }
        }
        return -1;
    }
}
