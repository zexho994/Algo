/**
 * @author Zexho
 * @date 2022/2/14 10:14 AM
 */
public class Rotate {
    public void rotate(int[][] matrix) {
        int len = matrix.length - 1;
        for (int r = 0; r < (len + 1) / 2; r++) {
            for (int c = r; c < len - r; c++) {
                int temp = matrix[r][c];
                matrix[r][c] = matrix[len - c][r];
                matrix[len - c][r] = matrix[len - r][len - c];
                matrix[len - r][len - c] = matrix[c][len - r];
                matrix[c][len - r] = temp;
            }
        }
    }
}
