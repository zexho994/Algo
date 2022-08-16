import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Zexho
 * @date 2022/4/2 11:34 PM
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            twoSum(nums[i], i + 1, nums.length - 1, nums, ans);
        }
        return ans;
    }

    private void twoSum(int target, int left, int right, int[] nums, List<List<Integer>> ans) {
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum + target == 0) {
                List<Integer> subList = new ArrayList<>(3);
                subList.add(target);
                subList.add(nums[left]);
                subList.add(nums[right]);
                ans.add(subList);
                left++;
                while (left < right && nums[left] == nums[left - 1]) left++;
                while (left < right && nums[right] == nums[right - 1]) right--;
            } else if (sum + target < 0) {
                left++;
            } else {
                right--;
            }
        }
    }
}

