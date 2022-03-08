import java.util.Arrays;

/**
 * @author Zexho
 * @date 2022/3/8 12:40 PM
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int l = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                if (++l > nums.length / 2) {
                    return nums[i];
                }
            }
            l = 1;
        }

        return 0;
    }
}
