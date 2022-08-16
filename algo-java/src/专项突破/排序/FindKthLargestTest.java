package 专项突破.排序;

import org.junit.jupiter.api.Test;

class FindKthLargestTest {

    @Test
    void findKthLargest() {
        FindKthLargest findKthLargest = new FindKthLargest();
        int kthLargest = findKthLargest.findKthLargest(new int[]{1, 5, 2, 7, 4, 8, 4}, 3);
        assert kthLargest == 5;
    }
}