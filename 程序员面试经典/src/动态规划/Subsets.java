package 动态规划;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Zexho
 * @date 2022/2/22 3:59 PM
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Stack<Integer> sub = new Stack<>();
        dp(nums, sub, 0, res);
        return res;
    }

    private void dp(int[] arr, Stack<Integer> sub, int idx, List<List<Integer>> res) {
        if (idx == arr.length) {
            if (sub.isEmpty()) res.add(new ArrayList<>(sub));
            return;
        }

        // 不加
        dp(arr, sub, idx + 1, res);

        // 加
        sub.push(arr[idx]);
        dp(arr, sub, idx + 1, res);
        sub.pop();
    }
}
