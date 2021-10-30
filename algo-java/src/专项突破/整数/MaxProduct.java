package 专项突破.整数;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zexho
 * @date 2021/10/30 9:24 上午
 */
public class MaxProduct {

    public int maxProduct(String[] words) {
        Map<Integer, Map<Character, Boolean>> map = new HashMap<>(words.length);
        for (int i = 0; i < words.length; i++) {
            Map<Character, Boolean> memoMap = new HashMap<>(words[i].length());
            char[] ch = words[i].toCharArray();
            for (char c : ch) {
                memoMap.put(c, true);
            }
            map.put(i, memoMap);
        }

        int maxSize = 0;
        for (int i = 0; i < words.length - 1; i++) {
            Map<Character, Boolean> mapI = map.get(i);
            for (int j = i; j < words.length; j++) {
                Map<Character, Boolean> mapJ = map.get(j);
                if (mapI.entrySet().stream().noneMatch(e -> mapJ.containsKey(e.getKey()))) {
                    maxSize = Math.max(words[i].length() * words[j].length(), maxSize);
                }
            }
        }

        return maxSize;
    }

}
