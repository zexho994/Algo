package 专项突破.二分;

/**
 * @author Zexho
 * @date 2021/12/28 10:46 AM
 */
public class MinEatingSpeed {
    /**
     * len = piles.len
     * s = h - len
     * max(piles[len-s-1],piles[idx]-piles[len-s-1])
     *
     * @param piles
     * @param h
     * @return
     */
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        int min = 0;
        while (min <= max) {
            int m = (max - min) / 2 + min;
            int s = getHours(piles, m);
            if (s > h) {
                min = m + 1;
            } else {
                max = m - 1;
            }
        }
        return min;
    }

    public int getHours(int[] piles, int n) {
        int size = 0;
        for (int pile : piles) {
            size++;
            int s = pile;
            while (s > n) {
                size++;
                s -= n;
            }
        }
        return size;
    }
}
