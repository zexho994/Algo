package 专项突破.回溯;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 分割回文串
 * 方法二：
 * 利用map保存重复回文串,减少重复判断字符串的步骤
 * step1: 当出现一个子回文串的时候，保存改子回文串的其实位置结束位置到Map<int,int>中。
 * step2: 当遍历到某个位置idx时候，需要知道该位置所有后续字符串，可以通过map查找 => map.get(idx) -> {end1,end2, ...}
 *
 * @author Zexho
 * @date 2021/11/12 5:10 下午
 */
public class Partition2 {
    public String[][] partition(String s) {
        List<List<String>> list = new LinkedList<>();
        Map<Integer, List<Integer>> memo = new HashMap<>();
        loop(list, new LinkedList<>(), memo, s, 0);

        return copyToArray(list);
    }

    private void loop(List<List<String>> res, LinkedList<String> sub, Map<Integer, List<Integer>> memo, String str, int idx) {
        if (idx == str.length()) {
            res.add(new LinkedList<>(sub));
            return;
        }
        if (memo.containsKey(idx)) {


            return;
        }

        for (int i = idx; i < str.length(); i++) {
            if (isPalindrome(str, idx, i)) {
                sub.add(str.substring(idx, i + 1));
                loop(res, sub, memo, str, i + 1);
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
