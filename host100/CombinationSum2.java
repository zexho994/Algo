import java.util.List;
import java.util.ArrayList;

/**
 * @author : zexho
 * @created : 2022-05-26
 **/
public class CombinationSum2 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        process(candidates, 0, ans, new ArrayList<>(), target);
        return ans;
    }

    public void process(int[] candidates, int i, List<List<Integer>> ans, List<Integer> subList, int target) {
        if (i == candidates.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(subList));
            }
        } else {
            process(candidates, i + 1, ans, subList, target);
            if (target >= candidates[i]) {
                subList.add(candidates[i]);
                process(candidates, i, ans, subList, target - candidates[i]);
                subList.remove(subList.size() - 1);
            }
        }
    }
}
