package 专项突破.回溯;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Zexho
 * @date 2021/11/11 10:14 上午
 */
public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new LinkedList<>();
        loop(candidates, target, 0, result, new LinkedList<>());
        return result;
    }

    private void loop(int[] candidates, int n, int idx, List<List<Integer>> result, LinkedList<Integer> sub) {
        if (n < 0) {
            return;
        } else if (n == 0) {
            result.add(new LinkedList<>(sub));
        } else if (idx < candidates.length) {
            loop(candidates, n, idx + 1, result, sub);
            sub.add(candidates[idx]);
            loop(candidates, n - candidates[idx], idx, result, sub);
            sub.removeLast();
        }
    }

}
