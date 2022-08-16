import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Zexho
 * @date 2022/3/27 7:53 PM
 */
public class Permute {

    /**
     * 时间复杂度：log(n * (n * n-1  n-2)
     * @param nums
     * @return
     */
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        process(nums, 0, new LinkedList<>(), list);
        return list;
    }

    private void process(int[] arr, int idx, List<Integer> sub, List<List<Integer>> list) {
        if (idx == arr.length) {
            list.add(new ArrayList<>(sub));
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            swap(arr, i, idx);
            sub.add(arr[idx]);
            process(arr, idx + 1, sub, list);
            sub.remove(sub.size() - 1);
            swap(arr, i, idx);
        }
    }

    private void swap(int[] arr, int n, int m) {
        int i = arr[n];
        arr[n] = arr[m];
        arr[m] = i;
    }

}
