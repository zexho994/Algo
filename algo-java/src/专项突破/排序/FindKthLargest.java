package 专项突破.排序;

import java.util.PriorityQueue;

/**
 * @author Zexho
 * @date 2021/12/9 8:01 下午
 */
public class FindKthLargest {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(nums.length, (o1, o2) -> o2 - o1);
        for (int n : nums) {
            queue.offer(n);
        }
        int res = 0;
        while (k != 0) {
            k--;
            res = queue.poll();
        }
        return res;
    }
}
