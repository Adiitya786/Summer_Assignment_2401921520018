public class ms{
    public static  void minoper(String s){
         int i =s.length()-1,cnt=0;
         while(s.charAt(i)=='Y'){
            i--;
         }
         while(i>=0){
            if(s.charAt(i)=='Y') cnt++;
            i--;
         }
         int j=0,cnt1=0;
         while(s.charAt(j)=='X'){
            j++;
         }
         while(j<s.length()){
            if(s.charAt(j)=='X') cnt1++;
            j++;
         }
         System.out.println(Math.min(cnt,cnt1));
    }
    public static void fairindices(int a[], int b[]){
        int n = a.length;
        int cnta=0,cntb=0;
        int prea[] = new int[n];
        int preb[] = new int[n];
        int suma=0,sumb=0;
        for(int num:a) suma+=num;
        for(int num:b) sumb+=num;
        prea[0]=a[0];
        for(int i =1;i<n;i++){
             prea[i]=prea[i-1]+a[i];
        }
        preb[0]=b[0];
        for(int i =1;i<n;i++){
             preb[i]=preb[i-1]+b[i];
        }
        for(int num=0;num<n-1;num++){
            if(suma-prea[num]==prea[num]) cnta++;
        }
        for(int num=0;num<n-1;num++){
            if(sumb-preb[num]==preb[num]) cntb++;
        }
          
        System.out.println(Math.min(cnta, cntb));
    }
    public static void main(String[] args) {
        String s = "XYYXXXXYYYYXXXXXX";
        minoper(s);

        int a[] = {2,-2,-3,3};
        int b[] = {0,0,4,-4};
        // int a[] = {4,-1,0,3};
        // int b[] = {-2,5,0,3};
        // fairindices(a,b);

    }
}