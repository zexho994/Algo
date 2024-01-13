import org.junit.jupiter.api.Nested;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuickSort {

    public static void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    // sort the array arr using quick sort algorithm
    private static void quickSort(int[] arr, int left, int right) {
        if (left >= right) return;

        int key = arr[right];
        int l = left, r = right - 1;
        while (l <= r) {
            if (arr[l] <= key) {
                l++;
            } else {
                swap(arr, l, r--);
            }

        }

        swap(arr, l, right);

        quickSort(arr, left, l-1);
        quickSort(arr, l+1, right);
    }

    public static void swap(int[] arr, int p1, int p2) {
        int n = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = n;
    }

    @Nested
    class Test {

        @org.junit.jupiter.api.Test
        public void testSort() {
            int[] arr = {5, 2, 8, 3, 6};
            QuickSort.sort(arr);
            int[] expected = {2, 3, 5, 6, 8};
            assertArrayEquals(expected, arr);
        }

        @org.junit.jupiter.api.Test
        public void testSortWithNegativeNumbers() {
            int[] arr = {-5, 2, -8, 3, 6};
            QuickSort.sort(arr);
            int[] expected = {-8, -5, 2, 3, 6};
            assertArrayEquals(expected, arr);
        }

        @org.junit.jupiter.api.Test
        public void testSortWithDuplicates() {
            int[] arr = {5, 2, 8, 3, 5, 8};
            QuickSort.sort(arr);
            int[] expected = {2, 3, 5, 5, 8, 8};
            assertArrayEquals(expected, arr);
        }

    }

}
