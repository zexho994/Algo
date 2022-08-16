import java.util.Scanner;

/**
 * @author Zexho
 * @date 2022/3/21 11:17 PM
 */
public class HJ7 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        while (sn.hasNext()) {
            double d = sn.nextDouble();
            int i = (int) d;
            System.out.println(d - i >= 0.5 ? i + 1 : i);
        }
    }
}
