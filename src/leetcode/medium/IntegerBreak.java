package leetcode.medium;

/**
 * 343. 整数拆分
 * 给定一个正整数 n，将其拆分为至少两个正整数的和，并使这些整数的乘积最大化。 返回你可以获得的最大乘积。
 *
 * @author: zexho
 * @created: 2020/07/30 13:09
 */
public class IntegerBreak {
    public int integerBreak(int n) {
        int max = 0;
        int[] memo = new int[n+1];
        for(int i = 2 ; i < n ; i++){
            max = 0;
            for(int j = 1 ; j < i ; j++){
                max = Math.max(max, Math.max(i * j, memo[i] * memo[i]));
            }
            memo[i] = max;
        }
        return max;
    }
}
