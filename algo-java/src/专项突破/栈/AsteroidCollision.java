package 专项突破.栈;

import java.util.Stack;

/**
 * @author Zexho
 * @date 2021/12/14 7:28 PM
 */
public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int ast : asteroids) {
            while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -ast) {
                stack.pop();
            }
            if (!stack.isEmpty() && ast < 0 && -ast == stack.peek()) {
                stack.pop();
            } else if (ast > 0 || stack.isEmpty() || stack.peek() < 0) {
                stack.push(ast);
            }
        }
        return stack.stream().mapToInt(i -> i).toArray();
    }
}
