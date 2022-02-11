/**
 * @author Zexho
 * @date 2022/2/11 9:55 AM
 */
public class ReplaceSpaces {
    public String replaceSpaces(String S, int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(S.charAt(i) == ' ' ? "%20" : S.charAt(i));
        }
        return sb.toString();
    }
}
