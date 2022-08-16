package 专项突破.数组;

/**
 * @author Zexho
 * @date 2021/11/1 8:57 上午
 */
public class MinSubArrayLen {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0, minLen = nums.length + 1, left = 0, right = 0;
        while (right <= nums.length) {
            if (sum >= target) {
                minLen = Math.min(minLen, right - left);
                sum -= nums[left++];
            } else {
                if (right == nums.length) {
                    break;
                }
                sum += nums[right++];
            }
        }
        return minLen == nums.length + 1 ? 0 : minLen;
    }
}
