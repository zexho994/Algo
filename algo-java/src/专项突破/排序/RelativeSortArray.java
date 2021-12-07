package 专项突破.排序;

/**
 * @author Zexho
 * @date 2021/12/7 7:50 下午
 */
public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] arr = new int[1001];
        for (int n : arr1) {
            arr[n]++;
        }
        int idx = 0;
        int[] res = new int[arr1.length];
        for (int n : arr2) {
            for (int i = 0; i < arr[n]; i++) {
                res[idx++] = n;
            }
            arr[n] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                res[idx++] = i;
            }
        }
        return res;
    }
}
