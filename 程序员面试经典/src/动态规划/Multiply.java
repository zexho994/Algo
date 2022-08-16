package 动态规划;

/**
 * @author Zexho
 * @date 2022/2/23 2:38 PM
 */
public class Multiply {

    public int multiply(int A, int B) {
        if (B > A) {
            int t = A;
            A = B;
            B = t;
        }
        int[] cache = new int[(B >> 1) + 1];
        return process(A, B >> 1, cache) + cache[B >> 1] + (B % 2 == 0 ? 0 : A);
    }

    private int process(int a, int b, int[] cache) {
        if (b == 0) return 0;
        if (cache[b] != 0) return cache[b];
        cache[b] = process(a, b >> 1, cache) + cache[b >> 1] + (b % 2 == 0 ? 0 : a);
        return cache[b];
    }

}
