public class islandcount{
static int icount=0;

    public static boolean isSafe(int iland[][],int x, int y, boolean vis[][]){
        if(x>=0 && x<iland.length && y>=0 && y<iland[0].length&& !vis[x][y] && iland[x][y]==1) return true;
        return false;
    }
    public static void dfs(int iland[][],int x, int y, boolean vis[][]){
        int mx[] ={-1,-1,-1,0,0,1,1,1};
        int my[] ={-1,0,1,-1,1,-1,0,1};
        vis[x][y] =true;
        for(int i =0;i<8;i++){
            int newx = x+mx[i];
            int newy = y+my[i];

            if(isSafe(iland,newx,newy,vis)){
                dfs(iland, newx, newy, vis);

            }
        }
    }
    public static int ilandcount(int iland[][]){
        int n = iland.length;
        int m = iland[0].length;
        boolean vis[][] = new boolean[n][m];

        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(iland[i][j]==1 && !vis[i][j]){
                    icount++;
                    dfs(iland,i,j,vis);
                    
                }
            }
        }
        return icount;
    }
    public static void main(String[] args) {
        int iland[][] ={
            {1,1,0,0,0},
            {0,0,1,0,0},
            {1,0,0,1,1},
            {0,0,1,0,0},
        };
    
         System.out.println(ilandcount(iland));
    }
}