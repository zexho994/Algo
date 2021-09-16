package leetcode.tencent;

/**
 * @author Zexho
 */
public class MyAtoi {
    private static int idx = 0;
    private static char invalid_char = '0';

    public int myAtoi(String s) {
        char[] chars = s.toCharArray();
        char first = matchFirst(chars);
        if (first == invalid_char) {
            return 0;
        }
        int res = matchNumber(chars, first);
        idx = 0;
        return res;
    }

    public char matchFirst(char[] chars) {
        for (; idx < chars.length; idx++) {
            if (chars[idx] == ' ') {
                continue;
            }
            if (chars[idx] == '+' || chars[idx] == '-') {
                return chars[idx++];
            }
            if (chars[idx] >= 48 && chars[idx] <= 57) {
                return '+';
            }
            return invalid_char;
        }
        return invalid_char;
    }

    public int matchNumber(char[] chars, char symbol) {
        int n = 0;
        for (; idx < chars.length; idx++) {
            if (chars[idx] < 48 || chars[idx] > 57) {
                break;
            }
            int newNum = n * 10 + chars[idx] - '0';
            if (newNum < n) {
                if (symbol == '+') {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }
            n = newNum;
        }
        if (symbol == '+') {
            return n;
        }
        return -n;
    }
}