import java.util.HashMap;
import java.util.Map;

/**
 * @author Zexho
 * @date 2022/2/10 11:34 AM
 */
public class CheckPermutation {
    public boolean checkPermutation(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>(32);
        for (Character s : s1.toCharArray()) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.compute(s, (k, v) -> v + 1);
            }
        }

        for (Character s : s2.toCharArray()) {
            if (!map.containsKey(s)) {
                return false;
            }
            if (map.get(s) == 1) {
                map.remove(s);
            } else {
                map.compute(s, (k, v) -> v - 1);
            }
        }

        return map.size() == 0;
    }
}
