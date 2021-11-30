package 专项突破.动态规划.背包问题;

/**
 * @author Zexho
 * @date 2021/11/30 4:09 下午
 */
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        int[] arr = new int[amount + 1];
        for (int i = 1; i < arr.length; i++) {
            for (int coin : coins) {
                if (i == coin) {
                    arr[i] = 1;
                } else if (i > coin && arr[i - coin] > 0) {
                    arr[i] = Math.min(arr[i] == 0 ? Integer.MAX_VALUE : arr[i], arr[i - coin] + 1);
                }
            }
        }
        return arr[amount] == 0 ? -1 : arr[amount];
    }
}
