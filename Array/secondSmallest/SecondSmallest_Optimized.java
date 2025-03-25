package Array.secondSmallest;

public class SecondSmallest_Optimized {
    public static void main(String[] args) {
        int[] arr = new int[] {4,3,1,4,5};
        System.out.println("Second Smallest Number: " + secondSmallestNumber(arr));
    }

    private static int secondSmallestNumber(int[] arr) {
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] > smallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }
}
