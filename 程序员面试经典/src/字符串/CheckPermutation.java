package 字符串;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zexho
 * @date 2022/2/10 11:34 AM
 */
public class CheckPermutation {

    // 使用map记录
    public boolean checkPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>(32);
        for (Character s : s1.toCharArray()) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.compute(s, (k, v) -> v + 1);
            }
        }
        for (Character s : s2.toCharArray()) {
            if (!map.containsKey(s) || map.get(s) == 0) {
                return false;
            }
            map.compute(s, (k, v) -> v - 1);
        }
        return true;
    }

    // 使用数组记录
    public boolean checkPermutation2(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] arr = new int[26];
        for (Character c : s1.toCharArray()) {
            arr[c - 'a']++;
        }
        for (Character c : s2.toCharArray()) {
            arr[c - 'a']--;
            if (arr[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
