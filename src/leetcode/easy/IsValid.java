package leetcode.easy;

import java.util.Stack;

/**
 * @author Zexho
 * @date 2020/8/14 8:42 上午
 */
public class IsValid {

    public boolean isValid(String sourceStr) {
        if (sourceStr == null || sourceStr.equals("")) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (char symbol : sourceStr.toCharArray()) {
            if (symbol == '[' || symbol == '{' || symbol == '(') {
                stack.push(symbol);
            } else {
                if(stack.empty()){
                    return false;
                }
                if (symbol == ']') {
                    if (!(stack.pop() == '[')) {
                        return false;
                    }
                } else if (symbol == '}') {
                    if (!(stack.pop() == '{')) {
                        return false;
                    }
                } else { // ')'
                    if (!(stack.pop() == '(')) {
                        return false;
                    }
                }
            }
        }
        if(stack.empty()){
            return true;
        }else{
            return false;
        }
    }


}
