package Array.secondLargest;

public class SecondLargest_Better {
    public static void main(String[] args) {
        int[] arr = new int[] {1,5,5,5,5,5};
        int n = arr.length;
        int largest = arr[0];
        int secondLargest = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }
//        System.out.println(largest);
        secondLargest = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > secondLargest && arr[i] != largest)
                secondLargest = arr[i];
        }
        System.out.println("Second Largest: " + secondLargest);
    }
}
