package Week1;

import java.util.Arrays;

public class HelloWorld {

    public static void car(){
        System.out.println("This is main class");
    }

    public static void truck(){
        System.out.println("This is main class Truck");
    }
    public static void main(String[] args) {
        printHello(0);
        int[] nums = {1,2,3,4,5};
        int[] arr = performArrayOperations(nums);
        System.out.println(Arrays.toString(arr));
        int[] res = recursiveOperations(nums,0);
        System.out.println(Arrays.toString(res));

        System.out.println(reverseString("vivek","",0));
    }

    public static void printHello(int i){
        if(i==5){
            System.out.println("Hello By: " +i);
            return;
        }
        printHello(i+1);
        System.out.println("Hello By: "+i);
    }

    public static int[] performArrayOperations(int[] nums){
        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i]*10;
        }
        return nums;
    }

    public static int[] recursiveOperations(int[] nums,int i){
        if(i==nums.length){
            return nums;
        }
        if(i<nums.length){
            nums[i] = nums[i]*100;
        }
        return recursiveOperations(nums,i+1);
    }

    public static String reverseString(String s,String res,int i){
        if(i==s.length()){
            return res;
        }
        char c = s.charAt(i);
        return reverseString(s,res+c,i+1);
    }
}
