package 栈;

import java.util.Stack;

/**
 * @author Zexho
 * @date 2022/2/21 10:19 PM
 */
public class StackOfPlates {

    private Stack<Stack<Integer>> container;
    private int cap;

    public StackOfPlates(int cap) {
        this.cap = cap;
        this.container = new Stack<>();
    }

    public void push(int val) {
        if (this.container.isEmpty() || this.container.peek().size() == cap) {
            container.push(new Stack<>());
        }
        container.peek().push(val);
    }

    public int pop() {
        if (container.isEmpty()) {
            return -1;
        }
        Integer pop = container.peek().pop();
        if (container.peek().isEmpty()) {
            container.pop();
        }
        return pop;
    }

    public int popAt(int index) {
        if (container.size() <= index) {
            return -1;
        }
        Integer pop = container.get(index).pop();
        if (container.get(index).isEmpty()) {
            container.remove(index);
        }
        return pop;
    }
}
