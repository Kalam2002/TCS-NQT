import java.util.Scanner;

public class box {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        int h=n/2;
        int v=n-n/2;
        int max=(h+1)*(v+1);
        System.out.println("Max Carpet: "+ max);
    }
}
