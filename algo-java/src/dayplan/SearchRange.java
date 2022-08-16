package dayplan;

/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 *
 * @author Zexho
 * @date 2021/9/16 11:58 下午
 */
public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }
        //1. 找到目标值
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = (right - left) >> 1 + left;
            if (nums[mid] == target) {
                break;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            mid = -1;
        }
        if (mid == -1) {
            return new int[]{-1, -1};
        }
        //2. 找到上下边界
        left = mid - 1;
        while (left >= 0 && nums[left] == target) {
            left--;
        }
        right = mid + 1;
        while (right < nums.length && nums[right] == target) {
            right++;
        }
        return new int[]{left + 1, mid - 1};
    }
}
