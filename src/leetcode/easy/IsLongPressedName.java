package leetcode.easy;

public class IsLongPressedName {
    public boolean isLongPressedName(String name, String typed) {
        int j = 0;
        for (int i = 0; i < name.length(); i++) {
            if(j >= typed.length()){
                return false;
            }

            if (name.charAt(i) == typed.charAt(j)) {
                if(i == name.length() - 1){
                    if(remCompete(j,typed,name.charAt(i)) == typed.length()){
                        return true;
                    }
                    return false;
                }
                if (name.charAt(i) != name.charAt(i + 1)) {
                    j = remCompete(j, typed, name.charAt(i));
                }else{
                    j++;
                }
                continue;
            }
            return false;

        }
        return true;
    }

    // 移除后续重复字符
    // return 是否存在重复字符，如果为false表示结果错误
    public int remCompete(int idx, String typed, char ch) {
        while (idx < typed.length() && typed.charAt(idx) == ch) {
            idx++;
        }
        return idx;
    }

}
