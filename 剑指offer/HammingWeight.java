/**
 * @author Zexho
 * @date 2022/3/1 5:14 PM
 */
public class HammingWeight {

    public int hammingWeight(int n) {
        int s = 0;
        while (n != 0) {
            s = n % 2 == 0 ? s : s + 1;
            n >>= 1;
        }
        return s;
    }

}
