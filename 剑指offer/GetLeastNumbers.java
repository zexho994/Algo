import java.util.stream.IntStream;

/**
 * @author Zexho
 * @date 2022/3/8 2:11 PM
 */
public class GetLeastNumbers {
    public int[] getLeastNumbers(int[] arr, int k) {
        return IntStream.of(arr)
                .sorted()
                .limit(k)
                .toArray();
    }
}
