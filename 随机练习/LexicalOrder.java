import java.util.ArrayList;
import java.util.List;

/**
 * @author Zexho
 * @date 2022/4/19 8:47 AM
 */
public class LexicalOrder {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<Integer>();
        dfs(ans, 0, 1, n);
        return ans;
    }

    public void dfs(List<Integer> ans, int num, int startIdx, int maxNum) {
        num *= 10;
        if (num > maxNum) return;

        for (int i = startIdx; i < 10; i++) {
            int s = num + i;
            if (s > maxNum) {
                return;
            }
            ans.add(s);
            dfs(ans, s, 0, maxNum);
        }
    }

}
