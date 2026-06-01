package Week_1.Day_1;
class Solution {
    public int removeDuplicates(int[] nums) {
       
      int n = nums.length;
      int lp=0,rp=1;
      int cnt=1;
       while(rp<n){
           if(nums[lp]!=nums[rp])   {
            nums[cnt++] =nums[rp];
            lp=rp;
           }
           rp++;
          

       }
       return cnt;
    }
}