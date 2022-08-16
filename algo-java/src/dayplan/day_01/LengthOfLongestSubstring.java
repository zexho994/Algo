package dayplan.day_01;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Zexho
 * @date 2021/11/29 9:38 下午
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> memo = new HashSet<>();
        int startIdx = 0, maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            maxLen = Math.max(maxLen, (i - startIdx));
            char ch = s.charAt(i);
            if (!memo.add(ch)) {
                while (memo.contains(ch)) {
                    memo.remove(s.charAt(startIdx++));
                }
                memo.add(ch);
            }
        }
        return maxLen == 0 ? s.length() : maxLen;
    }
}
