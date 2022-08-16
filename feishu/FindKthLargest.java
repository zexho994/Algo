import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author Zexho
 * @date 2022/3/30 10:40 PM
 */
public class FindKthLargest {
    public int findKthLargest(int[] nums, int k) {
        if (k > nums.length) return 0;
        PriorityQueue<Integer> max = new PriorityQueue<>((o1, o2) -> o2 - o1);
        Arrays.stream(nums).forEach(max::offer);
        for (int i = 1; i < k; i++) {
            max.poll();
        }
        return max.poll();
    }

    public int findKthLargest2(int[] nums, int k) {
        sort(nums, 0, nums.length - 1, k);
        return nums[k - 1];
    }

    private void sort(int[] arr, int left, int right, int k) {
        if (left < right) {
            int mark = arr[right];
            int l = left;
            int r = right;
            right--;
            while (left <= right) {
                if (arr[left] >= mark) {
                    left++;
                } else {
                    swap(arr, left, right);
                    right--;
                }
            }
            swap(arr, r, left);
            if (left + 1 == k) {
                return;
            } else if (left + 1 > k) {
                sort(arr, l, left - 1, k);
            } else {
                sort(arr, left + 1, r, k);
            }
        }
    }

    private void swap(int[] arr, int n1, int n2) {
        int t = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = t;
    }


}
