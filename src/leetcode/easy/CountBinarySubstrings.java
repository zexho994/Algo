package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 696. 计数二进制子串
 *
 * @author: zexho
 * @created: 2020/08/10 20:03
 */
public class CountBinarySubstrings {
    public int countBinarySubstrings(String s) {
        List<Integer> list = new ArrayList();
        int index = s.charAt(0);
        int n = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == index) {
                n++;
            } else {
                list.add(n);
                n = 1;
                index = s.charAt(i);
            }
        }
        list.add(n);
        // 分别存储所有的子串数量
        n = 0;
        index = 1;
        // 根据子串数量得出所有可能的结果
        while (index < list.size()) {
            n += Math.min(list.get(index), list.get(index - 1));
        }
        return n;
    }
}
