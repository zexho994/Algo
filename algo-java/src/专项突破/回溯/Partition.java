package 专项突破.回溯;

import java.util.LinkedList;
import java.util.List;

/**
 * 分割回文字符串
 * 方法一：暴力法
 *
 * @author Zexho
 * @date 2021/11/12 4:26 下午
 */
public class Partition {
    public String[][] partition(String s) {
        List<List<String>> list = new LinkedList<>();
        loop(list, new LinkedList<>(), s, 0);

        return copyToArray(list);
    }

    private void loop(List<List<String>> res, LinkedList<String> sub, String str, int idx) {
        if (idx == str.length()) {
            res.add(new LinkedList<>(sub));
            return;
        }
        for (int i = idx; i < str.length(); i++) {
            if (isPalindrome(str, idx, i)) {
                sub.add(str.substring(idx, i + 1));
                loop(res, sub, str, i + 1);
                sub.removeLast();
            }
        }
    }

    public boolean isPalindrome(String str, int l, int r) {
        while (l < r) {
            if (str.charAt(l++) != str.charAt(r--)) {
                return false;
            }
        }
        return true;
    }

    private String[][] copyToArray(List<List<String>> list) {
        String[][] resArr = new String[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            List<String> strings = list.get(i);
            String[] subArr = new String[strings.size()];
            for (int j = 0; j < strings.size(); j++) {
                subArr[j] = strings.get(j);
            }
            resArr[i] = subArr;
        }
        return resArr;
    }
}
