package 字符串;

/**
 * @author Zexho
 * @date 2022/2/10 10:43 AM
 */
public class IsUnique {

    // 方法一：使用数据记录
    public boolean isUnique(String str) {
        boolean[] arr = new boolean[256];
        for (Character ch : str.toCharArray()) {
            if (arr[ch]) {
                return false;
            } else {
                arr[ch] = true;
            }
        }
        return true;
    }

    // 方法2：使用数位记录字符,int类型有32位，可以装下26个字符。
    // 例如：
    // a = 1 << 0
    // d = 1 << 4
    // 总结 ==> X = 1 << (字母表的顺序位置)
    public boolean isUnique2(String str) {
        int check = 0;
        for (Character ch : str.toCharArray()) {
            if ((check & (1 << (ch - 'a'))) > 0) {
                return false;
            }
            check |= (1 << (ch - 'a'));
        }
        return true;
    }
}
