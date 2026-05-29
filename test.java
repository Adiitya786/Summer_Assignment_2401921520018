// import java.util.*;

// public class test{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t= sc.nextInt();
//         while(t!=0){
//         int n = sc.nextInt();
//         long c= sc.nextInt();
//         int k = sc.nextInt();
//         int nums[] = new int[n];
//         for(int i =0;i<n;i++){
//             nums[i]= sc.nextInt();
//         }
//         Arrays.sort(nums);
//         for(int i=0;i<n;i++){
//             if(nums[i]<=c){
//                 while(nums[i]!=c &&k!=0){
//                     nums[i]+=1;
//                     k-=1;
//                 }
//                 c+=(long)nums[i];
//             }
//         }
    
//        System.out.println(c);
//        t--;
//     }
//     }
// }
import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long c = sc.nextLong();
            long k = sc.nextLong();

            long nums[] = new long[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextLong();
            }

            Arrays.sort(nums);

            for (int i = 0; i < n; i++) {
                if (nums[i] <= c) {
                    c += nums[i];
                } else {
                    long need = nums[i] - c;

                    if (k >= need) {
                        k -= need;
                        nums[i] = c;   // bring it to c
                        c += nums[i];
                    } else {
                        break;
                    }
                }
            }

            System.out.println(c);
        }
    }
}