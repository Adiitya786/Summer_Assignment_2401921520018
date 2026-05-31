import java.util.*;

public class arr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int x = sc.nextInt();
            int s = sc.nextInt();
            String str = sc.next();


            int tab=0;
            for(char ch:str.toCharArray()){
                if(ch=='E'&& tab%s!=0) tab++;
                if(ch=='I'&& tab%s==0) tab++;
                if(ch=='A') tab++;
            }
            System.out.println(Math.min(tab, x*s));
        }

        sc.close();
    }
}
// import java.util.*;

// public class arr {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         int t = sc.nextInt();

//         while (t-- > 0) {

//             int n = sc.nextInt();

//             int nums[] = new int[n];

//             for (int i = 0; i < n; i++) {
//                 nums[i] = sc.nextInt();
//             }

             
//             Arrays.sort(nums);
//             if(n==1) {
//                 System.out.println(0);
//                 continue;
//             }
//             if(n==2) {
//                  if(nums[0]!=nums[1]){
//                     System.out.println(1);
//                  }
//                  else System.out.println(0);
//                  continue;
//             }
//             int mid = n/2,cnt=0;
//             for(int i =0;i<mid;i++){
//                   if(nums[i]!=mid) cnt++;
//                   else if(nums[i]!=nums[mid+i]) cnt++;
//             }
//             if(n%2==0){
//                 if(nums[mid]!=nums[n-1]) cnt++;
//             }
//             System.out.println(cnt);
//         }

//         sc.close();
//     }
// }