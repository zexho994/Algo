import java.util.Arrays;

/**
 * @author Zexho
 * @date 2022/3/29 11:56 PM
 */
public class Change {
    public int change(int amount, int[] coins) {
        int[] arr = new int[amount + 1];
        arr[0] = 1;
        for (int coin : coins) {
            for (int j = coin; j <= amount; j++) {
                arr[j] += arr[j - coin];
            }
        }
        return arr[amount];
    }
}