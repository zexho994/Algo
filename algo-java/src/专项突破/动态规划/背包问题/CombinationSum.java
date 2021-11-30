package 专项突破.动态规划.背包问题;

/**
 * @author Zexho
 * @date 2021/11/30 6:53 下午
 */
public class CombinationSum {

    /**
     * f(x) = ∑ f(x - arr[j]) , arr[j] <= x
     *
     * @param nums
     * @param target
     * @return
     */
    public int combinationSum4(int[] nums, int target) {
        // arr[i] 表示为i的全排列个数
        int[] arr = new int[target + 1];
        arr[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            for (int n : nums) {
                if (i >= n) {
                    arr[i] += arr[i - n];
                }
            }
        }
        return arr[target];
    }

}
