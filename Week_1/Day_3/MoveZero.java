package Week_1.Day_3;
class Solution {
    public void moveZeroes(int[] nums) {
  
      int n = nums.length;
      int lp =0,rp = 0;
      while(rp < n){
       if(nums[rp] !=0){
        nums[lp] =nums[rp];
        
        lp++;
       }
       rp++;
        
     }
     while(lp<n ) {
        if(nums[lp]!=0){
            nums[lp]=0;
        }
     lp++;
    }

    }
}