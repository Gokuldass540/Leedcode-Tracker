// Last updated: 7/9/2026, 3:08:57 PM
class Solution {
    public int maxProfit(int[] prices) {
        int n= prices.length;
        int maxp=0;
        int minBuyPrice =prices[0];
        for(int i=0;i<n;i++){
            int sellPrice = prices[i];
            if(sellPrice>minBuyPrice){
                int profit = sellPrice - minBuyPrice;
                if(profit > maxp) maxp = profit;
            }else{
                minBuyPrice = sellPrice;
            }
            
            
        }
        return maxp;
    }
}