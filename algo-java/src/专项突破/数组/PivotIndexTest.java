package 专项突破.数组;

import org.junit.jupiter.api.Test;

class PivotIndexTest {

    @Test
    void pivotIndex() {
        PivotIndex pivotIndex = new PivotIndex();
        int[] arr1 = new int[]{-1, -1, 0, 1, 1, -1};
        int i = pivotIndex.pivotIndex(arr1);
        assert i == 0;
    }
}