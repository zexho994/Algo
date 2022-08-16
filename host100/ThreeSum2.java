import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : zexho
 * @created : 2022-05-17
 **/
public class ThreeSum2 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; ) {
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == -nums[i]) {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left = nextIdx(nums, left, 1);
                    right = nextIdx(nums, right, -1);
                } else if (sum < -nums[i]) {
                    left = nextIdx(nums, left, 1);
                } else {
                    right = nextIdx(nums, right, -1);
                }
            }
            i = nextIdx(nums, i, 1);
        }
        return ans;
    }

    public int nextIdx(int[] nums, int idx, int add) {
        while (idx < nums.length - 1 && idx >= 0 && nums[idx] == nums[idx + add]) {
            idx += add;
        }
        return idx + add;
    }
}
