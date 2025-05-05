package Array.rotateArray;

import java.util.Arrays;

public class RightRotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = new int[] {2,3,4,5,6};
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Right Rotate Array By One: " + Arrays.toString(rightRotateArrayByOne(arr)));
    }

    private static int[] rightRotateArrayByOne(int[] arr) {
        int n = arr.length;
        int temp = arr[n-1];
        for (int i = n-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        return arr;
    }
}
