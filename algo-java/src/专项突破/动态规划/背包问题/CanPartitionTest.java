package 专项突破.动态规划.背包问题;

import org.junit.jupiter.api.Test;

class CanPartitionTest {

    @Test
    public void canPartition() {
        CanPartition canPartition = new CanPartition();
        boolean b = canPartition.canPartition(new int[]{1, 5, 11, 5});
        assert b;
        boolean res2 = canPartition.canPartition(new int[]{1,5,11,5,10,6});
        assert !res2;
    }
}