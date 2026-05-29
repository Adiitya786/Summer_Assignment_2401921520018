public class rat {
    public static boolean isSafe(int maze[][],int x, int y,boolean vis[][]){
        if(x>=0 && x<maze.length &&y>=0 &&y<maze.length && !vis[x][y] && maze[x][y]==1) return true;
        return false;
    }

    public static void foundpath(int maze[][],int x, int y, StringBuilder sb,int d,boolean vis[][]){
     if(x==maze.length-1 && y==maze.length-1){
           System.out.print(sb.toString()+" ");
          
        return;
     }
     
     int moveX[] = {1,0,0,-1};
     int moveY[] = {0,-1,1,0};
     char dirc[] = {'D','L','R','U'};

     vis[x][y] =true;

     for(int i=0;i<4;i++){

        int newX = x+moveX[i];
        int newY = y+moveY[i];

        if(isSafe(maze,newX,newY,vis)){
           sb.append(dirc[i]);
            foundpath(maze, newX, newY, sb, d+1, vis);
             sb.deleteCharAt(sb.length()-1);

        }
     }
     vis[x][y]=false;
     
    }
    public static void main(String[] args) {

        int maze[][] = {
            {1,0,0,0},
            {1,1,0,1},
            {0,1,1,0},
            {1,1,1,1}
        };
        int n = maze.length;
        boolean vis[][] = new boolean[n][n];
        StringBuilder sb = new StringBuilder("");
        foundpath(maze,0,0,sb,0,vis);
    }
}
