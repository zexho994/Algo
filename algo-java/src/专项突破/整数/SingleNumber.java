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
}
