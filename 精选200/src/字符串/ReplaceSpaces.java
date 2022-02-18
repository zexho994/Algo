package 字符串;

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

    public String replaceSpaces2(String S, int length) {
        StringBuilder sb = new StringBuilder(S);
        sb.setLength(length);
        for (int i = length - 1; i >= 0; i--) {
            if (sb.charAt(i) == ' ') {
                sb.replace(i, i + 1, "%20");
            }
        }
        return sb.toString();
    }


}
