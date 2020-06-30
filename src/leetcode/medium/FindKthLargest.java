package leetcode.medium;

import java.util.Arrays;

/**
 * @Author: 994
 * @Date: 2020/6/29 12:51
 */
public class FindKthLargest {
    public int findKthLargest(int[] nums, int k) {
        if(nums == null || nums.length < 1){
            return 0;
        }
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
