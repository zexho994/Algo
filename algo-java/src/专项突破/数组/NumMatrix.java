package 专项突破.数组;

/**
 * @author Zexho
 * @date 2021/11/3 2:21 下午
 */
public class NumMatrix {
    int[][] regionSum;

    public NumMatrix(int[][] matrix) {
        this.regionSum = new int[matrix.length + 1][matrix[0].length + 1];
        for (int r = 0; r < matrix.length; r++) {
            int rowSum = 0;
            for (int c = 0; c < matrix.length; c++) {
                rowSum += matrix[r][c];
                this.regionSum[r + 1][c + 1] = rowSum + regionSum[r][c];
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
        return this.regionSum[row2 + 1][col2 + 1]
                - this.regionSum[row2 + 1][col1]
                - this.regionSum[row1][col2 + 1]
                + this.regionSum[row1][col1];
    }
}
