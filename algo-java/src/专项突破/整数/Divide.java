package 专项突破.整数;

/**
 * @author Zexho
 * @date 2021/10/16 10:56 上午
 */
public class Divide {
    public int divide(int a, int b) {
        if (a == Integer.MIN_VALUE && b == -1) {
            return Integer.MAX_VALUE;
        }

        int flag = 2;
        if (a > 0) {
            flag--;
            a = -a;
        }
        if (b > 0) {
            flag--;
            b = -b;
        }

        int num = 0;
        int div = b;
        while (a >= b) {
            a -= div;
            num++;
        }

        return flag == 1 ? -num : num;
    }
}
