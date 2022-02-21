package 栈;

import java.util.Stack;

/**
 * @author Zexho
 * @date 2022/2/21 9:59 PM
 */
public class MinStack {

    Stack<Integer> stack;
    Stack<Integer> min;


    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new Stack<>();
        min = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (min.peek() >= x) {
            min.push(x);
        }
    }

    public void pop() {
        Integer pop = stack.pop();
        if (pop.equals(min.peek())) {
            min.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
