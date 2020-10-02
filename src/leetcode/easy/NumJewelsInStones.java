package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class NumJewelsInStones {
    public int numJewelsInStones(String J, String S) {
        Map<Character, Integer> jmap = new HashMap<>(S.length());
        for (int idx = 0; idx < S.length(); idx++) {
            if (jmap.containsKey(S.charAt(idx))) {
                Integer n = jmap.get(S.charAt(idx));
                jmap.put(S.charAt(idx), n + 1);
                continue;
            }
            jmap.put(S.charAt(idx), 1);
        }
        int sum = 0;
        for (int idx = 0; idx < J.length(); idx++) {
            sum += jmap.getOrDefault(J.charAt(idx), 0);
        }
        return sum;
    }

    public static void main(String[] args) {
        NumJewelsInStones numJewelsInStones = new NumJewelsInStones();
        int res = numJewelsInStones.numJewelsInStones("aA", "AAsdfAa");
        System.out.println(res);
    }
}
