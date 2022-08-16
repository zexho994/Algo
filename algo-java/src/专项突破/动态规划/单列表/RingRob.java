package 专项突破.动态规划.单列表;

/**
 * @author Zexho
 * @date 2021/11/15 2:32 下午
 */
public class RingRob {
    public int rob(int[] nums) {
        return Math.max(dp(nums, 0, nums.length - 1), dp(nums, 1, nums.length));
    }

    public int dp(int[] nums, int start, int end) {
        int[] memo1 = new int[3];
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = start; i < end; i++) {
            int j = i % 3;
            if (j == 0) {
                memo1[0] = Math.max(memo1[1], memo1[0]) + nums[i];
            } else if (j == 1) {
                memo1[1] = Math.max(memo1[1], memo1[2]) + nums[i];
            } else {
                memo1[2] = Math.max(memo1[0], memo1[2]) + nums[i];
            }
        }
        return Math.max(memo1[0], Math.max(memo1[1], memo1[2]));
    }
}
