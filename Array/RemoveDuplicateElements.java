package Array;

import java.util.Arrays;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 4, 4, 4, 4, 4};
        System.out.println("Original Array Elements: " + Arrays.toString(arr));
        System.out.println("Unique Array Elements Size: " + removeDuplicateElementsInArray(arr));
        System.out.println("First Unique Array Elements: " + Arrays.toString(arr));
    }

    private static int removeDuplicateElementsInArray(int[] arr) {
        int n = arr.length;
        int uniqueElementsArraySize = 1;
        boolean duplicateElementExists = false;
        int duplicateElementIndex = 0;
        boolean isSwapped = true;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]!=arr[j]) {
                    uniqueElementsArraySize+=1;
                    if(duplicateElementExists) {
                        for (int k = duplicateElementIndex; k < j; k++) {
                            arr[k] = arr[j];
                        }
                        duplicateElementExists = false;
                        isSwapped = true;
                    }
                    break;
                }
                else {
                    duplicateElementExists = true;
                    duplicateElementIndex = isSwapped?j:duplicateElementIndex;
                    isSwapped = false;
                }
            }
        }
        return uniqueElementsArraySize;
    }
}
