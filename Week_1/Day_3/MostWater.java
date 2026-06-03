package Week_1.Day_3;
class Solution {
    public int maxArea(int[] height) {
       
        int max = Integer.MIN_VALUE;
        int n = height.length;
      int lp =0,rp=n-1;
      while(lp<rp){
     
        int min = Math.min(height[lp],height[rp]);
        int width = rp-lp;
        int currarea = min*width;
        max = Math.max(max,currarea);
      
      if(height[lp]<height[rp]){
        lp++;
      }
      else{
        rp--;
      }
      }
        return max;
    }
}