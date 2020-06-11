package leetcode.medium;

import java.util.Stack;

/**
 * 739. 每日温度
 * @Author: 994
 * @Date: 2020/6/11 13:15
 */
public class DailyTemperatures {

    /**
     * 利用单调栈
     * 时间复杂度 O(n) 顺序遍历一次
     * 空间复杂度 O(n) 一个长度为n的数组
     * @param T
     * @return
     */
    public int[] dailyTemperatures(int[] T) {
        int[] res = new int[T.length];
        Stack<Integer> stack = new Stack();
        for(int i = 0 ; i < T.length ; i++){
            while (stack.size() != 0 && T[i] > T[stack.peek()]){
                Integer pop = stack.pop();
                res[pop] = i - pop;
            }
            stack.push(i);
        }
        return res;
    }
}
