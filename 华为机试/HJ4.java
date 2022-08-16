import java.util.Scanner;

/**
 * @author Zexho
 * @date 2022/3/21 8:44 PM
 */
public class HJ4 {

    // 7 -> 8
    // 10 -> 16
    // 13 -> 16
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            int x = 0;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                sb.append(str.charAt(i));
                if (++x == 8) {
                    x = 0;
                    System.out.println(sb);
                    sb = new StringBuilder();
                }
            }
            while (x > 0 && x++ < 8) {
                sb.append("0");
            }
            System.out.println(sb);
        }
    }

}
