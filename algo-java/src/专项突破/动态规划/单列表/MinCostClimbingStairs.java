package 专项突破.动态规划.单列表;

/**
 * f(x)表示到达x层需要的最少体力
 * f(x) = min(f(x-1), f(x-2)) + cost[x]
 * 1,4,29,12
 *
 * @author Zexho
 * @date 2021/11/15 9:01 上午
 */
public class MinCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {
        int[] memo = new int[cost.length];
        int len = cost.length;
        if (len == 0) {
            return 0;
        }
        if (len <= 2) {
            return Math.min(cost[0], cost[1]);
        }
        memo[0] = cost[0];
        memo[1] = cost[1];
        for (int i = 2; i < len; i++) {
            memo[i] = Math.min(memo[i - 1], memo[i - 2]) + cost[i];
        }
        return Math.min(memo[len - 1], memo[len - 2]);
    }

    /**
     * 使用步数长度的数组
     */
    public int minCostClimbingStairs2(int[] cost) {
        int[] memo = new int[2];
        for (int i = 0; i < cost.length; i++) {
            memo[i % 2] = Math.min(memo[0], memo[1]) + cost[i];
        }
        return Math.min(memo[0], memo[1]);
    }

}
