import java.util.Scanner;

public class supermarket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Value: ");
        int n=sc.nextInt();
        int p=1;
        while(n!=0){
            p*=n%10;
            n=n/10;
        }
        System.out.println("The Price is "+p);
    }
}
