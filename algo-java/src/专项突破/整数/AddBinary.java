package 专项突破.整数;

/**
 * @author Zexho
 * @date 2021/10/27 8:37 上午
 */
public class AddBinary {

    public String addBinary(String a, String b) {
        StringBuilder ansStr = new StringBuilder();
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();
        int acc = 0;
        int idxA = charsA.length - 1;
        int idxB = charsB.length - 1;
        while (idxA >= 0 || idxB >= 0) {
            int nA = idxA >= 0 ? charsA[idxA--] - '0' : 0;
            int nB = idxB >= 0 ? charsB[idxB--] - '0' : 0;
            int n = nA + nB + acc;
            if (n == 0 || n == 1) {
                acc = 0;
            } else if (n == 2 || n == 3) {
                acc = 1;
            }
            ansStr.append(n % 2);
        }
        if (acc == 1){
            ansStr.append(1);
        }
        return ansStr.reverse().toString();
    }

}
