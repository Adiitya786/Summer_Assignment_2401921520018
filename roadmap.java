import java.util.*;

public class roadmap{
     
    static ArrayList<Integer> graph[];
    static int par[];
     static boolean vis[];
    
    public static void dfs(int curr){
       vis[curr] =true;
       for(int nei :graph[curr]){
            if(!vis[nei]){
                par[nei] = curr;
                dfs(nei);
            }
       }
        }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r1 = sc.nextInt();
        int r2= sc.nextInt();
        vis = new boolean[n+1];
        par = new int[n+1];
        graph = new ArrayList[n+1];
        for(int i =1;i<=n;i++){
            graph[i]= new ArrayList<>();
        }
        for(int i =1;i<=n;i++){
            if(i==r1) continue;
            int p = sc.nextInt();
            graph[p].add(i);
            graph[i].add(p);
        }
       
        dfs(r2);
        
        for(int i =1;i<=n;i++){
        if(i==r2) continue;
        System.out.print(par[i]+" ");
            
        }
        }
    
}