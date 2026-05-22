import java.util.*;
public class editdist {

    public static int editrec(String s1,String s2,int  m,  int n){
        if(m==0){
            return n;
        }
        if(n==0) return m;
        if(s1.charAt(m-1)==s2.charAt(n-1)){
            return editrec(s1, s2, m-1, n-1);
        }
        return 1+(Math.min(editrec(s1, s2, m-1, n-1),Math.min(editrec(s1, s2, m-1, n),editrec(s1, s2, m, n-1))));
    }
    public static int editmemo(String s1,String s2,int  m,  int n,int dp[][]){
        if(m==0){
            return dp[m][n]=n;
        }
        if(n==0) return  dp[m][n]=m;
        if(s1.charAt(m-1)==s2.charAt(n-1)){
            return dp[m][n]=editrec(s1, s2, m-1, n-1);
        }
         return dp[m][n]= 1+(Math.min(editrec(s1, s2, m-1, n-1),Math.min(editrec(s1, s2, m-1, n),editrec(s1, s2, m, n-1))));
    }
    public static int edittabul(String s1,String s2,int  m,  int n){
       int dp[][]  = new int[m+1][n+1];
       for(int j =0;j<=m;j++){
        dp[j][0]=j;
       }
       for(int j =0;j<=n;j++){
        dp[0][j]=j;
       }
       for(int  i=1;i<=m;i++){
        for(int j =1;j<=n;j++){
           
             if(s1.charAt(i-1)==s2.charAt(j-1)){
                dp[i][j] =dp[i-1][j-1];
            }
            else {
                dp[i][j]=1+(Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1])));
            }
        }
       }
       for(int  i=0;i<=m;i++){
        for(int j =0;j<=n;j++){
           
             System.out.print(dp[i][j]+" ");
        }
        System.out.println();
       }
       return dp[m][n];
    }
 
    public static int editspaceopt(String s1, String s2,int m, int n ){
        int cnt =1;
        int a[] = new int[n+1];
        int b[] = new int[n+1];
        for(int i =0;i<=n;i++){
            a[i] =i;
        }
        while(cnt<=m){
              Arrays.fill(b,0);
            b[0] =cnt;
            for(int j =1;j<=n;j++){
                if(s1.charAt(cnt-1)==s2.charAt(j-1)){
                        b[j] =a[j-1];
                }
                else{
                    b[j] =1+(Math.min(b[j-1],Math.min(a[j], a[j-1])));
                }
            }
            for(int i =0;i<=n;i++){
                  a[i] =b[i];
            }
          
            cnt++;
        }
        for(int j =0;j<=n;j++){
            System.out.print(b[j]+" ");
        }
        System.out.println();
        return b[n];
    }
    public static void main(String[] args) {
        String s1 = "CAT";
        String s2 = "HAT";
        int m = s1.length();
        int n = s2.length();
        int dp[][] = new int[m+1][n+1];
        // System.out.println(editrec(s1,s2,m,n));
        // System.out.println(editmemo(s1,s2,m,n,dp));
        // System.out.println(edittabul(s1,s2,m,n));
        System.out.println(editspaceopt(s1,s2,m,n));
    }
}
