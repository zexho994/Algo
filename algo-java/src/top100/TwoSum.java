package top100;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zexho
 * @date 2022/1/4 8:38 AM
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && nums[i] * 2 == target) {
                return new int[]{i, map.get(nums[i])};
            }
            map.put(nums[i], i);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (map.containsKey(target - entry.getKey())) {
                return new int[]{entry.getValue(), map.get(target - entry.getKey())};
            }
        }
        return null;
    }

}
