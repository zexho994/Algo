import java.util.ArrayList;
import java.util.List;

/**
 * @author Zexho
 * @date 2022/3/11 9:15 PM
 */
public class GenerateParenthesis {

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate(n, n, list, "");
        return list;
    }

    private void generate(int left, int right, List<String> list, String str) {
        if (left < 0) {
            return;
        }
        if (right == 0) {
            list.add(str);
            return;
        }
        if (left == right) {
            generate(left - 1, right, list, str + "(");
        } else {
            generate(left, right - 1, list, str + ")");
            generate(left - 1, right, list, str + "(");
        }
    }

}
