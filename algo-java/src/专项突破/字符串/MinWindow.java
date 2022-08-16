package 专项突破.字符串;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zexho
 * @date 2021/11/4 11:39 上午
 */
public class MinWindow {

    /**
     * @param s 长字符串
     * @param t 短字符串
     * @return 最短长度的字符串
     */
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        if (t.length() == 0) {
            return s;
        }
        Map<Character, Integer> map = new HashMap<>(t.length());
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }
        int n = t.length(), left = 0, right = 0, minLen = s.length() + 1, markLeft = -1;
        while (right < s.length()) {
            char rch = s.charAt(right++);
            if (!map.containsKey(rch)) {
                continue;
            }
            if (map.get(rch) < 0) {
                n--;
            }
            map.put(rch, map.get(rch) + 1);
            char lch;
            while (!map.containsKey((lch = s.charAt(left))) || map.get(lch) > 0) {
                left++;
                if (map.containsKey(lch)) {
                    map.put(lch, map.get(lch) - 1);
                }
            }
            if (n == 0 && right - left < minLen) {
                minLen = right - left;
                markLeft = left;
            }
        }

        if (markLeft == -1) {
            return "";
        }
        return s.substring(markLeft, markLeft + minLen);
    }
}
