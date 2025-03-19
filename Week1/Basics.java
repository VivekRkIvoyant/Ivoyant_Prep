package Week1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Basics {

    static HashMap<Integer,Integer> map = new HashMap<>();
    static HashSet<Integer> set = new HashSet<>();
    static ArrayList<Integer> arr;

    public static void main(String[] args) {

//        System.out.println("Hello World");
//        printNumbers(0);
//        System.out.println("The result is:"+" "+ sum(5,6));

//        insertIntoMap();
//        implementHashSet();
//        printSet();
        System.out.println(checkMatchingString("vivek","vivek"));
        System.out.println(checkMatchingString("vivek","vivel"));
    }

    public static void printNumbers(int n){
        if(n==5){
            System.out.println(n);
            return;
        }
        printNumbers(n+1);
        System.out.println(n);
    }

    public static int sum(int a ,int b){
        int res = a+b;
        return res;
    }

    public static void insertIntoMap(){
        for(int i=0;i<5;i++){
            map.put(i+1,10*(i+1));
            System.out.println(i+1+","+10*(i+1));
        }

        System.out.println("Fetching from HashMap");
    }

    public static void implementHashSet(){
        int[] nums = {10,20,100,40,50};
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        Iterator<Integer> i = set.iterator();
        System.out.println("Set Output");
        while(i.hasNext()){
            System.out.println(i.next()+" ");
        }
    }

    public static void printSet(){
        for(Integer ele: set){
            System.out.println(ele);
        }
        System.out.println("Completed printing");
    }

    public static boolean checkMatchingString(String str1,String str2){
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
