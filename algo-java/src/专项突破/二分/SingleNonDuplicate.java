package 专项突破.二分;

/**
 * @author Zexho
 * @date 2021/12/13 8:03 下午
 */
public class SingleNonDuplicate {
    public int singleNonDuplicate(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum ^= n;
        }
        return sum;
    }
}
