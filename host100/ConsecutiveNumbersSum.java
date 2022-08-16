/**
 * @author Zexho
 * @date 2022/6/3 17:34
 */
public class ConsecutiveNumbersSum {
    public int consecutiveNumbersSum(int n) {
        int left = 0, right = 0;
        int sum = 0, ans = 0;
        int len = (n + 1) / 2;
        while (right <= len) {
            if (sum == n) {
                ans++;
                sum += ++right;
            } else if (sum < n) {
                sum += ++right;
            } else {
                sum -= ++left;
            }
        }
        return ans;
    }
}
