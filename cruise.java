import java.util.*;
public class cruise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        int E[]=new int[n];
        int L[]=new int[n];
        System.out.println("Enter Entering Array");
        for(int i=0;i<n;i++){
            E[i]=sc.nextInt();
        }
        System.out.println("Enter Leaving Array");
        for(int i=0;i<n;i++){
            L[i]=sc.nextInt();
        }

        int p=0,max=0;
        for(int i=0;i<n;i++){
            p+=E[i]-L[i];
            max=Math.max(p,max);
        }
        System.out.println("Answer: "+max);
    }
}
