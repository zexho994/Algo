import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumTotal {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size() + 1][triangle.get(triangle.size() - 1).size()];
        for (int i = 1; i <= triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i - 1).size(); j++) {
                if (j == 0) {
                    dp[i][0] = dp[i - 1][0] + triangle.get(i - 1).get(0);
                } else if (j == i - 1) {
                    dp[i][j] = dp[i - 1][j - 1] + triangle.get(i - 1).get(j);
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1]) + triangle.get(i - 1).get(j);
                }
            }
        }
        return Arrays.stream(dp[dp.length - 1]).min().orElse(Integer.MAX_VALUE);
    }

    @Nested
    class MinimumTotalTest {

        @Test
        public void testMinimumTotal() {
            // 创建一个最小的三角形，期望结果是15
            List<List<Integer>> triangle1 = Arrays.asList(
                    Arrays.asList(9),
                    Arrays.asList(2, 8),
                    Arrays.asList(3, 4, 10),
                    Arrays.asList(2, 7, 4, 8),
                    Arrays.asList(1, 5, 9, 2, 6)
            );
            MinimumTotal minimumTotal = new MinimumTotal();
            int result1 = minimumTotal.minimumTotal(triangle1);
            assertEquals(17, result1, "The minimum total for triangle1 is incorrect.");

            // 创建一个更大的三角形，期望结果是31
            List<List<Integer>> triangle2 = Arrays.asList(
                    Arrays.asList(7),
                    Arrays.asList(3, 8),
                    Arrays.asList(8, 1, 0),
                    Arrays.asList(4, 4, 3, 8),
                    Arrays.asList(1, 8, 0, 8, 2),
                    Arrays.asList(8, 4, 8, 1, 3, 4),
                    Arrays.asList(2, 6, 9, 2, 6, 4, 5)
            );
            MinimumTotal minimumTotal2 = new MinimumTotal();
            int result2 = minimumTotal2.minimumTotal(triangle2);
            assertEquals(17, result2, "The minimum total for triangle2 is incorrect.");

        }

        @Test
        void extracted() {
            // 构建一个[[-1],[-2,-3]]的测试代码
            List<List<Integer>> triangle3 = Arrays.asList(
                    Arrays.asList(-1),
                    Arrays.asList(-2, -3)
            );
            MinimumTotal minimumTotal3 = new MinimumTotal();
            int result3 = minimumTotal3.minimumTotal(triangle3);
            assertEquals(-3, result3, "The minimum total for triangle3 is incorrect.");
        }
    }

}