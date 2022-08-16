import java.util.HashMap;
import java.util.Map;

/**
 * @author : zexho
 * @created : 2022-05-24
**/
public class NumberOfSubarrays{
    public int numberOfSubarrays(int[] nums, int k) {
        int ans = 0;
        Map<Integer,Integer> memo = new HashMap<Integer,Integer>();
        memo.put(0,1);
        int pre = 0;
        for(int i = 0; i < nums.length; i++){
            pre += nums[i] % 2;
            ans += memo.getOrDefault(pre - k,0);
            memo.put(pre,memo.getOrDefault(pre,0)+1);
        }
        return ans;
    }
}
