package leetcode.medium;

import java.util.*;

/**
 * 15. 三数之和
 * @Author: 994
 * @Date: 2020/6/12 00:25
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null ){
            return null;
        }
        List<List<Integer>> ans = new LinkedList<>();
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length && nums[i] <= 0 ; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum > 0){
                    right--;
                }else if(sum < 0){
                    left++;
                }else{
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while (left < right && nums[left] == nums[left+1]){
                        left++;
                    }
                    while (left < right && nums[right] == nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }
            }
        }
        return ans;
    }
}
