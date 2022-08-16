package 专项突破.队列;

/**
 * @author Zexho
 * @date 2021/12/17 9:52 AM
 */
public class MovingAverage {

    private int[] queue;
    private int idx = 0;
    private double sum = 0;


    /**
     * Initialize your data structure here.
     */
    public MovingAverage(int size) {
        this.queue = new int[size];
    }

    public double next(int val) {
        sum -= queue[idx % queue.length];
        sum += val;
        queue[(idx++) % queue.length] = val;
        return sum / (Math.min(idx, queue.length));
    }
}
