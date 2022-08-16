import java.util.Stack;

/**
 * @author Zexho
 * @date 2022/4/23 10:42 PM
 */
public class IsValidSerialization {
    public boolean isValidSerialization(String preorder) {
        Stack<String> stack = new Stack<>();
        String[] strArr = preorder.split(",");
        int idx = 0;
        while(idx < strArr.length){
            String ch = strArr[idx];
            if(ch.equals("#")){
                while(!stack.isEmpty() && stack.peek().equals("#")){
                    stack.pop();
                    if(stack.isEmpty()){
                        return false;
                    }
                    stack.pop();
                }
            }
            stack.push(ch);
            idx += 1;
        }
        return stack.size() == 1 && stack.peek().equals("#");
    }
}
