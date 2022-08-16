/**
 * @author Zexho
 * @date 2022/3/31 7:23 PM
 */
public class Port {

    public int count(int size) {
        if (size % 2 != 0) {
            return 0;
        }
        return dp(0, 0);
    }

    private int dp(int idx, int size) {
        if (idx == -1) {
            idx = 10;
        } else if (idx == 11) {
            idx = 0;
        }
        if (size == 1) {
            return idx == 10 || idx == 1 ? 1 : 0;
        }
        return dp(idx - 1, size - 1) + dp(idx + 1, size - 1);
    }

}
