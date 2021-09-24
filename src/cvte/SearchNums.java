package cvte;

import java.util.*;

/**
 * @author Zexho
 * @date 2021/9/24 10:28 上午
 */
public class SearchNums {

    public List<List<Integer>> solution(int[] integerSet, int targetInteger) {
        if (integerSet == null || integerSet.length <= 0 || targetInteger < 0) {
            return null;
        }
        Set<Integer> numSet = new HashSet<>(integerSet.length);
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.stream(integerSet).filter(e -> e <= targetInteger).forEach(numSet::add);
        // 遍历set,遇到和小于target则继续遍历，大于则跳过
        // n + x == target ? n + x -> () : n + x
        dp(targetInteger, numSet, ans, new ArrayList<>());
        return ans;
    }

    private void dp(int t, Set<Integer> set, List<List<Integer>> ans, List<Integer> sub) {
        if (t == 0) {
            ans.add(sub);
            return;
        }
        set.stream().filter(e -> t - e >= 0)
                .forEach(e -> {
                    List<Integer> s = new ArrayList<>(sub);
                    s.add(e);
                    dp(t - e, set, ans, s);
                });
    }

}
