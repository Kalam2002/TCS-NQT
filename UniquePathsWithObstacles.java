import java.util.Scanner;

public class UniquePathsWithObstacles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input format assumption: first two ints m n, then m rows of n integers (0/1)
        if (!sc.hasNextInt()) { System.out.println("Wrong Input"); return; }
        int m = sc.nextInt();
        if (!sc.hasNextInt()) { System.out.println("Wrong Input"); return; }
        int n = sc.nextInt();

        if (m <= 0 || n <= 0) { System.out.println(0); return; }

        int[][] grid = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!sc.hasNextInt()) { System.out.println("Wrong Input"); return; }
                grid[i][j] = sc.nextInt();
            }
        }

        long dp[] = new long[n];
        if(grid[0][0]==0){
            dp[0]=1;
        }else{
            dp[0]=0;
        }
        for(int i=0;i<n;i++){
            if(grid[0][i]==0){
                dp[j]=dp[j-1];
            }else{
                dp[j]=0;
            }
        }

        for(int i=1;i<m;i++){
            if(grid[i][0]!=0){
                dp[0]=0;
            }
            for(int j=1;j<n;j++){
                if(grid[i][j]==1){
                    dp[j]=0;
                }else{
                    dp[j]=dp[j]+dp[j-1]
                }
            }
        }
        System.out.println(dp[n-1]);
    }
}
