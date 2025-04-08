package Array;

import java.util.Arrays;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] arr = new int[] {0,0,0,1,2,2,3,3};
        int uniqueArraySize = removeDuplicateElementsInArray(arr, arr.length);
        System.out.println("Unique Elements in an Array: " + uniqueArraySize);
        System.out.println("The unique Elements Array: " + Arrays.toString(arr));
    }

    private static int removeDuplicateElementsInArray(int[] arr, int n) {
        int	r=0;
        boolean isDuplicateExists = false;
        for (int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {

                if(arr[i]!=arr[j] && isDuplicateExists)
                {
                    r = r + 1;
                    arr[j] = arr[r];

                }
                else isDuplicateExists = true;
            }
        }
        return r;
    }
}
