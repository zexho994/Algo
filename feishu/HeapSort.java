/**
 * @author Zexho
 * @date 2022/4/10 8:12 PM
 */
public class HeapSort {
    public int[] sortArray(int[] nums) {
        buildHead(nums);
        int[] ans = new int[nums.length];
        int len = nums.length-1;
        int idx = 0;
        while(len >= 0){
            ans[idx] = pop(nums,len);
            idx++;
            len--;
        }
        return ans;
    }

    private void buildHead(int[] nums){
        for(int i = 1; i < nums.length;i++){
            int idx = i;
            int parent = (i-1)/2;
            while(idx != 0){
                if(nums[idx] > nums[parent]){
                    break;
                }
                swap(nums,idx,parent);
                idx = parent;
                parent = (idx - 1)/2;
            }
        }
    }

    private int pop(int[] arr,int len){
        int n = arr[0];
        arr[0] = arr[len];
        arr[len] = Integer.MAX_VALUE;
        int idx = 0;
        while(idx < len ){
            int left = (idx+1)*2 - 1;
            int right = (idx+1)*2;
            if(right < len && arr[right] <= arr[left]){
                swap(arr,idx,right);
                idx = right;
            } else if(left < len && arr[idx] > arr[left]){
                swap(arr,idx,left);
                idx = left;
            }else{
                break;
            }
        }
        return n;
    }

    private void swap(int[] arr,int p,int q){
        int t = arr[p];
        arr[p] = arr[q];
        arr[q] = t;
    }

}
