import java.util.*;

class Pair implements Comparable<Pair>{
    int num;
    int idx;

    public Pair(int n,int i){
        this.num =n;
        this.idx =i;
    }
    @Override
    public int compareTo(Pair other){
        return this.num-other.num;
    }
}
public class arr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // in = sc.nextInt();

        List<Pair> ls = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

            int n = sc.nextInt();
            int k = sc.nextInt();
             int nums[] = new int[n];
             for(int i =0;i<n;i++){
                nums[i] = sc.nextInt();
             }
             for(int i=0;i<n;i++){
                ls.add(new Pair(nums[i], i+1));
             }
             Collections.sort(ls);
            //  for(int i=0;i<n;i++){
            //    System.out.println(ls.get(i).num+" "+ls.get(i).idx);
            //  }
            int tot =0;
            for(int i =0;i<ls.size();i++){
                if(ls.get(i).num>k) break;
                k-=ls.get(i).num;
                ans.add(ls.get(i).idx);
                tot++;
            }
             System.out.println(tot);
            for(Integer a:ans){
                System.out.print(a+" ");
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