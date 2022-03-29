import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Zexho
 * @date 2022/3/29 11:16 PM
 */
public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        return isContains(s, set);
    }

    private boolean isContains(String s, Set<String> set) {
        if ("".equals(s)) {
            return true;
        }
        return set.stream().anyMatch(str -> {
            if (s.contains(str)) {
                int i = s.indexOf(str);
                String leftPart = s.substring(0, i);
                String rightPart = s.substring(i + str.length());
                if (isContains(leftPart, set)) {
                    return isContains(rightPart, set);
                }
            }
            return false;
        });
    }


}
