package 专项突破.动态规划.单列表;

/**
 * 每一步可以选择翻或者不翻，但有一些限制条件
 * 1. 0翻，意味后面不能有0了，后续所有0都要翻
 * 2. 0不翻，意味后面不能有1了，后续所有1都要翻0
 *
 * @author Zexho
 * @date 2021/11/16 10:40 上午
 */
public class MinFlipsMonoIncr {
    public int minFlipsMonoIncr(String s) {
        char[] chars = s.toCharArray();
        int[][] memo = new int[2][2];
        for (int i = 0; i < chars.length; i++) {
            int j = i % 2;
            int k = (i + 1) % 2;
            memo[j][0] = chars[i] == '0' ? memo[k][0] : memo[k][0] + 1;
            int n = Math.min(memo[k][1], memo[k][0]);
            memo[j][1] = chars[i] == '0' ? n + 1 : n;
        }
        return chars.length % 2 == 0 ? Math.min(memo[1][0], memo[1][1]) : Math.min(memo[0][0], memo[0][1]);
    }
}
