import java.util.*;
public class subarray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String nums[]= str.split(" ");
        int n=nums.length;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(nums[i]);
        }
        int k=sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        int currsum=0;
        for(int i=0;i<n;i++){
            currsum+=arr[i];
            if(currsum==k){
                for(int j=0;j<=i;j++){
                    System.out.print(arr[j]+" ");
                }
                System.out.println();   
            }
            if(map.containsKey(currsum-k)){
                int start=map.get(currsum-k)+1;
                for(int x=start;x<=i;x++){
                    System.out.print(arr[x]+" ");
                }
                System.out.println();
            }
            map.put(currsum,i);
        }
    }
}
