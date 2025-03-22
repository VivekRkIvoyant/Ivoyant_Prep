package Week2.Collections.HashMap;

import java.util.HashMap;

public class MapHash {

    public static HashMap<Integer,Integer> map = new HashMap<>();

    public static void main(String[] args) {
        insertIntoHashMap();
        try {
            getTargetFromMap(30,0);
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally Block Code");
        }
        printHashMap();
    }

    public static void insertIntoHashMap(){
        for(int i=0;i<10;i++){
            map.put(i,i*10);
        }
    }

    public static void getTargetFromMap(int target,int i){
        if(i==map.size()){
            if(map.get(i)==target){
                System.out.println("Element found");
                return;
            }else {
                System.out.println("Element Not found");
                return;
            }
        }
        if(map.get(i)==target){
            System.out.println("Element found");
        }
        getTargetFromMap(target,i+1);
    }

    public static void printHashMap(){
        for(int i=0;i<map.size();i++){
            System.out.println("Value: "+map.get(i));
        }
    }
}

