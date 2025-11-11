import java.util.*;

public class duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("Wrong Input");
            return;
        }
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Wrong Input");
            return;
        }

        int[] arr = new int[n];
        int count = 0;

        while (sc.hasNextInt()) {
            int val = sc.nextInt();
            if (val < 0) {
                System.out.println("Wrong Input");
                return;
            }

            if (count < n) {
                arr[count++] = val;
            } else {
                System.out.println("Wrong Input");
                return;
            }
        }

        if (count < n) {
            System.out.println("Wrong Input");
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = arr[j] + 1; 
                }
            }
        }
        
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        System.out.println(sum);
    }
}
