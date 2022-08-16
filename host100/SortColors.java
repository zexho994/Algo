/**
 * @author : zexho
 * @created : 2022-05-28
**/
public class SortColors{
    public void sortColors(int[] nums) {
        int left = 0, idx = 0, right = nums.length-1;
        while(idx <= right){
            if (nums[idx] == 0){
                swap(nums,idx++,left++);
            } else if (nums[idx] == 2){
                swap(nums,idx,right--);
            }else {
                idx++;
            }
        }
    }

    public void swap(int[] nums,int p1,int p2){
        int n = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = n;
    }
}
