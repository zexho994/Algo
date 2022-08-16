/**
 * @author Zexho
 * @date 2022/3/30 11:31 PM
 */
public class MaxProduct {

    public int maxProduct(int[] nums) {
        int[][] arr = new int[2][nums.length];
        int max = arr[0][0] = arr[1][0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            arr[0][i] = Math.max(nums[i], nums[i] * arr[nums[i] < 0 ? 1 : 0][i - 1]);
            arr[1][i] = Math.min(nums[i], nums[i] * arr[nums[i] < 0 ? 0 : 1][i - 1]);
            max = Math.max(max, arr[0][i]);
        }
        return max;
    }

}
