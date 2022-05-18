import java.util.HashSet;
import java.util.Set;

/**
 * @author : zexho
 * @created : 2022-05-16
 **/
class LengthOfLongestSubstring2 {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLen = 0;
        Set<Character> charSet = new HashSet<>();
        while (right < s.length()) {
            if (charSet.add(s.charAt(right))) {
                maxLen = Math.max(maxLen, right - left + 1);
            } else {
                while (charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left++));
                }
                charSet.add(s.charAt(right));
            }
            right++;
        }
        return maxLen;
    }
}
