package 专项突破.动态规划.列表矩阵;

/**
 * @author Zexho
 * @date 2021/11/24 8:48 上午
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] arr = new int[m + 1][n + 1];
        arr[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j + 1] += arr[i][j];
                arr[i + 1][j] += arr[i][j];
            }
        }
        return arr[m - 1][n - 1];
    }

    /**
     * 使用2n
     *
     * @param m
     * @param n
     * @return
     */
    public int uniquePaths2(int m, int n) {
        int[][] arr = new int[2][n];
        arr[0][0] = 1;
        arr[1][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                arr[i % 2][j] = arr[i % 2][j - 1] + arr[(i + 1) % 2][j];
            }
        }
        return arr[(m + 1) % 2][n - 1];
    }
}
