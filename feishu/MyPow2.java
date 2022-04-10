/**
 * @author Zexho
 * @date 2022/4/10 9:04 PM
 */
public class MyPow2 {

    public double myPow(double x, int n) {
        if (n == 0) {
            if (x == 0) return 0.0;
            if (x > 0.0) return 1.0;
            if (x < 0.0) return -1.0;
        }

        boolean isNegative = n <= 0;
        n = isNegative ? -n : n;
        double ans = x;
        while (--n > 0) {
            ans *= x;
        }

        return isNegative ? 1.0 / ans : ans;
    }

}
