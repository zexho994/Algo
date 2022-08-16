package 专项突破.数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Zexho
 * @date 2021/10/30 10:51 上午
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        int i = 0;
        while (i < nums.length - 2) {
            twoSum(nums, i, res);
            int t = nums[i];
            while (i < nums.length && nums[i] == t) {
                i++;
            }
        }

        return res;
    }

    public void twoSum(int[] nums, int i, List<List<Integer>> res) {
        int j = i + 1, k = nums.length - 1;
        while (j < k) {
            int n;
            if ((n = nums[i] + nums[j] + nums[k]) == 0) {
                res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                int t = nums[j];
                while (j < k && nums[j] == t) {
                    j++;
                }
            } else if (n > 0) {
                k--;
            } else {
                j++;
            }

        }
    }
}
