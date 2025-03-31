package Array;

import java.util.Arrays;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,3,2,4};
        int[] newArr = removeDuplicateElementsInArray(arr, arr.length);
        System.out.println("The unique Elements Array: " + Arrays.toString(arr));
    }

    static int[] removeDuplicateElementsInArray(int[] arr, int n) {
        int	r=0;
        for (int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]!=arr[j])
                {
                    r=r+1;
                    arr[r] = arr[j];
                }
            }
        }
        return null;
    }
}
