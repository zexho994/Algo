/**
 * @author Zexho
 * @date 2022/3/26 10:30 PM
 */
public class NumIslands {

    public int numIslands(char[][] grid) {
        int size = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    size++;
                    trace(grid, i, j);
                }
            }
        }
        return size;
    }

    private void trace(char[][] grid, int r, int c) {
        if (r == -1 || r == grid.length || c == -1 || c == grid[0].length) {
            return;
        }
        if (grid[r][c] != '1') {
            return;
        }
        grid[r][c] = '2';
        trace(grid, r - 1, c);
        trace(grid, r + 1, c);
        trace(grid, r, c - 1);
        trace(grid, r, c + 1);
    }

}
