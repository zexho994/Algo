package leetcode.medium;


public class CanPartition {
    public boolean canPartition(int[] nums) {
        if(nums.length < 2){
            return false;
        }
        int sum = 0;
        int max = 0;
        for (int n : nums) {
            sum += n;
            max = n > max ? n : max;
        }
        int target = sum >> 1;
        if (sum % 2 != 0 || max > target) {
            return false;
        }
        // row = val , col = idx
        boolean[][] memo = new boolean[nums.length][target + 1];
        memo[0][nums[0]] = true;
        // row
        for (int i = 1; i < nums.length; i++) {
            // col
            for(int j = 0 ; j < memo[0].length ; j++){
                if(memo[i-1][j]){
                    memo[i][j] = true;
                    if(j + nums[i] <= target){
                        memo[i][j+nums[i]] = true;
                    }
                }
            }
        }
        return memo[nums.length - 1][target];
    }
}
