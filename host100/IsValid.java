import java.util.Stack;

/**
 * @author : zexho
 * @created : 2022-05-19
**/
public class IsVaild{
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else if (ch == ')'){
                if(stack.isEmpty() || stack.peek() != '(') return false;
                stack.pop();
            }else if (ch == ']'){
                if(stack.isEmpty() || stack.peek() != '[') return false;
                stack.pop();
            }else {
                if(stack.isEmpty() || stack.peek() != '{') return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
