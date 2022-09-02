import java.util.Stack;

public class SortedStack {

    Stack<Integer> mainStack;
    Stack<Integer> minStack;

    public SortedStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        while (!mainStack.isEmpty() && val > mainStack.peek()) {
            minStack.push(mainStack.pop());
        }
        mainStack.push(val);
        while (!minStack.isEmpty()) {
            mainStack.push(minStack.pop());
        }
    }

    public void pop() {
        mainStack.pop();
    }

    public int peek() {
        return mainStack.isEmpty() ? -1 : mainStack.peek();
    }

    public boolean isEmpty() {
        return mainStack.isEmpty();
    }
}
