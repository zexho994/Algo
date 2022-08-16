/**
 * @author : zexho
 * @created : 2022-05-17
**/
public class LongestPalindrome{

    public String longestPalindrome(String s) {
        String str = "";
        for(int i = 0; i < s.length() && s.length() - i > str.length()/2; i++){
            String str1 = isPalindrome(s,i,i,str.length());
            if(str1.length() > str.length()){
                str = str1;
            }
            String str2 = isPalindrome(s,i,i+1,str.length());
            if(str2.length() > str.length()){
                str = str2;
            }
        }
        return str;
    }

    public String isPalindrome(String s,int idx,int idx2,int maxLen){
        int left = idx,right = idx2;
        String str = "";
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            if(right - left + 1 > maxLen){
                str = s.substring(left,right+1);
            }
            left--;
            right++;
        }
        return str;
    }

}

