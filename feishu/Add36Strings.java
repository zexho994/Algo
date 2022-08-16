/**
 * @author Zexho
 * @date 2022/4/1 8:52 AM
 */
public class Add36Strings {

    public String add36Strings(String a, String b) {
        int idxA = a.length() - 1, idxB = b.length() - 1, carry = 0;
        StringBuilder sb = new StringBuilder();
        while (carry == 1 || idxA != -1 || idxB != -1) {
            char chA = idxA >= 0 ? a.charAt(idxA--) : ' ';
            char chB = idxB >= 0 ? b.charAt(idxB--) : ' ';
            int intA = chA == ' ' ? 0 : chA <= '9' ? chA - '0' : chA - 'a' + 10;
            int intB = chB == ' ' ? 0 : chB <= '9' ? chB - '0' : chB - 'a' + 10;
            int sum = intA + intB + carry;
            carry = sum / 36;
            String charSum = String.valueOf(sum);
            if (carry == 1) {
                sum -= 36;
                charSum = String.valueOf((char) (sum < 10 ? '0' + sum : 'a' + sum - 10));
            }
            sb.insert(0,charSum);
        }
        return sb.toString();
    }


}
