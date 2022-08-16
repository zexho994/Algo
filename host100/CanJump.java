/**
 * @author : zexho
 * @created : 2022-05-26
**/
public class CanJump{
    public boolean canJump(int[] nums) {
        int nextStep = nums[0];
        int idx = 0;
        int endIdx = nums.length-1;
        while(idx <= nextStep){
            nextStep = Math.max(nextStep,nums[idx] + idx++);
            if(nextStep >= endIdx){
                return true;
            }
        }
        return false;
    }
}
