package Array.secondLargest;

import java.util.Arrays;

public class SecondLargest_BruteForce {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 8, 8, 8, 8, 6, 8};
        System.out.println("Second Largest of an Array: " + secondLargestArray(arr, arr.length));
    }

    private static int secondLargestArray(int[] arr, int n) {
        Arrays.sort(arr);
        int largest = arr[n-1];
        int secondLargest = arr[0];

        for (int i = 1; i < n - 1; i++) {
            if(arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}