package Array.rotateArray;

import java.util.Arrays;

public class LeftRotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = new int[] {2,4,6,8,10};
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Left Rotated Array by One: " + Arrays.toString(rotateArray(arr)));
    }

    static int[] rotateArray(int[] arr) {
        // Write your code here.
        int n = arr.length;
        int temp = arr[0];
        for(int i=0;i<n-1;i++) {
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
        return arr;
    }
}
