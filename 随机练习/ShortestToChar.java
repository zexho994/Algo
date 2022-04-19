import java.util.Arrays;

/**
 * @author Zexho
 * @date 2022/4/19 9:29 AM
 */
public class ShortestToChar {
    public int[] shortestToChar(String s, char c) {
        int[] ans = new int[s.length()];
        Arrays.fill(ans,s.length()+1);
        int idx = 0;
        while(idx < s.length()){
            if(s.charAt(idx) != c){
                idx++;
                continue;
            }
            for(int left = idx; left >= 0; left--){
                if(ans[left] < idx - left){
                    break;
                }
                ans[left] = idx - left;
            }
            for(int right = idx+1; right < s.length(); right++){
                if(s.charAt(right) == c){
                    idx = right-1;
                    break;
                }
                if(ans[right] < right - idx){
                    break;
                }
                ans[right] = right - idx;
            }
            idx++;
        }
        return ans;
    }
}
