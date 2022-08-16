package 专项突破.二分;

/**
 * @author Zexho
 * @date 2021/12/13 7:46 下午
 */
public class PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (arr[mid] > arr[mid - 1]) {
                if (arr[mid] > arr[mid + 1]) {
                    left = mid + 1;
                } else {
                    return mid;
                }
            } else {
                right = mid - 1;
            }
        }
        return 0;
    }
}
