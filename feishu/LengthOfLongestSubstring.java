import java.util.HashMap;
import java.util.Map;

/**
 * @author Zexho
 * @date 2022/3/26 11:17 PM
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || "".equals(s)) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>(s.length());
        int maxLen = 1, curLen = 1;
        map.put(s.charAt(0), 1);
        for (int i = 1; i < s.length(); i++) {
            curLen = (map.containsKey(s.charAt(i)) ? Math.min(curLen, i - map.get(s.charAt(i))) : curLen) + 1;
            maxLen = Math.max(curLen, maxLen);
            map.put(s.charAt(i), i + 1);
        }
        return maxLen;
    }
}
