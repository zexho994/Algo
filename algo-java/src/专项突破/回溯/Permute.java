package 专项突破.回溯;

import java.util.*;

/**
 * @author Zexho
 * @date 2021/11/11 4:11 下午
 */
public class Permute {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        Arrays.stream(nums).forEach(set::add);
        loop(nums, set, result, new LinkedList<>());
        return result;
    }

    private void loop(int[] nums, Set<Integer> set, List<List<Integer>> result, LinkedList<Integer> sub) {
        if (set.isEmpty()) {
            result.add(new LinkedList<>(sub));
            return;
        }

        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
                sub.add(num);
                loop(nums, set, result, sub);
                sub.removeLast();
                set.add(num);
            }
        }
    }
}
