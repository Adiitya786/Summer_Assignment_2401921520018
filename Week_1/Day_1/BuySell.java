package Week_1.Day_1;
class Solution {
    public int maxProfit(int[] prices) {
      int buy = Integer.MAX_VALUE;
      int profit = 0,max=0;
      for(int i =0;i<prices.length;i++){
        if(buy<prices[i]){
            profit= prices[i]-buy;
            max = Math.max(max,profit);
        }
        else{
            buy=prices[i];
        }
      }
      return max;
    }
}
