package Week2.Collections;

import java.util.HashMap;

public class MapHash {

    public static HashMap<Integer,Integer> map = new HashMap<>();

    public static void main(String[] args) {

    }

    public static void insertIntoHashMap(){
        for(int i=0;i<10;i++){
            map.put(i,i*10);
        }
    }

    public static void getTargetFromMap(int target,int i){
        if(i==map.size()){
            return;
        }

    }
}
