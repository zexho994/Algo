import java.util.Arrays;

/**
 * @author : zexho
 * @created : 2022-06-21
**/
public class MajorityElement{
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

}
