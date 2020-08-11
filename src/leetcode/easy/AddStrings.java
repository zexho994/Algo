package leetcode.easy;

/**
 * @description: 415. 字符串相加
 * @author: zexho
 * @created: 2020/08/03 08:29
 */
public class AddStrings {

    public String addStrings(String num1, String num2) {
        int n1 = num1.length() - 1 , n2 = num2.length() - 1 , add = 0;
        StringBuilder sb = new StringBuilder();
        while (n1 >= 0 || n2 >= 0 || add == 1){
            int s1 = n1 >= 0 ? num1.charAt(n1--) -'a' : 0;
            int s2 = n2 >= 0 ? num2.charAt(n2--) - 'a' : 0;
            int s = s1 + s2 + add;
            if(s > 9){
                add = 1;
                s = s%10;
            }else{
                add = 0;
            }
            sb.append(s);
        }

        return sb.reverse().toString();
    }
}
