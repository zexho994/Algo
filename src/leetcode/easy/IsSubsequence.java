package leetcode.easy;

/**
 * @description: 392. 判断子序列
 * @author: zexho
 * @created: 2020/07/27 08:35
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) {
            return true;
        }
        String st = s.substring(0,1);
        for(int i = 0 ; i < t.length() ; i++){
            String tt = t.substring(i,i+1);
            if(st.equals(tt)){
                return isSubsequence(s.substring(1,s.length()),t.substring(i,t.length()));
            }
        }
        return false;
    }
}
