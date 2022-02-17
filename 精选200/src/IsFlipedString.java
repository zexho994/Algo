/**
 * @author Zexho
 * @date 2022/2/17 11:03 PM
 */
public class IsFlipedString {

    public boolean isFlipedString(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        char c1 = s1.charAt(0);
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == c1) {
                if (compare(s1, s2, i)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean compare(String s1, String s2, int idx) {
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt((idx + i) % s2.length())) {
                return false;
            }
        }
        return true;
    }

}
