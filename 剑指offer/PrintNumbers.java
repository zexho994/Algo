/**
 * @author Zexho
 * @date 2022/3/2 12:09 PM
 */
public class PrintNumbers {
    public int[] printNumbers(int n) {
        int max = (int) Math.pow(10, n);
        int[] arr = new int[max - 1];
        for (int i = 1; i < max; i++) {
            arr[i - 1] = i;
        }
        return arr;
    }
}
