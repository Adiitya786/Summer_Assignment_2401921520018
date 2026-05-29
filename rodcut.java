public class rodcut{

    public static int findmax(int len[],int price[], int n){
        if(n<=0) return 0;
        int maxval = Integer.MIN_VALUE;

        for(int i =1;i<=n;i++){
            maxval = Math.max(maxval,price[i]+findmax(len, price, n-i));
    
        }
        return maxval;
    }

    public static void main(String[] args) {
        int len[]={1,2,3,4,5,6,7,8};
        int price[] = {1,5,8,9,10,17,17,20};
        int n = len.length;
        int dp[][] = new int[n+1][n+1];
        // System.out.println(findmax(len, price, len.length));
        for(int i =0;i<price.length;i++){
                 dp[0][i]=0;
        }
        for(int i =0;i<price.length;i++){
                 dp[i][0]=0;
        }
        for(int i =1;i<=price.length;i++){
             for(int j =1;j<=price.length;j++){
                if(len[i-1]<=j){
                    dp[i][j] = Math.max(price[i-1]+dp[i][j-len[i-1]],dp[i-1][j]);
                }
                else{
                    dp[i][j]= dp[i-1][j];
                }
             }
        }
        for(int i =1;i<price.length;i++){
             for(int j =1;j<=price.length;j++){
               System.out.print(dp[i][j]+" ");
             }
             System.out.println();
        }
        System.out.println(dp[price.length][price.length]);
    }
}