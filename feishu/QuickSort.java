/**
 * @author Zexho
 * @date 2022/4/8 10:10 PM
 */
public class QuickSort {
    public int[] sortArray(int[] nums) {
        quickSort(nums,0,nums.length-1);
        return nums;
    }

    private void quickSort(int[] nums,int left,int right){
        if(left < 0 || right < 0 || left >= right) return;
        int mid = nums[right];
        int l = left,r = right-1;
        while(l <= r){
            if(nums[l] <= mid){
                l++;
            }else{
                swap(nums,l,r);
                r--;
            }
        }
        swap(nums,right,l);
        quickSort(nums,left,l-1);
        quickSort(nums,l+1,right);
    }

    private void swap(int[] nums,int n1,int n2){
        int t = nums[n1];
        nums[n1] = nums[n2];
        nums[n2] = t;
    }
}
