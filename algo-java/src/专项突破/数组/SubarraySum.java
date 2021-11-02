package 专项突破.数组;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zexho
 * @date 2021/11/2 7:25 下午
 */
public class SubarraySum {
    public int subarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        //k : prefix sum. v: count
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int pre = 0, count = 0;
        for (int num : nums) {
            pre += num;
            count += map.getOrDefault(pre - k, 0);
            map.put(pre, map.getOrDefault(pre, 0) + 1);
        }
        return count;
    }
}
