package 专项突破.回溯;

import org.junit.jupiter.api.Test;

import java.util.List;

class CombinationSumTest {

    @Test
    void combinationSum() {
        CombinationSum combinationSum = new CombinationSum();
        List<List<Integer>> lists = combinationSum.combinationSum(new int[]{2, 3, 6, 7}, 7);
        assert lists.size() == 2;
    }
}