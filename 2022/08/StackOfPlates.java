
import java.util.LinkedList;
import java.util.Stack;

public class StackOfPlates {

    private final LinkedList<Stack<Integer>> stacks;
    private final int step;

    public StackOfPlates(int cap) {
        this.step = cap;
        stacks = new LinkedList<>();
    }

    public void push(int val) {
        if(step <= 0) {
            return;
        }
        if(stacks.isEmpty()){
            stacks.addLast(new Stack<>());
        }
        if(stacks.getLast().size() == step){
            stacks.addLast(new Stack<>());
        }
        stacks.getLast().push(val);
    }

    public int pop() {
        if(stacks.isEmpty() || stacks.getLast().isEmpty()){
            return -1;
        }
        int pop = stacks.getLast().pop();
        if(stacks.getLast().isEmpty()){
            stacks.removeLast();
        }
        return pop;
    }

    public int popAt(int index) {
        if(stacks.size() <= index || stacks.get(index).isEmpty()){
            return -1;
        }
        int pop = stacks.get(index).pop();
        if(stacks.get(index).isEmpty()){
            stacks.remove(index);
        }
        return pop;
    }

}