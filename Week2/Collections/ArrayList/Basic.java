package Week2.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Basic {

    public static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
//        insertIntoList();
//        sortElements();
//        printListElements();
//        System.out.println(containsElement(10));
//        System.out.println(containsElement(20));
//        removeElement(10);
//        System.out.println(containsElement(10));
//        insertIntoIndex(1,1000);
//        System.out.println(list);
        replaceElements();
    }

    public static void insertIntoList(){
        list.add(100);
        list.add(200);
        list.add(300);
        for(int i=0;i<10;i++){
            list.add(i+1);
        }
    }

    public static void printListElements(){
        for (Integer e:list){
            System.out.println(e);
        }
    }

    public static void sortElements(){
        Collections.sort(list);
    }

    public static boolean containsElement(int element){
        return list.contains(element);
    }

    public static void removeElement(int element){
        list.remove(element);
    }

    public static void insertIntoIndex(int i,int element){
        list.add(i,element);
    }

    public static void replaceElements(){
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<10;i++){
            l.add(i+1);
        }
        l.set(1,100);
        System.out.println(l);
    }


}

