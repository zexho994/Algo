/**
 * @author : zexho
 * @created : 2022-05-26
**/
public class UniquePaths{
    public int uniquePaths(int m, int n) {
        int[] memo = new int[n];
        memo[0] = 1;
        for(int row = 0; row < m; row++){
            for(int col = 1; col < n; col++){
                memo[col] = memo[col] + memo[col-1];
            }
        }
        return memo[n-1];
    }
}
