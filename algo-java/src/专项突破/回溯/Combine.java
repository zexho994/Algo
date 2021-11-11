package 专项突破.回溯;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Zexho
 * @date 2021/11/11 9:50 上午
 */
public class Combine {

    /**
     * 1~n 中 k个数的所有组合形式
     */
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        loop(n, k, 1, result, new LinkedList<>());
        return result;
    }

    private void loop(int n, int k, int cur, List<List<Integer>> result, LinkedList<Integer> sub) {
        if (sub.size() == k) {
            result.add(new LinkedList<>(sub));
        } else if (cur <= n) {
            loop(n, k, cur + 1, result, sub);
            sub.add(cur);
            loop(n, k, cur + 1, result, sub);
            sub.removeLast();
        }
    }

}
