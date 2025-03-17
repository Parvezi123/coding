package Array;

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = new int[] {4,2,6,1,9,6,0};

        int n = arr.length;
        int largest = arr[0];

        for(int i=1;i<n;i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest number is "+largest);
    }
}