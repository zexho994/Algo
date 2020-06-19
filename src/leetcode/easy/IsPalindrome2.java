package leetcode.easy;

/**
 * 125. 验证回文串
 * @Author: 994
 * @Date: 2020/6/19 15:09
 */
public class IsPalindrome2 {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right){
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(left < right){
                if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsPalindrome2 isPalindrome2 = new IsPalindrome2();
        boolean palindrome = isPalindrome2.isPalindrome("A man, a plan, a canal: Panama");
//        boolean palindrome = isPalindrome2.isPalindrome("0P");
        System.out.println(palindrome);
    }
}
