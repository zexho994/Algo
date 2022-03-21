/**
 * @author Zexho
 * @date 2022/3/21 8:30 AM
 */
public class SingleNumber {


    /**
     * 1. hashmap
     * 2. sort
     * 3. %3统计 , log(n)
     *
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < 15; i++) {
            int b = 0;
            for (int num : nums) {
                b += (num >> i) % 2;
            }
            sum += (b % 3) << i;
        }
        return sum;
    }
}
