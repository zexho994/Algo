import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

// Heap Sort Algorithm
public class HeapSort {

    // sort the array in place
    public int[] sort(int[] arr) {

        // step1 : heapify
        for (int i = arr.length - 1; i >= 0; i--) {
            heapify(arr, i);
        }

        int[] newArr = new int[arr.length];
        int arrTail = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[0];
            arr[0] = Integer.MAX_VALUE;
            swap(arr, arrTail--, 0);
            heapify(arr, 0);
        }

        return newArr;

    }

    private void heapify(int[] arr, int i) {
        int idx = i;
        int left = 2 * idx + 1;
        int right = 2 * idx + 2;

        while (left < arr.length) {
            if (right < arr.length && arr[left] > arr[right]) {
                swap(arr, left, right);
            }

            if (arr[idx] > arr[left]) {
                swap(arr, idx, left);
                idx = left;
            } else {
                break;
            }
            left = 2 * idx + 1;
            right = 2 * idx + 2;
        }

    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    @Nested
    class HeapSortTest {
        @Test
        public void testSort() {
            HeapSort heapSort = new HeapSort();
            int[] inputArr1 = {4, 10, 1, 5, 3, 8};
            int[] expectedOutputArr1 = {1, 3, 4, 5, 8, 10};
            int[] outputArr1 = heapSort.sort(inputArr1);
            assertArrayEquals(expectedOutputArr1, outputArr1);

            int[] inputArr2 = {-10, 20, 0, -5, 30, 10};
            int[] expectedOutputArr2 = {-10, -5, 0, 10, 20, 30};
            int[] outputArr2 = heapSort.sort(inputArr2);
            assertArrayEquals(expectedOutputArr2, outputArr2);
        }
    }


}
