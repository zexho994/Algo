import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HeapSortTest {

    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();
        int[] ints = heapSort.sortArray(new int[]{2, 5, 1, 7, 39, 13});
        Arrays.stream(ints).forEach(System.out::println);

        int[] ints2 = heapSort.sortArray(new int[]{5,2,3,1});
        Arrays.stream(ints2).forEach(System.out::println);
    }

}