package Array.removeDuplicateArray;

import java.util.Arrays;

public class RemoveDuplicateArray_Optimized {
    public static void main(String[] args) {
        int[] arr = new int[] {2,2,2,2,2,3,3,4,5,6,7};
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("No. of unique Elements : " + removeDuplicateElements(arr) + " Modifies Array: " + Arrays.toString(arr));
    }

    private static int removeDuplicateElements(int[] arr) {
        int j = 1; //At least one unique element exists as default
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[j-1]) {
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }
}
