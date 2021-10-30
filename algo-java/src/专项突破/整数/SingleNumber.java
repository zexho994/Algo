package 专项突破.整数;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Zexho
 * @date 2021/10/27 4:47 下午
 */
public class SingleNumber {

    //方法一： 基于hashmap
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> memo = new HashMap<>(nums.length / 3);
        Arrays.stream(nums).forEach(n -> memo.put(n, memo.getOrDefault(n, 0) + 1));
        return memo.entrySet().stream().filter(e -> e.getValue() == 1).findFirst().get().getValue();
    }

    //方法二：位个数计算
    // [7 7 7 5]
    // 5 -> 101
    // 7 -> 111
    // (434) / 3 = 101
    public int singleNumber2(int[] nums) {
        // 计算各个位的个数
        // [3,1,4]
        int[] arr = new int[32];
        for (int num : nums) {
            int n = num;
            for (int j = 0; j < 32 && n != 0; j++) {
                arr[j] += (n & 1);
                n >>= 1;
            }
        }

        // 转换成整数
        int ans = 0, n = 1;
        for (int i = 0; i < 32; i++) {
            ans += n * (arr[i] % 3);
            n *= 2;
        }

        return ans;
    }
}
