package 专项突破.动态规划.列表矩阵;

import java.util.List;

/**
 * @author Zexho
 * @date 2021/11/25 3:38 下午
 */
public class MinimumTotal {

    // arr[i][j] == min( arr[i-1][j-1] , arr[i-1][j])
    public int minimumTotal(List<List<Integer>> triangle) {
        int size = triangle.get(triangle.size() - 1).size();
        int[][] arr = new int[triangle.size()][size];
        arr[0][0] = triangle.get(0).get(0);

        // 累加
        for (int i = 1; i < triangle.size(); i++) {
            List<Integer> row = triangle.get(i);
            arr[i][0] = arr[i - 1][0] + row.get(0);
            for (int j = 1; j < row.size(); j++) {
                if (j == row.size() - 1) {
                    arr[i][j] = arr[i - 1][j - 1] + row.get(j);
                } else {
                    arr[i][j] = Math.min(arr[i - 1][j - 1], arr[i - 1][j]) + row.get(j);
                }
            }
        }

        // 获取最下一层的最小值
        int min = Integer.MAX_VALUE;
        for (int last : arr[triangle.size() - 1]) {
            min = Math.min(min, last);
        }
        return min;
    }

}
