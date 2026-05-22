import java.util.*;
public class frogjump {
    
    static int sec;
    public static int frogtab(int en[]){
        int dp[] = new int[en.length];
        dp[0]=0;
        dp[1] =Math.abs(en[1]-en[0]);

        for(int i =2;i<en.length;i++){
         int f= dp[i-1]+Math.abs(en[i]-en[i-1]);
         int s=dp[i-2]+Math.abs(en[i]-en[i-2]);
         dp[i]= Math.min(f,s);
        }
        // for(int i =0;i<en.length;i++){
        //      System.out.print(dp[i]+" ");
        // }
        return dp[en.length-1];
    }
    public static int frog(int en[], int n,int dp[]){
        if(n==0) return dp[n]=0;
        if(dp[n]!=-1) return dp[n];
        int first = Math.abs(en[n]-en[n-1])+frog(en, n-1,dp);
        if(n==1 ) sec = Integer.MAX_VALUE;
        else sec = Math.abs(en[n]-en[n-2])+frog(en, n-2,dp);

        return dp[n]=Math.min(first,sec);
    }

    public static int jumpkdistfrog(int heights[],int n,int k){
        if(n==0) return 0;
        int min = Integer.MAX_VALUE;
        for(int i =1;i<=k;i++){
            if(n-i>=0){
                int jump = Math.abs(heights[n]-heights[n-i])+jumpkdistfrog(heights, n-i, k);
                min = Math.min(min, jump);
            }
        }
        return min;
    }
    public static int jumpkdistfrogmemo(int heights[],int n,int k,int dp[]){
        if(n==0) return dp[n]= 0;
        int min = Integer.MAX_VALUE;
        if(dp[n]!=-1) return dp[n];
        for(int i =1;i<=k;i++){
            if(n-i>=0){
                int jump = Math.abs(heights[n]-heights[n-i])+jumpkdistfrog(heights, n-i, k);
                min = Math.min(min, jump);
            
            }
        }
         dp[n]=min;
        return dp[n-1]=min;
    }
    public static int jumpkdistfrogtab(int heights[],int n,int k){
      int dp[] = new int[n];
      Arrays.fill(dp, Integer.MAX_VALUE);
      dp[0]=0;
     
      for(int i =1;i<n;i++){
        for(int j =1;j<=k;j++){
            if(i-j>=0){
                int jump = Math.abs(heights[i]-heights[i-j]) +dp[i-j]; 
                dp[i] = Math.min(jump,dp[i]);
            }
        }
      }
      for(int i =0;i<n;i++){
        System.out.print(dp[i]+" ");
      }
      System.out.println();
      return dp[n-1];
    }
    public static void main(String[] args) {
        // int energy[]  = {2,1};
        // int dp[] = new int[energy.length+1];

        // Arrays.fill(dp,-1);
        // // System.out.println(frog(energy,energy.length-1,dp));
        // System.out.println(frogtab(energy));
        // frogtab(energy);


        int heights1[] ={15,4,1,14,15};
        int k =3;
        int heights2[] ={10,5,20,0,15};
        int k2 =2;
        int dp[] = new int[heights1.length];
        Arrays.fill(dp, -1);
        // System.out.println(jumpkdistfrog(heights, heights.length-1, k));
        // System.out.println(jumpkdistfrogmemo(heights1, heights1.length-1, k,dp));
        // System.out.println(jumpkdistfrogmemo(heights2, heights2.length, k2,dp));
        System.out.println(jumpkdistfrogtab(heights1, heights2.length, k));
        // for(int i=0;i<heights1.length;i++){
        //     System.out.print(dp[i]+" ");
        // }
    
    }
}
