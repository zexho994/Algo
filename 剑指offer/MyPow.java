/**
 * @author Zexho
 * @date 2022/3/1 5:28 PM
 */
public class MyPow {

    // 2^10 => 2^5 * 2^5
    // 2^5 = 2^2 * 2^2 * 2
    public double myPow(double x, int n) {
        if (n == 0) {
            if (x > 0) {
                return 1;
            } else if (x < 0) {
                return -1;
            } else {
                return 0;
            }
        }
        return n > 0 ? pow(x, n) : 1 / pow(x, n);
    }

    private double pow(double x, int n) {
        if (n == 1 || n == -1) {
            return x;
        }
        double s = pow(x, n / 2);
        return s * s * (n % 2 != 0 ? x : 1);
    }
}
