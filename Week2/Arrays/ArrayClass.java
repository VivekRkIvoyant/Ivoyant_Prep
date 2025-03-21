package Week2.Arrays;

import java.util.Arrays;

public class ArrayClass {
    static int[] arr1 = {5,4,3,2,1};
    static int[] arr2 = {4,5,6,7,8};

    public static void main(String[] args) {
        System.out.println(Arrays.compare(arr1,arr2));

        System.out.println("Method to sort Arrays");
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
