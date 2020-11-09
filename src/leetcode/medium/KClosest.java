package leetcode.medium;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 973. 最接近原点的 K 个点
 */
public class KClosest {
    public int[][] kClosest(int[][] points, int K) {
        int len = points[0].length;
        ArrayList<int[][]> list = new ArrayList();
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] * o1[0] + o1[1] * o1[1] - (o2[1] * o2[1] + o2[0] * o2[0]);
            }
        });
        return Arrays.copyOfRange(points, 0, K);
    }
}
