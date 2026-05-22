public class coinchange{
    static int cnt =1;
    static int min = Integer.MAX_VALUE;
    public static int coinminboundrec(int coins[],int tar,int idx,int temp){
        if(tar==0) {
            min = Math.min(min,temp);
           return min;
        }
       
        if(idx ==0) return Integer.MAX_VALUE;
        if(coins[idx-1]<=tar){
            int take = coinminboundrec(coins, tar-coins[idx-1], idx-1,temp+1);
            int nottake = coinminboundrec(coins, tar, idx-1,temp);
            return Math.min(take,nottake);
        }
      
        return coinminboundrec(coins, tar, idx-1,temp);
        
        
    }
    public static int coinminbounded(int coins[],int dp[][],int tar){
    
       for(int i =1;i<=coins.length;i++){
        for(int j=1;j<=tar;j++){
            if(coins[i-1]<=j){
                dp[i][j] = Math.max(1+dp[i-1][j-coins[i-1]],dp[i-1][j]);
            }
            else{
                dp[i][j]=dp[i-1][j];
            }
        }
       }
       for(int i =0;i<=coins.length;i++){
        for(int j=0;j<=tar;j++){
           System.out.print(dp[i][j]+" ");
        }
        System.out.println();
    }
        return dp[coins.length][tar];
        
    }

    public static void coinminunboundrec(int coins[],int tar, int idx,int temp){
        if(tar==0){
            min = Math.min(min, temp);
            return;
        }
        if(temp> min) return;   
         for(int i =0;i<coins.length;i++){
            if(coins[i]<=tar){
                coinminunboundrec(coins, tar-coins[i], idx, temp+1);
            }
         }
    }
    public static int coinminunbounddp(int coin[],int tar)
{
    int dp[][] = new int[coin.length+1][tar+1];
    for(int i =0;i<=coin.length;i++){
       dp[i][0] =1;
    }
    for(int i =1;i<=tar;i++){
       dp[0][i] =0;
    }
    for(int i =1;i<=coin.length;i++){
        for(int j =1;j<=tar;j++){
            if(coin[i-1]<= j){
                dp[i][j] = dp[i][j-coin[i-1]]+dp[i-1][j];
            }
            else{
                dp[i][j]=dp[i-1][j];
            }
        }
    }
    for(int i =0;i<=coin.length;i++){
        for(int j =0;j<=tar;j++){
           System.out.print(dp[i][j]+" ");
        }
        System.out.println();
    }
    return dp[coin.length][tar];
}           
      
    public static void main(String[] args) {
        int coins[] = {1,2,3};
        int tar = 4;
        int dp[][] = new int[coins.length+1][tar+1];
      
    //    System.out.println( coinminbounded(coins,dp,tar));
    // coinminunboundrec(coins,tar,coins.length,0);
    //    System.out.println( min);


    System.out.println(coinminunbounddp(coins,  tar));

        // float a = 0.7;
        // if(a<0.7) System.out.println("hi");
        // else System.out.println("bye");
    }
}