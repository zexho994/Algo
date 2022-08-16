package 专项突破.数组;

/**
 * @author Zexho
 * @date 2021/11/1 11:19 上午
 */
public class NumSubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0, right = 0, sum = 1, count = 0;
        while (right <= nums.length) {
            if (sum * nums[right] < k) {
                sum *= nums[right++];
                count += right - left;
            } else {
                if (right == left) {
                    right++;
                    left++;
                } else {
                    sum /= nums[left++];
                }
            }
        }

        return count;
    }
}
