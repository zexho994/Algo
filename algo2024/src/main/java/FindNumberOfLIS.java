import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindNumberOfLIS {
    public int findNumberOfLIS(int[] nums) {
        int maxLen = 1;
        int[] dp = new int[nums.length];
        int[] cnt = new int[nums.length];
        Arrays.fill(dp, 1);
        Arrays.fill(cnt, 1);
        for (int i = 1; i < dp.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] > nums[j] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    maxLen = Math.max(dp[i], maxLen);
                    cnt[i] = cnt[j];
                }else if (nums[i] > nums[j] && dp[j] + 1 == dp[i]){
                    cnt[i] += cnt[j];
                }
            }
        }
        int result = 0;
        for (int i = 0; i < dp.length; i++) {
            if (dp[i] == maxLen) {
                result += cnt[i];
            }
        }
        return result;
    }


    @Nested
    class FindNumberOfLISTest {

        private FindNumberOfLIS solution = new FindNumberOfLIS();

        @Test
        void testNoIncreasingSubsequence() {
            int[] nums1 = {1, 3, 2, 4, 5};
            int expected1 = 2;
            assertEquals(expected1, solution.findNumberOfLIS(nums1), "Should return 1 when there's no continuous increasing subsequence");
        }

        @Test
        void tesSameIncreasingSubsequence() {
            int[] nums1 = {2, 2, 2, 2, 2};
            int expected1 = 5;
            assertEquals(expected1, solution.findNumberOfLIS(nums1), "Should return 1 when there's no continuous increasing subsequence");
        }

        @Test
        void test2() {
            int[] nums2 = {1,2,4,3,5,4,7,2};
            int expected2 = 3;
            assertEquals(expected2, solution.findNumberOfLIS(nums2), "Should return 1 when there's only one continuous increasing subsequence");
        }

        @Test
        void testSingleIncreasingSubsequence() {
            int[] nums2 = {1, 3, 5, 4, 7};
            int expected2 = 1;
            assertEquals(expected2, solution.findNumberOfLIS(nums2), "Should return 1 when there's only one continuous increasing subsequence");
        }

        @Test
        void testMultipleIncreasingSubsequences() {
            int[] nums3 = {1, 3, 5, 4, 7, 9, 8};
            int expected3 = 2;
            assertEquals(expected3, solution.findNumberOfLIS(nums3), "Should return 2 when there are multiple continuous increasing subsequences");
        }

        @Test
        void testAllElementsInIncreasingOrder() {
            int[] nums4 = {1, 3, 5, 7, 9};
            int expected4 = 1;
            assertEquals(expected4, solution.findNumberOfLIS(nums4), "Should return 1 when all elements form a continuous increasing sequence");
        }

        @Test
        void testEmptyArray() {
            int[] nums5 = {};
            int expected5 = 0;
            assertEquals(expected5, solution.findNumberOfLIS(nums5), "Should return 0 for an empty array");
        }
    }




}
