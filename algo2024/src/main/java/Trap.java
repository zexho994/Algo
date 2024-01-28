import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Stack;

public class Trap {
    public int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for(int i = 0; i < height.length; i++){
            while(!stack.isEmpty() && height[stack.peek()] < height[i]){
                int pop = stack.pop();
                if(stack.isEmpty()) break;
                int left = stack.peek();
                int l = i - left - 1;
                int h = Math.min(height[i],height[left]) - height[pop];
                result += l * h;
            }
            stack.push(i);
        }
        return result;
    }
    @Nested
    class Test{

        @org.junit.jupiter.api.Test
        void ut(){
            Trap trap = new Trap();
            int trap1 = trap.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
            Assertions.assertEquals(6,trap1);
        }
    }
}
