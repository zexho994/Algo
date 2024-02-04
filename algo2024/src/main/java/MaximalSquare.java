import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        int max = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == '0'){
                    continue;
                }
                dp[i][j] = 1;

                int m = i-1,n = j-1;
                while(m >= 0 && n >= 0){
                    if (dp[m][n] > 0 && dp[i-1][j] >= (i-m)*(i-m)
                            && dp[i][j-1] >= (i-m)*(i-m)){
                        dp[i][j] = (i-m+1)*(i-m+1);
                        m--;
                        n--;
                    }else{
                        break;
                    }
                }
                max = Math.max(max,dp[i][j]);
            }
        }
        return max;
    }

    @Nested
    class UT{

        @Test
        void test(){

            MaximalSquare maximalSquare = new MaximalSquare();
            int result = maximalSquare.maximalSquare(new char[][] {
                    {'1', '0', '1', '0', '0'},
                    {'1', '0', '1', '1', '1'},
                    {'1', '1', '1', '1', '1'},
                    {'1', '0', '0', '1', '0'}
            });

            Assertions.assertEquals(4,result);
        }
    }
}
