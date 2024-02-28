public class MinSubArrayLen {
    public int minSubArrayLen(int target, int[] nums) {

        int left =0, right =0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        while(right <= nums.length){
            if(sum < target){
                if(right < nums.length){
                    sum += nums[right++];
                }else{
                    break;
                }
            }else if (sum >= target){
                minLen = Math.min(right - left,minLen);
                sum -= nums[left++];
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

}
