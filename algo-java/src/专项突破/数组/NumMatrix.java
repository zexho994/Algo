package 专项突破.数组;

/**
 * @author Zexho
 * @date 2021/11/3 2:21 下午
 */
public class NumMatrix {
    int[][] preSum;

    public NumMatrix(int[][] matrix) {
        this.preSum = new int[matrix.length][matrix[0].length];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if (c == 0) {
                    preSum[r][0] = matrix[r][0];
                } else {
                    preSum[r][c] = preSum[r][c - 1] + matrix[r][c];
                }
            }
        }
    }

    /**
     * 1. 暴力法
     * 遍历
     * <p>
     * 2.
     * 记录每一行的前缀和
     * <p>
     * 3.
     * 记录(0,0)到每一个(x,y)的矩阵大小
     *
     * @param row1 左上角行数
     * @param col1 左上角列数
     * @param row2 右下角行数
     * @param col2 右下角列数
     * @return 矩形内和
     */
    public int sumRegion(int row1, int col1, int row2, int col2) {
        //col1 , col2 ==> pre[r][col2] - pre[r][col1-1]
        // row1 -> row2
        int region = 0;
        if (col1 == 0) {
            while (row1 <= row2) {
                region += preSum[row1][col2];
                row1++;
            }
        } else {
            int c = col1 - 1;
            while (row1 <= row2) {
                region += preSum[row1][col2] - preSum[row1][c];
                row1++;
            }
        }
        return region;
    }
}
