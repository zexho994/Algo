package cvte;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SearchNumsTest {

    @Test
    void solution() {
        SearchNums sn = new SearchNums();
        List<List<Integer>> ans = sn.solution(new int[]{3, 5, 7, 9}, 9);
        Assertions.assertNotNull(ans);
        Assertions.assertEquals(2, ans.size());

        List<List<Integer>> ans1 = sn.solution(new int[]{2, 3, 6}, 6);
        Assertions.assertNotNull(ans1);
        Assertions.assertEquals(3, ans1.size());
    }
}