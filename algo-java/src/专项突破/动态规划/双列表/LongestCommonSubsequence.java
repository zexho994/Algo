package 专项突破.动态规划.双列表;

/**
 * @author Zexho
 * @date 2021/11/22 8:43 上午
 */
public class LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] arr = new int[2][text2.length() + 1];
        for (int i = 0; i < text1.length(); i++) {
            for (int j = 0; j < text2.length(); j++) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    arr[i % 2][j % 2] = arr[(i + 1) % 2][(j + 1) % 2] + 1;
                } else {
                    arr[i % 2][j % 2] = Math.max(arr[i][(j + 1) % 2], arr[(i + 1) % 2][j]);
                }
            }
        }
        return arr[text1.length()][text2.length()];
    }

    /**
     * 内存优化版本，只需要数组两行
     */
    public int longestCommonSubsequence2(String text1, String text2) {
        int[][] arr = new int[2][text2.length() + 1];
        for (int i = 0; i < text1.length(); i++) {
            for (int j = 0; j < text2.length(); j++) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    arr[i % 2][j + 1] = arr[(i + 1) % 2][j] + 1;
                } else {
                    arr[i % 2][j + 1] = Math.max(arr[(i + 1) % 2][j + 1], arr[i % 2][j]);
                }
            }
        }
        return arr[(text1.length() + 1) % 2][text2.length()];
    }

}
