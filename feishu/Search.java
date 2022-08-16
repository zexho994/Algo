import java.util.PriorityQueue;

/**
 * @author Zexho
 * @date 2022/3/31 10:31 PM
 */
public class Search {
    public int search(int[] arr, int target) {
        int left = 0, right = arr.length - 1, mid;
        while (left <= right) {
            mid = (right - left) / 2 + left;
            if (arr[mid] == target) return mid;
            if (arr[mid] >= arr[0]) {
                if (target >= arr[0] && target < arr[mid]) right = mid - 1;
                else left = mid + 1;
            } else {
                if (target <= arr[arr.length - 1] && target > arr[mid]) left = mid + 1;
                else right = mid - 1;
            }
        }
        return -1;
    }
}
