import java.util.Stack;

/**
 * @author Zexho
 * @date 2022/3/5 9:33 AM
 */
public class ValidateStackSequences {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed.length != popped.length) return false;
        Stack<Integer> push = new Stack<>();
        int j = 0;
        for (int n : pushed) {
            push.push(n);
            while (!push.isEmpty() && push.peek() == popped[j]) {
                push.pop();
                j++;
            }
        }
        return push.isEmpty();
    }
}
