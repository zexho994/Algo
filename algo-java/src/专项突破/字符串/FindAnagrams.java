package 专项突破.字符串;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 字符串中的所有变位词
 *
 * @author Zexho
 * @date 2021/11/4 10:51 上午
 */
public class FindAnagrams {

    public List<Integer> findAnagrams(String s2, String s1) {
        List<Integer> ans = new ArrayList<>();
        if (s1.length() > s2.length()) {
            return ans;
        }
        int[] arr = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
            arr[s2.charAt(i) - 'a']--;
        }
        int left = 0, right = s1.length();
        if (Arrays.stream(arr).allMatch(e -> e == 0)) {
            ans.add(left);
        }
        while (right < s2.length()) {
            arr[s2.charAt(left++) - 'a']++;
            arr[s2.charAt(right++) - 'a']--;
            if (Arrays.stream(arr).allMatch(e -> e == 0)) {
                ans.add(left);
            }
        }
        return ans;
    }

}
