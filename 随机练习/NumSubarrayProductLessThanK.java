
public class NumSubarrayProductLessThanK {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
		int count = 0, prod = 1,left = 0;
		for(int right = 0; right < nums.length; right++){
			prod *= nums[right];
			while(left <= right && prod >= k){
				prod /= nums[left++];
			}
			count += right - left + 1;
		}
		return count;
    }

}
