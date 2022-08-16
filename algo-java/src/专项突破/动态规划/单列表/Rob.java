package 专项突破.动态规划.单列表;

/**
 * @author Zexho
 * @date 2021/11/15 11:00 上午
 */
public class Rob {
    public int rob(int[] nums) {
        int[] memo = new int[3];
        for (int i = 0; i < nums.length; i++) {
            int j = i % 3;
            if (j == 0) {
                memo[j] = Math.max(memo[0], memo[1]) + nums[i];
            } else if (j == 1) {
                memo[j] = Math.max(memo[1], memo[2]) + nums[i];
            } else {
                memo[j] = Math.max(memo[0], memo[2]) + nums[i];
            }
        }
        return Math.max(memo[2], Math.max(memo[0], memo[1]));
    }
}
