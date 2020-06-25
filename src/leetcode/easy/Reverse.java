package leetcode.easy;

/**
 * @Author: 994
 * @Date: 2020/6/23 22:57
 */
public class Reverse {
    public int reverse(int x) {
        int num = 0;
        while(x != 0){
            num = (num*10) + x % 10;
            x /= 10;
            if((num * 10) / 10 != num){
                return 0;
            }
        }
        return num;
    }
}
