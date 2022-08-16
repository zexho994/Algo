package 专项突破.动态规划.背包问题;

import org.junit.jupiter.api.Test;

class CombinationSumTest {

    @Test
    void combinationSum4() {
        CombinationSum combinationSum = new CombinationSum();
        int res1 = combinationSum.combinationSum4(new int[]{1, 2, 3}, 4);
        assert res1 == 7;
        int res2 = combinationSum.combinationSum4(new int[]{9}, 3);
        assert res2 == 0;
    }
}