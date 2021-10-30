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

    /**
     * 解法二：将 word 转换成二进制,
     * - abd -> 1011
     * - acd -> 1101
     * - aacc -> 0101
     * <p>
     * 判断两个单词是否有相同字符, 将对对应的二进制 & 后是否为0即可判断出来
     */
    public int maxProduct2(String[] words) {
        int[] arr = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            for (char ch : words[i].toCharArray()) {
                arr[i] |= 1 << (ch - 'a');
            }
        }

        int maxSize = 0, size;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] & arr[j]) == 0 && (size = words[i].length() * words[j].length()) > maxSize) {
                    maxSize = size;
                }
            }
        }

        return maxSize;
    }


}
