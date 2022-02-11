/**
 * @author Zexho
 * @date 2022/2/11 10:09 AM
 */
public class CanPermutePalindrome {
    public boolean canPermutePalindrome(String s) {
        int[] arr = new int[128];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }
        int k = 0;
        for (int n : arr) {
            if (n % 2 != 0) {
                if (k == 1) {
                    return false;
                }
                k++;
            }
        }
        return true;
    }
}
