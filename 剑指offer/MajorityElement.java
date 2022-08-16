import java.util.Arrays;

/**
 * @author Zexho
 * @date 2022/3/8 12:40 PM
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
