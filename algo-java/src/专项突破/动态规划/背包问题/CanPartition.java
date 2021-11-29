package 专项突破.动态规划.背包问题;

/**
 * 0 0 0 1
 *
 * @author Zexho
 * @date 2021/11/26 9:12 下午
 */
public class CanPartition {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        if (sum % 2 == 1) {
            return false;
        }
        sum /= 2;
        // arr[i][j] 表示第i个数字和为j的可能性
        boolean[][] arr = new boolean[nums.length + 1][sum + 1];
        arr[0][0] = true;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (!arr[i - 1][j]) {
                    continue;
                }
                arr[i][j] = true;
                int n = j + nums[i - 1];
                if (n == sum) {
                    return true;
                } else if (n < sum) {
                    arr[i][n] = true;
                }
            }
        }
        return false;
    }
}
