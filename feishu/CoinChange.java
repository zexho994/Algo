import java.util.Arrays;

/**
 * @author Zexho
 * @date 2022/3/30 9:50 PM
 */
public class CoinChange {


    public int coinChange(int[] coins, int amount) {
        int[] arr = new int[amount + 1];
        Arrays.fill(arr, amount + 1);
        arr[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    arr[i] = Math.min(arr[i], arr[i - coin] + 1);
                }
            }
        }
        return arr[amount] < amount ? arr[amount] : -1;
    }


}
