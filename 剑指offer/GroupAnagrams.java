import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Zexho
 * @date 2022/3/11 9:41 PM
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>(strs.length);
        for (String str : strs) {
            int[] arr = new int[26];
            for (char ch : str.toCharArray()) {
                arr[ch - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                sb.append('a' + i);
                sb.append(arr[i]);
            }
            List<String> subList = map.getOrDefault(sb.toString(), new ArrayList<>());
            subList.add(str);
            map.put(sb.toString(), subList);
        }
        return new ArrayList<>(map.values());
    }
}
