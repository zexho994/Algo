/**
 * @author Zexho
 * @date 2022/3/7 6:42 PM
 */
public class VerifyPostorder {
    public boolean verifyPostorder(int[] postorder) {
        return check(postorder, 0, postorder.length-1);
    }

    private boolean check(int[] arr, int l, int r) {
        if (l >= r) return true;
        int i = 0;
        while (arr[i] < arr[r]) {
            i++;
        }
        for (int j = i; j < r; j++) {
            if (arr[j] < arr[r]) return false;
        }
        return check(arr, l, i - 1) & check(arr, i, r - 1);
    }

}
