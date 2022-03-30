import org.junit.jupiter.api.Test;

class FindKthLargestTest {

    @Test
    void findKthLargest2() {
        FindKthLargest findKthLargest = new FindKthLargest();
        int res1 = findKthLargest.findKthLargest2(new int[]{1, 4, 5, 2, 7, 6}, 2);
        assert res1 == 6;


        int res2 = findKthLargest.findKthLargest2(new int[]{3, 1, 2, 4}, 2);
        assert res2 == 3;
    }
}