package 专项突破.队列;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Zexho
 * @date 2021/12/17 10:05 AM
 */
public class RecentCounter {

    private Deque<Integer> deque;

    public RecentCounter() {
        this.deque = new ArrayDeque<>(3000);
    }

    public int ping(int t) {
        deque.addFirst(t);
        while (deque.getLast() < t - 3000) {
            deque.removeLast();
        }
        return deque.size();
    }
}
