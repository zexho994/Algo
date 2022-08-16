package 专项突破.数组;

/**
 * @author Zexho
 * @date 2021/11/3 8:50 上午
 */
public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int pre = sum;
            sum += nums[i];
            if (pre + sum == total) {
                return i;
            }
        }
        return total == 0 ? nums.length - 1 : -1;
    }
}
