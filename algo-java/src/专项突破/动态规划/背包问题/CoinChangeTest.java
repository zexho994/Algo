package 专项突破.动态规划.背包问题;

import org.junit.jupiter.api.Test;

class CoinChangeTest {

    @Test
    void coinChange() {
        CoinChange coinChange = new CoinChange();
        int res1 = coinChange.coinChange(new int[]{1, 2, 5}, 11);
        assert res1 == 3;
        int res2 = coinChange.coinChange(new int[]{1, 2, 5}, 0);
        assert res2 == 0;
        int res3 = coinChange.coinChange(new int[]{3, 2, 5}, 1);
        assert res3 == -1;
        int res4 = coinChange.coinChange(new int[]{2}, 3);
        assert res4 == -1;
    }
}