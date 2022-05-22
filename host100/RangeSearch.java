/**
 * @author : zexho
 * @created : 2022-05-22
**/
public class RangeSearch{
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0){
            return new int[] {-1,-1};
        }
        int left = 0;
        int right = nums.length - 1;

        while (left < right){
            int mid = (left + right) / 2;
            if(nums[mid] >= target){
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        if (nums[right] != target) {
            return new int[] {-1,-1};
        }
        int L = right;

        left = 0;
        right = nums.length - 1;
        while (left < right){
            int mid = (left + right + 1) / 2;
            if(nums[mid] <= target){
                left = mid;
            }else {
                right = mid - 1;
            }
        }
        return new int[] {L,right};
    }

}
