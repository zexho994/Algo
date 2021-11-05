package 专项突破.字符串.回文;

/**
 * @author Zexho
 * @date 2021/11/4 6:39 下午
 */
public class IsPalindrome {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (right > left && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left++))
                    != Character.toLowerCase(s.charAt(right--))) {
                return false;
            }
        }
        return true;
    }
}
