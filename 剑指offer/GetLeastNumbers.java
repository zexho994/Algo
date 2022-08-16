import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Zexho
 * @date 2022/3/8 2:11 PM
 */
public class GetLeastNumbers {
    public int[] getLeastNumbers(int[] arr, int k) {
        Queue<Integer> pq = new PriorityQueue(k);
        Arrays.stream(arr).forEach(pq::add);
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = pq.poll();
        }
        return res;
    }
}
