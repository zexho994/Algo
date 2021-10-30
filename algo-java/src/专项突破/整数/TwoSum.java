package 专项突破.整数;

/**
 * @author Zexho
 * @date 2021/10/30 10:39 上午
 */
public class TwoSum {

    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                return new int[]{left, right};
            }
        }
        return null;
    }

}
