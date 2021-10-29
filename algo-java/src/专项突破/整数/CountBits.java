package 专项突破.整数;

/**
 * @author Zexho
 * @date 2021/10/27 4:20 下午
 */
public class CountBits {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        int mark = 1, idx = 1;
        while (idx <= n) {
            ans[idx] = ans[idx - mark] + 1;
            idx++;
            if (idx == mark * 2) {
                mark = idx;
            }
        }
        return ans;
    }

}
