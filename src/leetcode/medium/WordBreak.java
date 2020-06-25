package leetcode.medium;

import java.util.LinkedList;
import java.util.List;

/**
 * 139. 单词拆分
 * @Author: 994
 * @Date: 2020/6/25 11:06
 */
public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        if(s == null || wordDict == null || wordDict.size() == 0){
            return false;
        }
        List<String> dict = new LinkedList<>();
        return dp(0,1,s,wordDict,dict);
    }

    private boolean dp(int pre, int last, String s, List<String> wordDict,List<String> dict) {
        for(int l = last ; l <= s.length() ; l++) {
            String substring = s.substring(pre, l);
            String ss = s.substring(l,s.length()+1);
            if (wordDict.contains(substring) && ! dict.contains(ss)){
                if (l == s.length()) {
                    return true;
                }
                if(dp(l, l + 1, s, wordDict,dict) != false){
                    return true;
                }else{
                    dict.add(ss);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "sssssss";
        WordBreak wordBreak = new WordBreak();
        List<String> list = new LinkedList<>();
        list.add("ssss");
        list.add("sss");
        boolean res = wordBreak.wordBreak(s, list);
        System.out.println(res);
    }
}
