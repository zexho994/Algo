/**
 * @author : zexho
 * @created : 2022-05-25
**/
public class SortedSquares{
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int negIdx = -1,posIdx = 0,idx = 0;
        for(int i = 0; i < nums.length && nums[i] < 0; i++){
            negIdx = i;
            posIdx = i + 1;
        }
        
        while(idx < nums.length){
            int n1 = negIdx >= 0 ? nums[negIdx] * nums[negIdx] : Integer.MAX_VALUE; 
            int n2 = posIdx < nums.length ? nums[posIdx] * nums[posIdx] : Integer.MAX_VALUE;
            if(n1 < n2){
                ans[idx++] = n1;
                negIdx--;
            }else{
                ans[idx++] = n2;
                posIdx++;
            }
        }

        return ans;
    }
}
