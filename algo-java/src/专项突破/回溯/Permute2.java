package 专项突破.回溯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Zexho
 * @date 2021/11/11 4:55 下午
 */
public class Permute2 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        loop(nums, 0, result);
        return result;
    }

    private void loop(int[] nums, int idx, List<List<Integer>> result) {
        if (idx == nums.length) {
            result.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        } else {
            for (int i = idx; i < nums.length; i++) {
                swag(nums, i, idx);
                loop(nums, idx + 1, result);
                swag(nums, i, idx);
            }
        }
    }

    private void swag(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
