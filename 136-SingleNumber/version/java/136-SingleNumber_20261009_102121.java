// Last updated: 10/9/2026, 10:21:21 AM
1class Solution {
2    public int singleNumber(int[] nums) {
3        int ones=0;
4        
5        for(int i=0;i<nums.length;i++){
6            ones=ones^nums[i];
7           
8        }
9        return ones;
10    }
11}