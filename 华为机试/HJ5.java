import java.util.Scanner;

/**
 * @author Zexho
 * @date 2022/3/21 9:50 PM
 */
public class HJ5 {


    // 0xAA
    // A = 10 * 16
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            char[] num = str.toCharArray();
            int n = 0, j = 0;
            for (int i = num.length - 1; i > 1; i--, j++) {
                if (num[i] <= '9') {
                    n += (num[i] - '0') * Math.pow(16, j);
                } else {
                    n += (num[i] - 55) * Math.pow(16, j);
                }
            }
            System.out.println(n);
        }
    }
}
