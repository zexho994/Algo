package 专项突破.字符串.回文;

/**
 * @author Zexho
 * @date 2021/11/5 10:39 上午
 */
public class CountSubstrings {

    /**
     * 1. 暴力法
     */
    public int countSubstrings(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                ans += this.judge(s, i, j);
            }
        }
        return ans;
    }

    public int judge(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return 0;
            }
        }
        return 1;
    }

}
