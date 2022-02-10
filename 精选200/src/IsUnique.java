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

}
