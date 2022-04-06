import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinPathSumTest {

    @Test
    void minPathSum() {
        MinPathSum minPathSum = new MinPathSum();
        int[][] arr = new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        assert 7 == minPathSum.minPathSum(arr);
    }
}