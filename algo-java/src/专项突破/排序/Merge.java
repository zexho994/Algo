package 专项突破.排序;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * 合并区间
 *
 * @author Zexho
 * @date 2021/12/2 7:57 下午
 */
public class Merge {

    public int[][] merge(int[][] intervals) {
        List<int[]> merged = new LinkedList<>();
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        int pre = intervals[0][0], last = intervals[0][1];
        for (int i = 0; i < intervals.length - 1; i++) {
            if (last >= intervals[i + 1][0]) {
                last = Math.max(intervals[i + 1][1], last);
            } else {
                merged.add(new int[]{pre, last});
                pre = intervals[i + 1][0];
                last = intervals[i + 1][1];
            }
        }
        merged.add(new int[]{pre, last});
        int[][] result = new int[intervals.length][2];
        return merged.toArray(result);
    }

}
