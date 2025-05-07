package Array.rotateArray;

import java.util.Arrays;

public class LeftRotateArray {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,6,8,9};
        System.out.println("Left rotate Array: " + Arrays.toString(leftRotateArray(arr, 3)));
    }

    private static int[] leftRotateArray(int[] arr, int k) {
        int n = arr.length;
        int temp = arr[n-1];
        for (int i = n-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        return arr;
    }
}
