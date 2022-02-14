/**
 * @author Zexho
 * @date 2022/2/14 9:16 AM
 */
public class CompressString {
    public String compressString(String S) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            newStr.append(S.charAt(i));
            int count = 1;
            while (i < S.length() - 1 && S.charAt(i + 1) == S.charAt(i)) {
                count++;
                i++;
            }
            newStr.append(count);
        }
        return newStr.length() < S.length() ? newStr.toString() : S;
    }
}
