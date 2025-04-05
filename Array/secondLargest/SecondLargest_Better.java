package Array.secondLargest;

public class SecondLargest_Better {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 4, 5, 3, 2, 1, 5};
        int largestElement = largestElementOfArray(arr, arr.length);
        int secondLargestElement = secondLargestElementOfArray(arr, arr.length, largestElement);
        System.out.println("Largest Element: " + largestElement + " Second Largest Element: " + secondLargestElement + " of an Array");
    }

    private static int secondLargestElementOfArray(int[] arr, int n, int largestElement) {
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > secondLargest && arr[i] < largestElement)
                secondLargest = arr[i];
        }
        return secondLargest;
    }

    private static int largestElementOfArray(int[] arr, int n) {
        int largest = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }
        return largest;
    }
}
