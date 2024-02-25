import java.util.Arrays;
import java.util.stream.Stream;

public class FindTargetSumWays {

    public int findTargetSumWays(int[] nums, int target) {

        int sum = Arrays.stream(nums).reduce(0, (a, b) -> a + b);
        int zeroIdx = sum;
        int[][] dp = new int[nums.length+1][sum*2+1];
        dp[0][zeroIdx] = 1;
        if(target > sum || target < -sum) return 0;

        for (int i = 1; i < dp.length; i++) {
            for(int j = 0; j < dp[0].length; j++){
                if(dp[i-1][j] != 0){
                    dp[i][j+nums[i-1]] += dp[i-1][j];
                    dp[i][j-nums[i-1]] += dp[i-1][j];
                }
            }
        }

        return dp[nums.length][target + zeroIdx];
    }

}
