import java.util.HashMap;
import java.util.Map;

/**
 * @author Zexho
 * @date 2022/3/22 3:17 PM
 */
public class Trap {
    public int trap(int[] height) {
        int left = 0, right = 1, max = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>(height.length);
        while (left < height.length) {
            for (; right < height.length; right++) {
                if (height[right] >= height[left]) {
                    break;
                } else if (height[right] > max) {
                    max = height[right];
                    map.put(max, right);
                }
            }
            if (right == height.length && max == 0) {
                return sum;
            }
            right = right == height.length ? map.get(max) : right;
            sum += area(height, left, right);
            left = right++;
            map = new HashMap<>(height.length - left);
            max = 0;
        }
        return sum;
    }

    /**
     * 计算两者之间的面积
     */
    private int area(int[] height, int left, int right) {
        int min = Math.min(height[left], height[right]);
        int maxArea = min * (right - left - 1);
        for (int i = left + 1; i < right; i++) {
            maxArea -= height[i];
        }
        return maxArea;
    }
}
