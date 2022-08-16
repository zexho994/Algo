package 动态规划;

/**
 * @author Zexho
 * @date 2022/2/22 3:22 PM
 */
public class WaysToStep {


    public int waysToStep(int n) {
        int[] cache = new int[3];
        cache[0] = 1;
        cache[1] = 2;
        cache[2] = 4;
        for (int i = 3; i < n; i++) {
            cache[i % 3] = (((cache[i % 3] + cache[(i + 1) % 3]) % 1000000007 + cache[(i + 2) % 3])) % 1000000007;
        }
        return cache[(n - 1) % 3];
    }

}
