public class grid {
    public static int f(int i,int j,int[][] dp){
        if(i==0 && j==0) return 1;
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int up=f(i-1, j,dp);
        int left=f(i, j-1, dp);
        return dp[i][j]=up+left;
    }
    public static void main(String[] args) {
        int m=3,n=3;
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        int res = f(m-1, n-1, dp);
        System.out.println(res);
    }
}
