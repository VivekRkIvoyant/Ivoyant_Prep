package Week2.Collections.Vector;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Vector;

public class VectorCollections {

    static ArrayList<Integer> arr = new ArrayList<>();
    static ArrayList<Integer> arr2 = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4};
        Vector<Integer> v = new Vector<>();
        Hashtable<Integer,String> table = new Hashtable<>();

        v.addElement(1);
        v.addElement(2);
         table.put(1,"Ivoyant");
         table.put(2,"Systems");

         System.out.println(arr[0]);
         System.out.println(v.elementAt(1));
         System.out.println(table.get(1));
         addIntoCollections();
         printElements();
//         clearElemets();
         System.out.println();
         System.out.println("This is output of cleared elements");
         printElements();
         addAllElements();
         System.out.println("Second arr elements");
         printElements2();
         clearElements();
         System.out.println("First arr elements");
         printElements();
         convertIntoHashCode();
         clearElements();
         System.out.println(checkEmpty());
         printElements2();
         printSizeOfCollections();
    }

    public static void addIntoCollections(){
        for(int i=0;i<10;i++){
            arr.add((i+1)*10);
        }
    }

    public static void printElements(){
        for(Integer ele:arr){
            System.out.print(ele+" ");
        }
    }

    public static void clearElements(){
        arr.clear();
    }

    public static void addAllElements(){
        arr2.addAll(arr);
    }

    public static void printElements2(){
        for(Integer ele:arr2){
            System.out.print(ele+" ");
        }
    }

    public static void convertIntoHashCode(){
        int code = arr2.hashCode();
        System.out.println("Hash Code for this collections: "+code);
    }

    public static boolean checkEmpty(){
        return arr.isEmpty();
    }

    public static void removeElements(){
        arr2.remove(10);
    }

    public static void printSizeOfCollections(){
        System.out.println(arr2.size());
    }
}
