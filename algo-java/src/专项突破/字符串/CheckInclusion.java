package 专项突破.字符串;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zexho
 * @date 2021/11/3 7:45 下午
 */
public class CheckInclusion {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>(s1.length());
        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int left = 0, right = 0;
        while (right < s2.length()) {
            char c = s2.charAt(right);
            if (map.containsKey(c)) {
                if (map.get(c) == 0) {
                    while (map.get(c) == 0) {
                        map.put(s2.charAt(left), map.get(s2.charAt(left++)) + 1);
                    }
                } else {
                    right++;
                    map.put(c, map.get(c) - 1);
                    if (right - left == s1.length()) {
                        return true;
                    }
                }

            } else {
                while (left < right) {
                    map.put(s2.charAt(left), map.get(s2.charAt(left++)) + 1);
                }
                left = ++right;
            }
        }
        return false;
    }
}
