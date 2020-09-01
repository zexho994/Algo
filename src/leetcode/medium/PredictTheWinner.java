package leetcode.medium;

public class PredictTheWinner {

    public boolean PredictTheWinner(int[] nums) {
        return dp(nums,0,nums.length-1,0,true);
    }

    public boolean dp(int[] nums, int l, int r, int res, boolean flag) {
        if (l > r) {
            if (res > 0) {
                return true;
            }
            return false;
        }
        int res1, res2;
        if (flag) {
            res1 = res + nums[l];
            res2 = res + nums[r];
            return dp(nums, l + 1, r, res1, !flag) || dp(nums, l, r - 1, res2, !flag);
        } else {
            res1 = res - nums[l];
            res2 = res - nums[r];
            return !dp(nums, l + 1, r, res1, !flag) || !dp(nums, l, r - 1, res2, !flag);
        }
    }
}
