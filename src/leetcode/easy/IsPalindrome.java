package leetcode.easy;

/**
 * 9. 回文数
 * @Author: 994
 * @Date: 2020/6/10 13:08
 */
public class IsPalindrome {
    public boolean isPalindrome(int x){
        String s = String.valueOf(x);
        int l = 0;
        int r = s.length() - 1;
        while (l < r){
            if(s.charAt(l++) != s.charAt(r--)){
                return false;
            }
        }
        return true;
    }
}
