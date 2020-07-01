package leetcode.medium;

/**
 * 718. 最长重复子数组
 * @Author: 994
 * @Date: 2020/7/1 14:20
 */
public class FindLength {
    public int findLength(int[] A, int[] B) {
        int[][] dp = new int[A.length+1][B.length+1];
        int max = 0;
        for(int i = B.length - 1; i >= 0 ; i--){
            for(int j = A.length - 1 ; j >= 0;j--){
                if(A[i] == B[j]){
                    dp[j][i] = dp[j+1][i+1]+1;
                    if(dp[j][i] > max){
                        max = dp[j][i];
                    }
                }
            }
        }
        return max;
    }
}
