package Week2.Arrays;

import java.util.Arrays;

public class ArraysExecution {
    static String indexString = "The element at index: ";
    public static void main(String[] args) {
        int[] nums= new int[5];
        int[] res = populateArray(0,nums);
        System.out.println(Arrays.toString(res));
        System.out.println(findTarget(res,3,0));
        accessElements(res);
        int[][] arr = form2DArray(2,3);
        print2DArray(arr);
        finalArrays(5);
        modifyFinalArray();
    }

    public static int[] populateArray(int n,int[] nums){
        if(n==5){
            return nums;
        }
        nums[n] = n+1;
        return populateArray(n+1,nums);
    }

    public static boolean findTarget(int[] nums,int target,int i){
        if(nums.length==i){
            return false;
        }
        if (nums[i] == target) {
            return true;
        }
        return findTarget(nums,target,i+1);
    }

    public static void accessElements(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            System.out.println(indexString+i+" is"+": "+nums[i]);
        }
    }

    public static int[][] form2DArray(int n,int m){
        int[][] nums = new int[n][m];
        int element = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                nums[i][j] = element;
                element++;
            }
        }
        return nums;
    }

    public static void print2DArray(int[][] arr){
        System.out.print("{");
        for(int i=0;i< arr.length;i++){
            System.out.print("{");
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+",");
            }
            System.out.print("}");
            System.out.print(",");
        }
        System.out.print("}");
    }

    public static int[] finalArrays(int n){
        System.out.println();
        final int[] arr = {1,2,3,4,5};
        arr[2] = 5;
        for(int i=0;i<n;i++){
            arr[i] = i+1;
            System.out.print(arr[i]+" ");
        }
        return arr;
    }

    public static void modifyFinalArray(){
        System.out.println();
        int[] arrayCopy = finalArrays(5);
        arrayCopy[1] = 10;
        System.out.print(arrayCopy[1]);
    }
}
