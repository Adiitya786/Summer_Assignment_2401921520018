import java.util.*;

public class twoarrays {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();

        // while (t-- > 0) {
        //     int n = sc.nextInt();

        //     int[] a = new int[n];
        //     int[] b = new int[n];

        //     for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        //     for (int i = 0; i < n; i++) b[i] = sc.nextInt();

        //     Set<Integer> set = new HashSet<>();

        //     // First pass: take all a[i]
        //     for (int i = 0; i < n; i++) {
        //         set.add(a[i]);
        //     }

        //     // Second pass: try swapping
        //     for (int i = 0; i < n; i++) {
        //         if (!set.contains(b[i])) {
        //             set.remove(a[i]);
        //             set.add(b[i]);

        //             // swap
        //             int temp = a[i];
        //             a[i] = b[i];
        //             b[i] = temp;
        //         }
        //     }

        //     // OUTPUT
        //     System.out.println(set.size());

        //     for (int i = 0; i < n; i++) {
        //         System.out.print(a[i] + " ");
        //     }
        //     System.out.println();

        //     for (int i = 0; i < n; i++) {
        //         System.out.print(b[i] + " ");
        //     }
        //     System.out.println();
        // }
        // import java.util.*;
// public class Main{
//     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashSet<Character> set = new HashSet<>();
        for(char ch:s.toCharArray()){
            set.add(ch);
        }
        if(set.size()%2==0){
            System.out.println("CHAT WITHH HER");
        }
        else{
            System.out.println("IGNORE HIM");
        }
    }
// }
//     }
}