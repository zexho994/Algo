/**
 * @author Zexho
 * @date 2022/3/20 9:55 PM
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (chars[i] != ' ') {
                len++;
            } else if (len > 0) {
                return len;
            }
        }
        return len;
    }

}
