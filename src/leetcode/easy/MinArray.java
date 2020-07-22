package leetcode.easy;

/**
 * @description: 剑指 Offer 11. 旋转数组的最小数字
 * @author: zexho
 * @created: 2020/07/22 08:34
 */
public class MinArray {
    public int minArray(int[] numbers) {
        if(numbers == null || numbers.length < 1){
            return 0;
        }
        int l = 0;
        int r = numbers.length-1;
        int mid = (r - l)/2 + l;
        return dp(numbers,mid,l,r);
    }

    public int dp(int[] nums,int mid,int l,int r){
        if(mid > mid + 1){
            return mid;
        }

        if(mid >= l){
            int n = (mid - l)/2 + l;
            return dp(nums,n,l,mid-1);
        }else{
            int n = (r - mid)/2 + mid;
            return dp(nums,n,mid+1,r);
        }
    }

}
