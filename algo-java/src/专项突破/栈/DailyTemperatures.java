package 专项突破.栈;

import java.util.Stack;

/**
 * @author Zexho
 * @date 2021/12/15 9:48 AM
 */
public class DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int pop = stack.pop();
                ans[pop] = i - pop;
            }
            stack.push(i);
        }
        stack.forEach(i -> ans[i] = 0);
        return ans;
    }

}
