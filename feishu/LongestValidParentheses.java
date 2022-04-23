import java.util.Stack;

/**
 * @author Zexho
 * @date 2022/4/23 9:34 PM
 */
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int idx = 0;
        int maxLen = 0;
        while(idx < s.length()){
            char ch = s.charAt(idx);
            if(ch == '(' || stack.isEmpty() || s.charAt(stack.peek()) == ')'){
                stack.push(idx);
            }else{
                stack.pop();
                int left = stack.isEmpty() ? -1 : stack.peek();
                maxLen = Math.max(maxLen,idx - left);
            }
            idx++;
        }
        return maxLen;
    }
}
