package leetcode.medium;

/**
 * @Author: 994
 * @Date: 2020/6/28 12:37
 */
public class MinSubArrayLen {
    public int minSubArrayLen(int s, int[] nums) {
        int min = Integer.MAX_VALUE;
        int num = 0;
        int l = 0;
        int r = 0;
        while (r <= nums.length && min > 1){
            if(num < s && r < nums.length){
                num += nums[++r];
            }else{
                min = Math.min(min,r - l);
                num -= nums[l++];
            }
        }
        min = min == Integer.MAX_VALUE ? 0 : min;
        return min;
    }
}
