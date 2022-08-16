import java.util.Arrays;
import java.util.Stack;

/**
 * @author : zexho
 * @created : 2022-06-20
**/
public class NextPermutation{
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(len-1);

        int i = nums.length-2;
        int idx = -1;
        while(i >= 0){
            if (nums[i] < nums[stack.peek()]) {
                while(!stack.isEmpty() && nums[i] < nums[stack.peek()]){
                    idx = stack.pop();
                }
                int t = nums[idx];
                nums[idx] = nums[i];
                nums[i] = t;
                break;
            }
            stack.push(i);
            i--;
        }
        Arrays.sort(nums,i+1,len);
    }

}
