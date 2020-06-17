package leetcode.medium;

/**
 * 1014. 最佳观光组合
 * @Author: 994
 * @Date: 2020/6/17 11:02
 */
public class MaxScoreSightseeingPair {
    public int maxScoreSightseeingPair(int[] A) {
        if(A == null){
            return 0;
        }
        int[] ans = new int[A.length];
        ans[0] = A[0];
        int max = 0;
        for(int i = 1 ; i < ans.length ; i++){
            int r = A[i] + ans[i - 1] - 1;
            if(r > max){
                max = r;
            }
            ans[i] = Math.max(ans[i - 1] - 1,A[i]);
        }
        return max;
    }
}
