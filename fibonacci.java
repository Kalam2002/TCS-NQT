import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ✅ Validate input
        if (!sc.hasNextInt()) {
            System.out.println("Wrong Input");
            return;
        }

        int n = sc.nextInt();

        // ✅ Check valid range
        if (n <= 0) {
            System.out.println("Wrong Input");
            return;
        }

        // ✅ Base Fibonacci values
        int a = 1, b = 1;
        long sum = 0;

        // ✅ Handle n = 1 or n = 2 directly
        if (n == 1) {
            System.out.println(1);
            return;
        } else if (n == 2) {
            System.out.println(2); // 1 + 1
            return;
        }

        // ✅ Calculate Fibonacci sum
        sum = a + b;
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            sum += c;
            a = b;
            b = c;
        }

        System.out.println(sum);
    }
}
