import java.util.ArrayList;
import java.util.List;

/**
 * @author Zexho
 * @date 2022/3/28 10:51 PM
 */
public class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        process(matrix, 0, 0, matrix[0].length - 1, matrix.length - 1, ans);
        return ans;
    }

    private void process(int[][] arr, int left, int up, int right, int down, List<Integer> ans) {
        for (int i = left; i <= right; i++) {
            ans.add(arr[up][i]);
        }
        for (int i = up + 1; i <= down; i++) {
            ans.add(arr[i][right]);
        }
        if (left < right && down > up) {
            for (int i = right - 1; i >= left; i--) {
                ans.add(arr[down][i]);
            }
            for (int i = down - 1; i > up; i--) {
                ans.add(arr[i][left]);
            }
        }
        if (left < right - 1 && up < down - 1) {
            process(arr, left + 1, up + 1, right - 1, down - 1, ans);
        }
    }

}
