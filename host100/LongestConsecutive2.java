import java.util.HashSet;
import java.util.Set;

/**
 * @author : zexho
 * @created : 2022-05-29
**/
public class LongestConsecutive2{
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for(int n : nums){
            set.add(n);
        }
        int maxLen = 0;
        for(int i = 0; i < nums.length; i++){
            int len = 1; 
            int n = nums[i];
            if(set.contains(n-1)){
                continue;
            }
            while(set.contains(++n)){
                len++;
            }
            maxLen = Math.max(len,maxLen);
        }
        return maxLen;
    }
}
