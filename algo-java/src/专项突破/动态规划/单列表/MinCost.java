package 专项突破.动态规划.单列表;

/**
 * @author Zexho
 * @date 2021/11/16 10:25 上午
 */
public class MinCost {
    public int minCost(int[][] costs) {
        int[][] memo = new int[2][3];
        for (int i = 0; i < costs.length; i++) {
            int j = i % 2;
            int k = (j + 1) % 2;
            memo[j][0] = Math.min(memo[k][1], memo[k][2]) + costs[i][0];
            memo[j][1] = Math.min(memo[k][0], memo[k][2]) + costs[i][1];
            memo[j][2] = Math.min(memo[k][0], memo[k][1]) + costs[i][2];
        }
        int i = (costs.length + 1) % 2;
        return Math.min(memo[i][0], Math.min(memo[i][1], memo[i][2]));
    }
}
