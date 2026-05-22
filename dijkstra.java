import java.util.*;
public class dijkstra {
   static class Edge{
        int src; 
        int dest;
        int wt;
        public Edge(int s, int d, int wt){
            this.src= s;
            this.dest= d;
            this.wt = wt;
        
        }
    }
    static class Pair implements Comparable<Pair>{
        int node;
        int cost;
        public Pair(int node,int cost){
            this.node = node;
            this.cost = cost;
        }
        @Override
        public int compareTo(Pair p2){
            return this.cost-p2.cost;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Edge> graph[]= new ArrayList[n+1];
        for(int i =0;i<=n;i++){
            graph[i]= new ArrayList<>();
        }
        int m=sc.nextInt();
        for(int i =0;i<m;i++){
                int u = sc.nextInt();
                int v = sc.nextInt();
                int w = sc.nextInt();
                graph[u].add(new Edge(u, v, w));
                graph[v].add(new Edge(v, u, w));

        }
        int dist[] = new int[n+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1]=0;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean vis[] = new boolean[n+1];
        pq.add(new Pair(1,0));
        while(!pq.isEmpty()){
            Pair curr = pq.remove();
               if(curr.cost > dist[curr.node]) continue;


            for(Edge e :graph[curr.node]){
                if(e.wt+dist[curr.node]<dist[e.dest]){
                    dist[e.dest] =e.wt+dist[curr.node];
                    pq.add(new Pair(e.dest, dist[e.dest]));
                }
            }
        }
        
        for(int i =2;i<=n;i++){
            if(dist[i]==Integer.MAX_VALUE) dist[i]=-1;
            System.out.println(dist[i]);
        }
    }
}
