import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void sortArray() {
        QuickSort quickSort = new QuickSort();
        int[] ints = quickSort.sortArray(new int[]{5, 2, 3, 4, 1});
        Arrays.stream(ints).forEach(System.out::println);
    }
}