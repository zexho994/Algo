import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Zexho
 * @date 2022/4/2 10:16 PM
 */
public class Multiply {

    public String multiply(String num1, String num2) {
        if (num2.equals("0") || num1.equals("0")) return "0";
        int idx2 = num2.length() - 1, zeroSize = 0;
        String res = "0";
        while (idx2 >= 0) {
            String subRes = mul(num1, num2.charAt(idx2--), zeroSize);
            zeroSize++;
            res = add(res, subRes);
        }
        Set<Integer> set = new HashSet<>();
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            int n1 = iterator.next();
            iterator.remove();
            Iterator<Integer> innerIterator =  set.iterator();
            while (innerIterator.hasNext()){
                int n2 = innerIterator.next();

            }
        }

        return res;
    }

    private String mul(String str1, char ch2, int zeroSize) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < zeroSize; i++) {
            sb.append("0");
        }
        int idx = str1.length() - 1, n1 = 1, n2 = ch2 - '0', carry = 0;
        while (idx >= 0 || carry > 0) {
            n1 = 1;
            if (idx >= 0) {
                n1 = str1.charAt(idx--) - '0';
            } else {
                n2 = 0;
            }
            int res = n2 * n1 + carry;
            carry = res / 10;
            res %= 10;
            sb.append(res);
        }
        return sb.reverse().toString();
    }

    private String add(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        int idx1 = str1.length() - 1, idx2 = str2.length() - 1, carry = 0;
        while (idx1 >= 0 || idx2 >= 0 || carry == 1) {
            int n1 = 0, n2 = 0;
            if (idx1 >= 0) {
                n1 = str1.charAt(idx1--) - '0';
            }
            if (idx2 >= 0) {
                n2 = str2.charAt(idx2--) - '0';
            }
            int sum = n1 + n2 + carry;
            carry = sum / 10;
            sum %= 10;
            sb.append(sum);
        }
        return sb.reverse().toString();
    }
}
