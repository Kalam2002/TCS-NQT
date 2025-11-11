import java.util.Scanner;

public class maxeleincont {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        String nums[]=str.split(" ");
        int n=nums.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(nums[i]);
        }
        System.out.print("Enter K: ");
        int k=sc.nextInt();
        int[] res=new int[n-k+1];
        for(int i=0;i<n-k+1;i++){
            for(int j=i;j<i+k;j++){
                res[i]=Math.max(arr[j],res[i]);
            }
        }

        for(int num:res){
            System.out.print(num+" ");
        }
    }
}
