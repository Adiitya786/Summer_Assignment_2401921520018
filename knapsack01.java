import java.util.*;

public class knapsack01{
    public static int maxprofit(int val[], int wt[], int idx, int W,int dp[][]){
        if(idx==0||W==0) return  dp[idx][W]=0;
        if(dp[idx][W]!=-1) return dp[idx][W];
        if(wt[idx-1]<=W){
            int take = val[idx-1]+maxprofit(val, wt, idx-1, W-wt[idx-1],dp);
            int nottake = maxprofit(val, wt, idx-1, W,dp);
            return dp[idx][W]=Math.max(take, nottake);
        }
        else{
            return dp[idx][W]= maxprofit(val, wt, idx-1, W,dp);
        }

    }
    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W = 7;
        int n = val.length;
        int dp[][] = new int[n+1][W+1];
        // for(int num[]:dp) Arrays.fill(num,-1);
        // System.out.println(maxprofit(val,wt,n,W,dp));
       for(int i =1;i<=n;i++){
        for(int j =1;j<=W;j++){
            if(wt[i-1]<=j){
                dp[i][j] =Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
            }
            else {
                dp[i][j]=dp[i-1][j];
            }
        }
       }
       System.out.println(dp[n][W]);
    }
}