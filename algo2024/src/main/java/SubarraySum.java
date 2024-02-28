import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubarraySum {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> tmp = new HashMap<>();
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += map.getOrDefault(k - nums[i], 0);
            result += k == nums[i] ? 1 : 0;

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                tmp.put(entry.getKey() + nums[i], entry.getValue());
            }
            tmp.put(nums[i], tmp.getOrDefault(nums[i], 0) + 1);
            map.clear();
            map.putAll(tmp);
            tmp.clear();
        }
        return result;
    }

    @Nested
    class SubarraySumTest {

        private final SubarraySum subarraySum = new SubarraySum();

        @Test
        public void testSubarraySumExample1() {
            int[] nums = {1, 2, 3};
            int k = 3;
            int expected = 2; // There are two subarrays with sum 6: [3, 1, 2] and [4, 2]
            int result = subarraySum.subarraySum(nums, k);
            assertEquals(expected, result, "The number of subarrays with sum k should be equal to expected.");
        }
    }
}
