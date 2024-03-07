import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindDuplicate {

    public int findDuplicate(int[] nums) {
        int fast = 0, slow = 0;
        while ((nums[fast] == nums[slow] && fast == slow) || nums[fast] != nums[slow]) {
            fast = (fast + 2) % nums.length;
            slow = (slow + 1) % nums.length;
        }
        return nums[fast];
    }


    @Nested
    class FindDuplicateTest {

        FindDuplicate finder = new FindDuplicate();

        @Test
        public void testFindDuplicate() {
            // 测试样例1: 包含重复元素的数组
            int[] nums1 = {1,3,4,2,2};
            int expected1 = 2;
            assertEquals(expected1, finder.findDuplicate(nums1));
        }

        @Test
        public void test2() {

            // 测试样例3: 空数组
            int[] nums3 = {};
            int expected3 = -1; // 假设空数组时返回-1
            assertEquals(expected3, finder.findDuplicate(nums3));

            // 测试样例4: 只有一个元素的数组
            int[] nums4 = {1};
            int expected4 = -1; // 假设只有一个元素时返回-1
            assertEquals(expected4, finder.findDuplicate(nums4));
        }

        @Test
        public void test3() {
            // 测试样例2: 无重复元素的数组
            int[] nums2 = {3,1,3,4,2};
            int expected2 = 3; // 假设找不到重复元素时返回-1
            assertEquals(expected2, finder.findDuplicate(nums2));
        }
    }
}
