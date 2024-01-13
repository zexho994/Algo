import org.junit.jupiter.api.Nested;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSort {

    public int[] mergeSort(int[] arr) {
        if (arr.length <= 1) return arr;

        int[] arr1 = new int[arr.length / 2];
        int[] arr2 = new int[arr.length - arr1.length];

        System.arraycopy(arr, 0, arr1, 0, arr1.length);
        System.arraycopy(arr, arr1.length, arr2, 0, arr2.length);

        return merge(mergeSort(arr1), mergeSort(arr2));
    }

    private int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int idx1 = 0, idx2 = 0;
        while (idx1 < arr1.length && idx2 < arr2.length) {
            if (arr1[idx1] <= arr2[idx2]) {
                result[idx1 + idx2] = arr1[idx1];
                idx1++;
            } else {
                result[idx1 + idx2] = arr2[idx2];
                idx2++;
            }
        }
        while (idx1 < arr1.length) {
            result[idx1 + idx2] = arr1[idx1++];
        }
        while (idx2 < arr2.length) {
            result[idx1 + idx2] = arr2[idx2++];
        }
        return result;
    }


    @Nested
    class Test {

        @org.junit.jupiter.api.Test
        public void test() {
            MergeSort ms = new MergeSort();

            int[] input1 = {5, 2, 4, 1, 3};
            int[] expected1 = {1, 2, 3, 4, 5};
            assertArrayEquals(expected1, ms.mergeSort(input1));

            int[] input2 = {1, 2, 3, 4, 5};
            int[] expected2 = {1, 2, 3, 4, 5};
            assertArrayEquals(expected2, ms.mergeSort(input2));

            int[] input3 = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
            int[] expected3 = {1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9};
            assertArrayEquals(expected3, ms.mergeSort(input3));
        }

    }

}
