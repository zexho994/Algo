package 专项突破.字符串.回文;

/**
 * @author Zexho
 * @date 2021/11/5 10:24 上午
 */
public class ValidPalindrome {
    public boolean validPalindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1, 1);
    }

    private boolean isPalindrome(String s, int left, int right, int n) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return n == 1 && (isPalindrome(s, left, right + 1, 0) || isPalindrome(s, left - 1, right, 0));
            }
        }
        return true;
    }
}
