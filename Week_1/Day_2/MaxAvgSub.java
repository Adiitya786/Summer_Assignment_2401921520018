package Week_1.Day_2;
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int lp=0,rp=0,sum=0;
        double avg = 0;
        double max = Double.NEGATIVE_INFINITY;
        while(rp<n){
            sum+=nums[rp];
            while((rp-lp+1)>k){
                sum-=nums[lp];
                lp++;
            }
            if(rp-lp+1==k){
                avg = (double)sum/k;
              
                max = Math.max(max,avg);
            
            }
            rp++;
        }
        return max;
    }
}