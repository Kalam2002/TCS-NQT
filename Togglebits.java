import java.util.Scanner;

public class Togglebits {
    public static int togglebits(int n){
        int temp=1;
        while(temp<=n){
            n=n^temp;
            temp=temp<<1;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        if(!sc.hasNextInt()){
            System.out.println("Wrong Input");
            return;
        }
        int n=sc.nextInt();
        if(n<=100 && n>=1){
            int k = togglebits(n);
            System.out.println(k);
        }else{
            System.out.println("Wrong Input");
        }
    }
}
