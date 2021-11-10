package 专项突破.回溯;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Zexho
 * @date 2021/11/10 2:45 下午
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        LinkedList<List<Integer>> result = new LinkedList<>();
//        result.add(new LinkedList<>());
//        loop(nums, result, new LinkedList<>(), 0);
        loop2(nums,0,result,new LinkedList<>());
        return result;
    }

    public void loop(int[] nums, LinkedList<List<Integer>> result, LinkedList<Integer> subList, int idx) {
        for (int i = idx; i < nums.length; i++) {
            subList.add(nums[i]);
            result.add(new LinkedList<>(subList));
            loop(nums, result, subList, i + 1);
            subList.removeLast();
        }
    }

    public void loop2(int[] nums, int idx, List<List<Integer>> result, LinkedList<Integer> subList) {
        if (idx == nums.length) {
            result.add(new LinkedList<>(subList));
        } else {
            loop2(nums, idx + 1, result, subList);
            subList.add(nums[idx]);
            loop2(nums, idx + 1, result, subList);
            subList.removeLast();
        }
    }

}
