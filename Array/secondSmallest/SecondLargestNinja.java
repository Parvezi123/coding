package Array.secondSmallest;

public class SecondLargestNinja {
    public static void main(String[] args) {
        int[] arr = new int[]{-3, -3};
        int n = arr.length;
        System.out.println("The second Largest Element in an Array: " + findSecondLargest(arr, n));
    }

    private static int findSecondLargest(int[] arr, int n) {
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        boolean isSecondLargestExists = false;

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                isSecondLargestExists = true;
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                isSecondLargestExists = true;
                secondLargest = arr[i];
            }
            if (!isSecondLargestExists)
                return -1;
        }
        return secondLargest;
    }
}
