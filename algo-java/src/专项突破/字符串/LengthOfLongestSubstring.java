package 专项突破.字符串;

/**
 * @author Zexho
 * @date 2021/11/4 11:03 上午
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int[] arr = new int[255];
        int left = 0, maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
            if (arr[s.charAt(i)] != 1) {
                while (arr[s.charAt(i)] != 1) {
                    arr[s.charAt(left++)]--;
                }
            } else {
                maxLen = Math.max(i - left, maxLen);
            }
        }
        return maxLen + 1;
    }
}
