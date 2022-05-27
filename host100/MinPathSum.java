/**
 * @author : zexho
 * @created : 2022-05-27
**/
public class MinPathSum{
    public int minPathSum(int[][] grid) {
        int[] memo = new int[grid[0].length];
        memo[0] = grid[0][0];
        for(int col = 1; col < memo.length; col++){
            memo[col] = memo[col-1] + grid[0][col];
        }
        for(int row = 1; row < grid.length; row++){
            for(int col = 0; col < memo.length; col++){
                int pre = col == 0 ? Integer.MAX_VALUE : memo[col-1];
                memo[col] = Math.min(pre , memo[col]) + grid[row][col];
            }
        }
        return memo[memo.length-1];
    }
}
