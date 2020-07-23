package leetcode.medium;

/**
 * 64. 最小路径和
 * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小
 * @author: zexho
 * @created: 2020/07/23 08:29
 */
public class MinPathSum {
    public int minPathSum(int[][] grid) {
        if(grid == null || grid.length < 1 || grid[0].length < 1){
            return 0;
        }
        int row = grid.length,col = grid[0].length;
        int[][] res = new int[row][col];
        res[0][0] = grid[0][0];
        int r = 0,c = 1;
        int x , y;
        while (r < row){
            if(c == col){
                r++;
                c = 0;
                continue;
            }
            x = r == 0 ? Integer.MAX_VALUE : res[r-1][c];
            y = c == 0 ? Integer.MAX_VALUE : res[r][c-1];
            res[r][c] = Math.min(x,y)+grid[r][c];
            c++;
        }
        return res[row-1][col-1];
    }
}
