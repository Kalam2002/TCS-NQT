import java.util.*;
public class subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n=sc.nextInt();
        String str=sc.nextLine();
        String nums[] = str.split(" ");
        ArrayList<Integer> arr = new ArrayList<>();
        for(String num:nums){
            arr.add(Integer.parseInt(num));
        }
        int k=sc.nextInt();

        for(int i=0;i<arr.size();i++){
            int sum=0;
            for(int j=i;j<arr.size();j++){
                sum+=arr.get(j);
                if(sum==k){
                    for(int x=i;x<=j;x++){
                        System.out.print(arr.get(x)+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
