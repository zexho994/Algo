package 专项突破.动态规划.背包问题;

/**
 * @author Zexho
 * @date 2021/11/30 4:09 下午
 */
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] arr = new int[amount + 1];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = amount + 1;
            for (int coin : coins) {
                if (i >= coin) {
                    arr[i] = Math.min(arr[i], arr[i - coin] + 1);
                }
            }
        }
        return arr[amount] > amount ? -1 : arr[amount];
    }
}
