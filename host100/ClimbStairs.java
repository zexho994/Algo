/**
 * @author : zexho
 * @created : 2022-05-27
**/
public class ClimbStairs{
    public int climbStairs(int n) {
        if(n == 1 || n == 2) return n;
        int n1 = 1, n2 = 2;
        for(int i = 3; i <= n; i++){
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
        return n2;
    }
}
