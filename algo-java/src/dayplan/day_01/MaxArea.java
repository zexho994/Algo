package dayplan.day_01;

/**
 * @author Zexho
 * @date 2021/11/29 10:26 下午
 */
public class MaxArea {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, max = 0;
        while (left < right) {
            max = Math.max(max, height[left] < height[right] ? (right - left) * height[left++] : (right - left) * height[right--]);
        }
        return max;
    }
}
