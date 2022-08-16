package 专项突破.二分;

/**
 * @author Zexho
 * @date 2021/12/28 10:30 AM
 */
public class MySqrt {
    public int mySqrt(int x) {
        int left = 0, right = (int) Math.sqrt(Integer.MAX_VALUE);
        while (left <= right) {
            int m = (right - left) / 2 + left;
            int n = m * m;
            if (n == x) {
                return m;
            }
            if (n > x) {
                right = m - 1;
            } else {
                left = m + 1;
            }
        }
        return right;
    }
}
