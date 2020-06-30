package leetcode.medium;

import java.util.Stack;

/**
 * @Author: 994
 * @Date: 2020/6/30 10:15
 */
public class CQueue {
    /**
     * stack1 用来添加
     */
    private Stack<Integer> stack1;
    /**
     * stack2 用来删除
     */
    private Stack<Integer> stack2;

    public CQueue() {
        stack1 = new Stack();
        stack2 = new Stack();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if(stack2.empty()){
            if(stack1.empty()){
                return -1;
            }
            while (!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
