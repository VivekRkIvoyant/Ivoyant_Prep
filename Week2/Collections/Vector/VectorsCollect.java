package Week2.Collections.Vector;

import java.util.Vector;

public class VectorsCollect {

    public static void main(String[] args) {
        Vector<Integer> v= new Vector<>();

        for(int i=0;i<10;i++){
            v.addElement(i+1);
        }

        System.out.println(v);
        System.out.println("Removing Element Object");
        v.removeElement(10);
        System.out.println(v);

        System.out.println("Removing Element from Index");
        v.remove(1);
        System.out.println(v);
    }
}
