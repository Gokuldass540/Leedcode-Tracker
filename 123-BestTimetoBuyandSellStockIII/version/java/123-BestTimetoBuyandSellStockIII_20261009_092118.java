// Last updated: 10/9/2026, 9:21:18 AM
1class Solution {
2    public int maxProfit(int[] prices) {
3        if(prices == null || prices.length < 1) return 0;
4        int buy1 = -prices[0], sell1 = 0, buy2 = -prices[0], sell2 = 0;
5        for(int i = 1; i < prices.length; i++) {
6            buy1 = Math.max(buy1, -prices[i]);
7            sell1 = Math.max(sell1, buy1 + prices[i]);
8            buy2 = Math.max(buy2, sell1 - prices[i]);
9            sell2 = Math.max(sell2, buy2 + prices[i]);
10        }
11        return sell2;
12    }
13}