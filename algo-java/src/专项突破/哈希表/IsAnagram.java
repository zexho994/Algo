package 专项突破.哈希表;

import java.util.HashMap;
import java.util.Map;

/**
 * 有效的变位词
 *
 * @author Zexho
 * @date 2021/11/9 5:07 下午
 */
public class IsAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.equals(t) || s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> mapS = new HashMap<>(s.length());
        for (char ch : s.toCharArray()) {
            mapS.put(ch, mapS.getOrDefault(ch, 0) + 1);
        }
        int count;
        for (char ch : t.toCharArray()) {
            if ((count = mapS.getOrDefault(ch, 0)) == 0) {
                return false;
            }
            mapS.put(ch, count - 1);
        }
        return true;
    }
}
