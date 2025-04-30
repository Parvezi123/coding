package Array;

import java.util.Arrays;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 1, 2, 2};
        System.out.println("Original Array Elements: " + Arrays.toString(arr));
        System.out.println("Unique Array Elements Size: " + removeDuplicateElementsInArray(arr));
        System.out.println("First Unique Array Elements: " + Arrays.toString(arr));
    }

    private static int removeDuplicateElementsInArray(int[] arr) {
        int n = arr.length;
        int uniqueElementsArraySize = 1;
        boolean duplicateExists = false;
        int duplicateElementIndex = 0;
        boolean isSwapped = true;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    duplicateExists = true;
                    duplicateElementIndex = isSwapped ? j : duplicateElementIndex;
                    isSwapped = false;
                } else if (duplicateExists) {
                    arr[duplicateElementIndex] = arr[j];
                    duplicateExists = false;
                    isSwapped = true;
                    uniqueElementsArraySize += 1;
                }
            }
        }
        return uniqueElementsArraySize;
    }
}
