import java.util.HashMap;
import java.util.Map;

/**
 * @author Zexho
 * @date 2022/3/27 8:32 PM
 */
public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (map.containsKey(n)) {
                continue;
            }
            int left = map.getOrDefault(n - 1, 0);
            int right = map.getOrDefault(n + 1, 0);
            int len = 1 + left + right;
            maxLen = Math.max(len, maxLen);
            map.put(n, len);
            map.put(n - left, len);
            map.put(n + right, len);
        }
        return maxLen;
    }
}
