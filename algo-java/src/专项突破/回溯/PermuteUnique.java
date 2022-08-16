package 专项突破.回溯;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Zexho
 * @date 2021/11/11 5:24 下午
 */
public class PermuteUnique {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        loop(nums, 0, result);
        return result;
    }

    public void loop(int[] nums, int idx, List<List<Integer>> result) {
        if (idx == nums.length) {
            result.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
            return;
        }

        Set<Integer> set = new HashSet<>();
        for (int i = idx; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                continue;
            }
            set.add(nums[i]);
            swap(nums, idx, i);
            loop(nums, idx + 1, result);
            swap(nums, idx, i);
        }
    }

    private void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
