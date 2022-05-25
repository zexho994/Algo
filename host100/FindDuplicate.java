/**
 * @author : zexho
 * @created : 2022-05-25
**/
public class FindDuplicate{
    public int findDuplicate(int[] nums) {
        int left = 1,right = nums.length,mid = 0;
        while(left <= right){
            mid = (right+left)/2;
            int count = 0;
            for(int i = 0; i < nums.length; i++){
                if(nums[i] <= mid){
                    count++;
                }
            }
            if(count <= mid){
                if(left == right) return mid;
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return mid;
    }
}
