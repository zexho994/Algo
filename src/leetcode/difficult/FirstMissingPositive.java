package leetcode.difficult;

/**
 * 41. 缺失的第一个正数
 * @Author: 994
 * @Date: 2020/6/27 20:09
 */
public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        if(nums == null){
            return 0;
        }
        int length = nums.length;
        for(int i = 0 ; i < length ; i++){
            if(nums[i] <= 0){
                nums[i] = length + 1;
            }
        }
        for(int i = 0 ; i < length ; i++){
            int n = Math.abs(nums[i]) - 1;
            if(Math.abs(n) < length){
                nums[n] = nums[n] > 0 ? -nums[n] : nums[n];
            }
        }
        for(int i = 0 ; i < length ; i++){
            if(nums[i] > 0){
                return i + 1;
            }
        }
        return length+1;
    }

    public static void main(String[] args) {
        FirstMissingPositive first = new FirstMissingPositive();
        int i = first.firstMissingPositive(new int[]{3, 4, -1, 1});
        System.out.println(i);

    }
}
