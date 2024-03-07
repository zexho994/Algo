import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Jump {
    public int jump(int[] nums) {
        if(nums ==  null || nums.length == 0){
            return 0;
        }
        if (nums[0] >= nums.length) {
            return 1;
        }

        int result = 0;
        int startIdx = 0;
        int maxStep = nums[0];

        while (maxStep < nums.length-1) {
            int partOfMaxStep = maxStep;
            while (startIdx <= partOfMaxStep) {
                maxStep = Math.max(maxStep, startIdx + nums[startIdx]);
                startIdx++;
            }
            result++;
        }

        return result + 1;
    }


    @Nested
    class JumpTest {

        Jump jump = new Jump();
        @Test
        public void testJump() {
            // 测试空数组
            int[] nums1 = new int[]{};
            assertEquals(0, jump.jump(nums1), "空数组应该不需要跳跃");

            // 测试单个元素数组
            int[] nums2 = new int[]{1};
            assertEquals(1, jump.jump(nums2), "单个元素数组只需要一次跳跃");


            // 测试无法跳跃情况
            int[] nums4 = new int[]{3, 2, 1, 0, 4};
            assertEquals(-1, jump.jump(nums4), "数组无法跳跃到终点");

            // 添加其他你认为必要的测试用例
        }

        @Test
        public void testJump2() {
            // 测试连续跳跃情况
            int[] nums3 = new int[]{2, 3, 1, 1, 4};
            assertEquals(2, jump.jump(nums3), "应该需要两次跳跃才能到达最远");
        }
    }

}
