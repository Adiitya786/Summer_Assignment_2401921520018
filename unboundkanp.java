import java.util.*;

public class unboundkanp {
    static int cost=0;
    public static int maxprofit(int val[],int wt[], int idx,int dp[][],int W){
        if(idx==0||W==0) return dp[idx][W]=0;
        int max = Integer.MIN_VALUE;
        if(dp[idx][W]!=-1) return dp[idx][W];
        for(int i =0;i<val.length;i++){
             if(wt[i]<=W){
               int take  = val[i]+maxprofit(val, wt, idx,dp, W-wt[i]);
               max = Math.max(max, take);
             }
            //   Math.max(cost, take);
        }
        return dp[idx][W]=max;
    
    }
    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=7;
        int dp[][] = new int[val.length+1][W+1];
        // for(int num[]:dp) Arrays.fill(num, -1);
        // System.out.println(maxprofit(val, wt, val.length,dp, W));
        for(int i=0;i<=val.length;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<=W;j++){
                dp[0][j]=0;
            }
            for(int i =1;i<=val.length;i++){
                for(int j =1;j<=W;j++){
                    if(wt[i-1]<=j)
                     dp[i][j]=Math.max(val[i-1]+dp[i][j-wt[i-1]],dp[i-1][j]);
                
                else dp[i][j]=dp[i-1][j];
            }
        }
            System.out.println(dp[val.length][W]);
    }
}
