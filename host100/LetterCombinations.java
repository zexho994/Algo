import java.util.*;

/**
 * @author : zexho
 * @created : 2022-05-18
**/
public class LetterCombinations{

    public static void main(String[] args) {
        LetterCombinations l = new LetterCombinations();
        List<String> list = l.letterCombinations("23");
        System.out.println(list.size());
        list.forEach(System.out::println);
    }

    public char[][] table = new char[][]{
            {'a', 'b', 'c'},
            {'d', 'e', 'f'},
            {'g', 'h', 'i'},
            {'j', 'k', 'l'},
            {'m', 'n', 'o'},
            {'p', 'q', 'r', 's'},
            {'t', 'u', 'v'},
            {'w', 'x', 'y', 'z'}
    };

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if ("".equals(digits)) return ans;
        Set<String> memo = new HashSet<>();
        for (int j = 0; j < table[digits.charAt(0) - '2'].length; j++) {
            ans.add("" + table[digits.charAt(0) - '2'][j]);
        }
        for (int i = 1; i < digits.length(); i++) {
            char ch = digits.charAt(i);
            for (String s : ans) {
                for (int j = 0; j < table[ch - '2'].length; j++) {
                    memo.add(s + table[ch - '2'][j]);
                }
            }
            ans = new ArrayList<>(memo);
            memo = new HashSet<>();
        }
        return ans;
    }
}
