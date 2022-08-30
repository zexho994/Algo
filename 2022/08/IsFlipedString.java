public class IsFlipedString {

    public boolean isFlipedString(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        if (s1.equals(s2)) return true;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(0)) {
                if (s1.substring(i).equals(s2.substring(0, s1.length() - i))
                        && s1.substring(0, i).equals(s2.substring(s2.length() - i))) {
                    return true;
                }
            }
        }
        return false;
    }
}
