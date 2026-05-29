public class ninja{
       static int tar=-1;
       static int max  = Integer.MIN_VALUE;
    //    static int profit=0;
    public static int maxpoints(int arr[][],int idx,int last){
        if(idx <0) return 0;
       int max =0;
        for(int i =0;i<3;i++){
            if(i!=last)
         {
           
           int profit =arr[idx][i]+maxpoints(arr, idx-1,i);
           max = Math.max(max, profit);
        //    System.out.print(max+" ");
            }
            
         }
        
        return max;
        }
    public static void main(String[] args) {
        int arr1[][]={
          {70,40,10},
          {180,20,5},
          {200,60,30}
          
        };
        int arr[][] = {
            
            {10,50,1},
            {1,100,11}
        };
     int dp[][] = new int[arr.length+1][4];
    //  Arrays.fill(dp,)
        // System.out.println(maxpoints(arr,arr.length-1,-1));
        dp[0][0]=Math.max(arr[0][1],arr[0][2]);
        dp[0][1]=Math.max(arr[0][0],arr[0][2]);
        dp[0][2]=Math.max(arr[0][0],arr[0][1]);
        dp[0][3]=Math.max(arr[0][1],Math.max(arr[0][2],arr[0][0]));       
        for(int i =1;i<arr.length;i++){
            for(int j =0;j<4;j++){
                dp[i][j]=0;
                for(int k =0;k<3;k++){
                  if(k!=j){
                     int point = arr[i][k]+dp[i-1][k];
                            dp[i][j]= Math.max(dp[i][j],point);
                  }
                }
         
            }
        }
        System.out.println(dp[arr.length-1][2]);

    }
}