import java.util.*;

public class implementgraph{

     static class Edge {
        int src;
        int dest;
       
        public Edge(int s,int d){
            this.src = s;
            this.dest = d;
           
        }
    
        
    }

    public static void creategraph(ArrayList<Edge>graph[],int flights[][]){
        
        for(int i =0;i<flights.length;i++){
            int src = flights[i][0];
            int dest = flights[i][1];
           
            Edge e = new Edge(src, dest);
            graph[src].add(e);
        }
    }

    public static void bfs(ArrayList<Edge> graph[]){
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];
        q.add(0);

        while(!q.isEmpty()){
            int curr = q.remove();
            if(!vis[curr]){
                System.out.print(curr+" ");
                vis[curr] = true;
            
            for(int i =0;i<graph[curr].size();i++){
                Edge e= graph[curr].get(i);
                q.add(e.dest);
            }
        }
        }
        }
    

        public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[]){
            

            
                System.out.print(curr+" ");
                vis[curr]= true;
                for(int i =0;i<graph[curr].size();i++){
                    Edge e= graph[curr].get(i);
                    if(!vis[e.dest]){
                        dfs(graph,e.dest,vis);
                    }
                }
            }
        
    public static void main(String[] args) {
        int flights[][] = {{0,1},{0,2},
                           {1,0},
                           {1,3},
                           
                           {2,0},
                        {2,4},{3,1},{3,5},{4,2},{4,5},{5,3},{5,6},{6,5}};
        int n = flights.length;
        ArrayList<Edge> graph[] = new ArrayList[n];
         for(int i =0;i<flights.length;i++){
            graph[i] = new ArrayList<>();
        }
        
        // int graph[] =new int[flights.length];
        creategraph(graph, flights);
        bfs(graph);
        System.out.println();
        boolean vis[] = new boolean[graph.length];
        dfs(graph,flights[0][0],vis);
    }
}