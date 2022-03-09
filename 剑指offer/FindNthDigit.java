import java.util.HashSet;
import java.util.PriorityQueue;

/**
 * @author Zexho
 * @date 2022/3/9 10:58 PM
 */
public class FindNthDigit {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> queue = new PriorityQueue();
        queue.offer(1L);
        HashSet<Long> set = new HashSet();
        int k = 1;
        long num = 0;
        while (k++ <= n) {
            num = queue.poll();
            if (set.add(num * 2)) {
                queue.offer(num * 2);
            }
            if (set.add(num * 3)) {
                queue.offer(num * 3);
            }
            if (set.add(num * 5)) {
                queue.offer(num * 5);
            }
        }
        return (int) num;
    }
}
