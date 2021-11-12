package 专项突破.回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zexho
 * @date 2021/11/12 4:09 下午
 */
public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        loop(ans, "", n, 0, 0);
        return ans;
    }

    public void loop(List<String> ans, String str, int n, int l, int r) {
        if (l == n) {
            if (r == n) {
                ans.add(str);
            } else {
                loop(ans, str + ")", n, l, r + 1);
            }
        } else {
            if (r < l) {
                loop(ans, str + ")", n, l, r + 1);
            }
            loop(ans, str + "(", n, l + 1, r);
        }
    }
}
