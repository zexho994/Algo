package 专项突破.动态规划.列表矩阵;

/**
 * @author Zexho
 * @date 2021/11/25 2:49 下午
 */
public class MinPathSum {


    /**
     * f(x,y) = min(f(x-1,y),f(x,y-1)) + grid[x][y]
     *
     * @param grid
     * @return
     */
    public int minPathSum(int[][] grid) {
        int[][] arr = new int[grid.length][grid[0].length];
        arr[0][0] = grid[0][0];
        for (int i = 1; i < grid[0].length; i++) {
            arr[0][i] = grid[0][i] + arr[0][i - 1];
        }
        for (int i = 1; i < grid.length; i++) {
            arr[i][0] = grid[i][0] + arr[i - 1][0];
            for (int j = 1; j < grid[0].length; j++) {
                arr[i][j] = Math.min(arr[i][j - 1], arr[i - 1][j]) + grid[i][j];
            }
        }
        return arr[grid.length - 1][grid[0].length - 1];
    }
}
