/**
 * @author Zexho
 * @date 2022/2/13 4:42 PM
 */
public class OneEditAway {
    public boolean oneEditAway(String first, String second) {
        int diff = first.length() - second.length();
        if (diff < 0) {
            return oneEditAway(second, first);
        }
        if (diff > 1) {
            return false;
        }
        boolean change = false;
        if (diff == 0) {
            for (int i = 0; i < first.length(); i++) {
                if (first.charAt(i) != second.charAt(i)) {
                    if (change) {
                        return false;
                    }
                    change = true;
                }
            }
            return true;
        }
        int idx1 = 0, idx2 = 0;
        while (idx2 < second.length()) {
            if (first.charAt(idx1) != second.charAt(idx2)) {
                if (change) return false;
                change = true;
                idx1++;
            } else {
                idx1++;
                idx2++;
            }
        }
        return true;
    }


}
