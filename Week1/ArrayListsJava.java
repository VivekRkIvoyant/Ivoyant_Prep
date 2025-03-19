package Week1;

import java.util.ArrayList;

public class ArrayListsJava {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i=0;
        do{
            arr.add(i);
            System.out.println(arr.get(i));
            i++;
        }while(i<0);
    }
}
