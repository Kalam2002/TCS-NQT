import java.util.Arrays;
import java.util.Scanner;

public class wire {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        String nums[] = str.split(" ");
        int n = nums.length;
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(nums[i]);
        }
        int totalcost=0;
        while(n>1){
            sort(arr,n);
            int cost=arr[0]+arr[1];
            totalcost+=cost;
            arr[0]=cost;
            arr[1]=arr[n-1];
            n--;
        }
        System.out.println(totalcost);
    }
    public static void sort(int[] arr,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
