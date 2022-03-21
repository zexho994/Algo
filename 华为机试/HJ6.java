import java.util.Scanner;

/**
 * @author Zexho
 * @date 2022/3/21 10:44 PM
 */
public class HJ6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = Integer.parseInt(scanner.nextLine());
            double max = Math.sqrt(n);
            int i = 1;
            while (n > 1 && ++i <= max) {
                while (n % i == 0) {
                    System.out.print(i + " ");
                    n /= i;
                }
            }
            System.out.println(n == 1 ? "" : n);
        }
    }
}
