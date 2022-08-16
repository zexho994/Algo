package 专项突破.数组;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zexho
 * @date 2021/11/2 7:48 下午
 */
public class FindMaxLength {
    public int findMaxLength(int[] nums) {
        int prefixSum = 0, maxLen = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        for (int i = 1; i <= nums.length; i++) {
            prefixSum = nums[i - 1] == 1 ? prefixSum + 1 : prefixSum - 1;
            if (map.containsKey(prefixSum)) {
                int pidx = map.get(prefixSum);
                if (i - pidx > maxLen) {
                    maxLen = i - pidx;
                }
            } else {
                map.put(prefixSum, i);
            }
        }
        return maxLen;
    }
}
