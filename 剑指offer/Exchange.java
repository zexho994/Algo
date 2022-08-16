/**
 * @author Zexho
 * @date 2022/3/4 8:31 AM
 */
public class Exchange {


    // 7 8 3 6 2
    public int[] exchange(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            while (left < right && nums[left] % 2 != 0) {
                left++;
            }
            while (right > left && nums[right] % 2 == 0) {
                right--;
            }
            int t = nums[left];
            nums[left] = nums[right];
            nums[right] = t;
        }
        return nums;
    }
}
