package Week2.Arrays;

import java.util.Arrays;

public class BasicArrayConcepts {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for(int i=0;i<nums.length;i++){
            nums[i] = i;
        }
        System.out.println(Arrays.toString(nums));
        accessArray(nums);
    }

    public static void accessArray(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }

    
}
