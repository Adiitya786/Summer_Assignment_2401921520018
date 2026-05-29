// import java.util.*;
// public class div27april {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         while(t-->0){
//             int n = sc.nextInt();
//             int p = sc.nextInt();
//             int nums[] = new int[n];
           
//             for(int i =0;i<n;i++){
//                 nums[i] = sc.nextInt();
                
//             }
//             int  z =sc.nextInt();
//            int cnt =0;

//             int lp=0,rp =n-1,k=z-1;
//             int diff =1-nums[k];
//             while(lp<=rp){
//                 if(lp==rp) break;
              
//                 cnt++;
//                 while(nums[lp] !=diff){
//                     lp++;
//                 }
//                 while(nums[rp] !=diff){
//                     rp--;;
//                 }
//                for(int i =lp;i<=rp;i++){
//                 if(nums[i]==1) nums[i]=0;
//                 else nums[i]=1;
//                }
//                lp++;rp--;
            
//                 if(lp>k) lp=k;
//                 else if(rp<k) rp=k;
//             }
//             System.out.println(cnt);
//         }
//     }
// }
import java.util.*;

public class div27april {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt(); // always 1

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int p = sc.nextInt() - 1; // 0-based
            int x = a[p];

            int leftSegments = 0;
            int rightSegments = 0;

            // count left segments
            for (int i = 0; i < p; ) {
                if (a[i] != x) {
                    leftSegments++;
                    while (i < p && a[i] != x) i++;
                } else i++;
            }

            // count right segments
            for (int i = p + 1; i < n; ) {
                if (a[i] != x) {
                    rightSegments++;
                    while (i < n && a[i] != x) i++;
                } else i++;
            }

            System.out.println(Math.max(leftSegments, rightSegments));
        }
    }
}