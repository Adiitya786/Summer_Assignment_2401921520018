
import java.util.*;

public class arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  int t = sc.nextInt();
      //  while(t-->0){
        int n = sc.nextInt();
       int nums[]  = new int[n];
       for(int i=0;i<n;i++){
        nums[i] =sc.nextInt();
       }
       long max =nums[n-1]-1,sum=nums[n-1];
       for(int i =n-2;i>=0;i--){
         sum+=(long)Math.min(max,nums[i]);
         if(max<=0) break;
         max=(long)Math.min(max,nums[i])-1;
        }
        
        // if(max>nums[i-1]-1) max = nums[i-1]-1;
       
       System.out.println(sum);
      

      // }
      

       sc.close();
       

    }
}
