package dayplan;

/**
 * @author Zexho
 * @date 2021/9/24 9:21 下午
 */
public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length - 1, c = 0;
        while (r >= 0 && c < matrix[0].length) {
            if (matrix[r][c] > target) {
                r--;
            } else if (matrix[r][c] < target) {
                c++;
            } else {
                return true;
            }
        }
        return false;
    }
}
