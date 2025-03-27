package Array;

public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr= new int[] {1};
        int n = arr.length;
        if(checkArrayIsSorted(arr,n)) {
            System.out.println("The Array is Sorted");
        }
        else System.out.println("The Array is not Sorted");
    }

    private static boolean checkArrayIsSorted(int[] arr, int n) {
        boolean flag = true;
        for (int i = 0; i < n - 1; i++) {
            if(arr[i] <= arr[i+1]) {
                flag = true;
            }
            else return false;
        }
        return flag;
    }
}
