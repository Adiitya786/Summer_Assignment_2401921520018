import java.util.*;
public class codeforces4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            // int nums[] = new int[7];
            // for(int i =0;i<7;i++){
            //     nums[i]= sc.nextInt();
            // }
            // Arrays.sort(nums);
            // int sum=0;
            // for(int i =0;i<6;i++){
            //     sum+=(-nums[i]);
            // }
            // System.out.println(sum+nums[6]);

            // int n = sc.nextInt();
            // int nums[] = new int[n];
            // nums[0]=2;
            
            // for(int i =1;i<n;i++){
            //     nums[i] = nums[i-1]*2;
                
            // }
            // for(int i =0;i<n;i++){
            //     System.out.println(nums[i]);
                
            // }
            int n = sc.nextInt();
            int nums[] = new int[n];
            for(int i =0;i<n;i++){
                nums[i] = sc.nextInt();
            }
            int ans=0,max=Integer.MIN_VALUE;
            for(int i =0;i<n;i++){
                for(int j =i+1;j<n;j++){
                    ans=nums[i]^nums[j];
                     max= Math.max(max, ans);
                }
               
            }
            System.out.println(max);
        }
    }
}
