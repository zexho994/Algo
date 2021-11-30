package 专项突破.动态规划.背包问题;

/**
 * @author Zexho
 * @date 2021/11/30 8:44 上午
 */
public class FindTargetSumWays {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        if (target > sum || target < -sum) {
            return 0;
        }
        int[][] arr = new int[nums.length + 1][2 * sum + 1];
        arr[0][sum] = 1;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i - 1][j] != 0) {
                    arr[i][j - nums[i - 1]] += arr[i - 1][j];
                    arr[i][j + nums[i - 1]] += arr[i - 1][j];
                }
            }
        }
        return arr[nums.length][target + sum];
    }
}
