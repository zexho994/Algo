package 专项突破.栈;

import java.util.Stack;

/**
 * @author Zexho
 * @date 2021/12/16 2:55 PM
 */
public class LargestRectangleArea {

    /**
     * 栈保存局部最小值的左端坐标
     *
     * @param heights
     * @return
     */
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxSize = 0, size;
        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            stack.push(i);
            for (int j = stack.size() - 1; j >= 0; j--) {
                int wight = j == 0 ? i + 1 : i - stack.get(j - 1);
                if ((size = heights[stack.get(j)] * wight) > maxSize) {
                    maxSize = size;
                }
            }
        }
        return maxSize;
    }
}
