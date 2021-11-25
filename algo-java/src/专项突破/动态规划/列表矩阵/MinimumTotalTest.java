package 专项突破.动态规划.列表矩阵;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class MinimumTotalTest {

    @Test
    void minimumTotal() {
        MinimumTotal minimumTotal = new MinimumTotal();
        List<List<Integer>> listList = new ArrayList<>();
        listList.add(Arrays.asList(2));
        listList.add(Arrays.asList(3, 4));
        listList.add(Arrays.asList(6, 5, 7));
        listList.add(Arrays.asList(4, 1, 8, 3));
        minimumTotal.minimumTotal(listList);
    }

    @Test
    void minimumTotal3() {
        MinimumTotal minimumTotal = new MinimumTotal();
        List<List<Integer>> listList = new LinkedList<>();
        listList.add(Arrays.asList(2));
        listList.add(Arrays.asList(3, 4));
        listList.add(Arrays.asList(6, 5, 7));
        listList.add(Arrays.asList(4, 1, 8, 3));
        minimumTotal.minimumTotal3(listList);
    }
}