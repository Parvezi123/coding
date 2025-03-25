package Array.secondLargest;

public class SecondLargest_Optimized {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,3,5,1};
        System.out.println("Second Largest Element in a Array: " + secondLargestElement(arr));
    }

    private static int secondLargestElement(int[] arr) {
        int n = arr.length;
        int largest = arr[0];
        int secondLargest = -1;
        for (int i = 1; i < n; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
