package leetcode.easy;

import java.util.Arrays;

/**
 * @Author: 994
 * @Date: 2020/6/23 20:42
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();
        int lenA = charsA.length - 1;
        int lenB = charsB.length - 1;
        StringBuilder sb = new StringBuilder();
        int add = 0;
        int res;
        while (true){
            if(lenA >= 0 && lenB >= 0){
                res = ((int)charsA[lenA--] + (int)charsB[lenB--]) - '0'*2;
            }else if(lenA >= 0){
                res = charsA[lenA--] - '0';
            }else if(lenB >= 0){
                res = charsB[lenB--] - '0';
            }else{ //all less than zero
                if(add == 1){
                    sb.append(1);
                }
                break;
            }
            sb.append((add + res) % 2);
            if(add+res>1){
                add = 1;
            }else{
                add = 0;
            }
        }
        return sb.reverse().toString();
    }
}
