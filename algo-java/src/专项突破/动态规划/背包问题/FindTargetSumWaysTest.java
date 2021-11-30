package 专项突破.动态规划.背包问题;

import org.junit.jupiter.api.Test;

class FindTargetSumWaysTest {

    @Test
    void findTargetSumWays() {
        FindTargetSumWays findTargetSumWays = new FindTargetSumWays();
        int res1 = findTargetSumWays.findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3);
        assert res1 == 5;
        int res2 = findTargetSumWays.findTargetSumWays(new int[]{1}, 2);
        assert res2 == 0;
    }
}