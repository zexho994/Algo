/**
 * @author Zexho
 * @date 2022/3/26 9:00 PM
 */
public class LengthOfLIS {

    public int lengthOfLIS(int[] nums) {
        int[] memo = new int[nums.length + 1];
        memo[0] = Integer.MIN_VALUE;
        int idx = 0;
        for (int num : nums) {
            for (int j = idx; j >= 0; j--) {
                if (num > memo[j]) {
                    if (j == idx) {
                        memo[++idx] = num;
                    } else if (memo[j + 1] > num) {
                        memo[j + 1] = num;
                    }
                    break;
                }
            }
        }
        return idx;
    }

}
