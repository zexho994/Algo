/**
 * @author Zexho
 * @date 2022/4/6 10:13 PM
 */
public class MinPathSum {
    public int minPathSum(int[][] grid) {
        int[] memo = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0) {
                    memo[j] = (j == 0 ? 0 : memo[j - 1]) + memo[j] + grid[i][j];
                } else if (j == 0) {
                    memo[0] = memo[0] + grid[i][j];
                } else {
                    memo[j] = Math.min(memo[j], memo[j - 1]) + grid[i][j];
                }
            }
        }
        return memo[grid[0].length - 1];
    }
}
