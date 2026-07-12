// Last updated: 7/12/2026, 9:04:50 PM
1class Solution {
2    public int arrangeCoins(int n) {
3        long left=1,right=n;
4        while(left<=right){
5            long mid=left+(right-left)/2;
6            long coins_needed=mid*(mid+1)/2;
7            if(coins_needed==n)return (int)mid;
8            else if(coins_needed< n) left=mid+1;
9            else right=mid-1;
10        }
11        return(int)right;
12    }
13}