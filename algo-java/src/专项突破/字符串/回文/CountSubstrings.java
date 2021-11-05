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

    /**
     * 方法二：基于中心向两边扩展
     */

    public int countSubstrings2(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += judge2(s, i, i);
            count += judge2(s, i, i + 1);
        }
        return count;
    }

    public int judge2(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left--) == s.charAt(right++)) {
            count++;
        }
        return count;
    }
}
