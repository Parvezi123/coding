package Array;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 8, 8, 8, 8, 6, 8};
        Arrays.sort(arr);
        int n = arr.length;
        int largest = arr[n - 1];
        int secondLargest = 0;

        for (int i = n-2; i >= 0; i--) {
            if (largest != arr[i]) {
                secondLargest = arr[i];
                break;
            }
        }
        System.out.println("Second Largest of an Array: " + secondLargest);
    }
}