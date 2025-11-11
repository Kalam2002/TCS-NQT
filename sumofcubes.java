import java.util.Scanner;

public class sumofcubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        System.out.print("Enter m: ");
        int m=sc.nextInt();
        int res=0;
        for(int i=n;i<=m;i++){
            res+=i*i*i;
        }
        System.out.println("Result is: "+res);
    }
}
