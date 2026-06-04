package Week_1.Day_4;
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int ans[][] = new int[r][c];
        int r1=0,c1=0;
           if(mat.length*mat[0].length!=r*c) return mat;
      for(int i =0;i<mat.length;i++){
        for(int j =0;j<mat[i].length;j++){
            ans[r1][c1] = mat[i][j];
            c1++;
            if(c1==c) {c1=
            0;r1++;}
        }
      }
      return ans;
    }
}