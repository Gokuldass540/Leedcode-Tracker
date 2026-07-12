// Last updated: 7/12/2026, 9:36:40 PM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int maxcnt=0;
4        int curcnt=0;
5        for(int n:nums){
6            if(n==1) curcnt++;
7            else{
8                maxcnt=Math.max(maxcnt,curcnt);
9                curcnt=0;
10            }
11        }
12        return maxcnt>curcnt? maxcnt:curcnt;
13    }
14}