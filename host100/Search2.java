/**
 * @author : zexho
 * @created : 2022-05-22
**/
public class Search2{
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while(left <= right){
            int mid = (left + right)/2;
            if(nums[mid] == target) {
                return mid;
            }
            if(nums[mid] >= nums[0]){
                if(target >= nums[0] && nums[mid] > target){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            } else {
                if(target < nums[0] && nums[mid] < target ){
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

}
