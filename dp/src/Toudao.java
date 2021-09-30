/**
 * @author Zexho
 * @date 2021/9/30 8:55 下午
 */
public class Toudao {

    // arr = 10,3,29,8,1,38
    public int solution(int[] arr) {
        if (arr == null) {
            return 0;
        }
        if (arr.length == 1) {
            return arr[0];
        }
        if (arr.length == 2) {
            return arr[1];
        }

        int[] memo = new int[2];
        memo[0] = arr[0];
        memo[1] = arr[1];
        for (int i = 2; i < arr.length; i++) {
            memo[i % 2] = Math.min(memo[0], memo[1]) + arr[i];
        }
        return Math.min(memo[0], memo[1]);

    }

}
