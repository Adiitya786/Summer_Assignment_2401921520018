import java.util.*;

public class arr2 {
    static final long MOD = 676767677;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            long[] dp = new long[n+1];
            Arrays.fill(dp, Long.MAX_VALUE);
            dp[0] = 0;

            for(int i = 1; i <= n; i++){
                long product = 1;
                int last = Integer.MAX_VALUE;

                for(int j = i; j >= 1; j--){
                    if(a[j-1] <= last){
                        product = (product * a[j-1]) % MOD;
                        last = a[j-1];

                        dp[i] = Math.min(dp[i], dp[j-1] + product);
                    } else {
                        break;
                    }
                }
            }

            System.out.println(dp[n] % MOD);
        }
        sc.close();
    }
}