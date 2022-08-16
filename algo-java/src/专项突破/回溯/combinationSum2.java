package 专项突破.回溯;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Zexho
 * @date 2021/11/11 11:07 上午
 */
public class combinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new LinkedList<>();
        loop(candidates, target, 0, result, new LinkedList<>());
        return result;
    }

    public void loop(int[] candidates, int target, int idx, List<List<Integer>> result, LinkedList<Integer> sub) {
        if (target == 0) {
            result.add(new LinkedList<>(sub));
        } else if (idx < candidates.length && target > 0) {
            int j = idx + 1;
            while (j < candidates.length && candidates[j] == candidates[idx]) {
                j++;
            }
            loop(candidates, target, j, result, sub);

            sub.add(candidates[idx]);
            loop(candidates, target - candidates[idx], idx + 1, result, sub);
            sub.removeLast();
        }
    }
}
