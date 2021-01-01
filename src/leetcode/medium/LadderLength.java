package leetcode.medium;

import java.util.List;

public class LadderLength {
    private int min = Integer.MAX_VALUE;

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (wordList == null) {
            return 0;
        }
        boolean[] memo = new boolean[wordList.size()];
        dp(wordList, endWord, memo, 0, beginWord);
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public void dp(List<String> wordList, String endWord, boolean[] memo, int curNum, String tmp) {
        if (tmp.equals(endWord)) {
            min = Math.min(min, curNum + 1);
            return;
        }

        for (int i = 0; i < wordList.size(); i++) {
            if (memo[i]) {
                continue;
            }
            if (judge(wordList.get(i), tmp)) {
                memo[i] = true;
                dp(wordList, endWord, memo, curNum + 1, wordList.get(i));
                memo[i] = false;
            }
        }
    }

    // 判断两个字符串是否只有一个字符的差别
    public boolean judge(String str1, String str2) {
        int s = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (s == 1) {
                    return false;
                }
                s++;
            }
        }
        return s == 1;
    }
}
