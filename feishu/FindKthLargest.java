import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author Zexho
 * @date 2022/3/30 10:40 PM
 */
public class FindKthLargest {
    public int findKthLargest(int[] nums, int k) {
        if (k > nums.length) return 0;
        PriorityQueue<Integer> max = new PriorityQueue<>((o1, o2) -> o2 - o1);
        Arrays.stream(nums).forEach(max::offer);
        for (int i = 1; i < k; i++) {
            max.poll();
        }
        return max.poll();
    }
}
