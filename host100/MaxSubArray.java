/**
 * @author : zexho
 * @created : 2022-05-27
**/
public class MaxSubArray{
    public int maxSubArray(int[] nums) {
        int idx = 0, curSize = 0, maxSize = nums[0];
        while(idx < nums.length){
            curSize += nums[idx++];
            maxSize = Math.max(curSize,maxSize);
            if(curSize < 0){
                curSize = 0;
            }
        }
        return maxSize;
    }
}
