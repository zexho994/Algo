package leetcode.easy;

/**
 * @author Zexho
 * @created 2020/8/24 10:50 下午
 */
public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        int size = s.length();
        int len = 0;
        int index = 0;
        while (len < (size / 2)) {
            len++;
            if (size % len != 0) {
                continue;
            }

            String str1 = s.substring(0, len);
            while (index < size) {
                String substring = s.substring(index, index + len);
                if (!str1.equals(substring)) {
                    break;
                }
                index = index + len;
            }
            if (index == size) {
                return true;
            }
            index = 0;
        }
        return false;
    }

    public static void main(String[] args) {
        RepeatedSubstringPattern repeatedSubstringPattern = new RepeatedSubstringPattern();
        boolean abab = repeatedSubstringPattern.repeatedSubstringPattern("abab");
    }

}
