package leetcode.easy;

/**
 * 14. 最长公共前缀
 * @Author: 994
 * @Date: 2020/6/15 00:08
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while (true){
            char c;
            try {
                c = strs[0].charAt(index);
                for(String str : strs){
                    if(str.charAt(index) != c){
                        return sb.toString();
                    }
                }
            }catch (Exception ex){
                return sb.toString();
            }
            sb.append(strs[0].charAt(index));
            index++;
        }
    }
}
