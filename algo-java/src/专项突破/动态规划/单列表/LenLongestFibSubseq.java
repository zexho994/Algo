package 专项突破.动态规划.单列表;

/**
 * [1,2,3,4,5,6,7]
 * - 不在序列中 memo[i][0]
 * - 序列首位 memo[i][1] = n
 * - 序列中间 memo[i][2] = memo[i][1] memo[i][2]
 * <p>
 * arr[n]
 * f(x) = Max(1,f(x-1)+1,f(x-1))
 *
 * @author Zexho
 * @date 2021/11/16 2:24 下午
 */
public class LenLongestFibSubseq {
    public int lenLongestFibSubseq(int[] arr) {
        return 0;
    }
}
