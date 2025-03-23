package Week2.Collections.LinkedList;

import java.util.LinkedList;

public class Basic {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        for(int i=1;i<=5;i++){
            linkedList.add(i);
        }

        System.out.println(linkedList);

        linkedList.remove(1);
        System.out.println(linkedList);

    }
}
