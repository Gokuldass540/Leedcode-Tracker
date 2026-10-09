// Last updated: 10/9/2026, 9:28:55 AM
1class Solution {
2    public int singleNumber(int[] nums) {
3        int ones = 0, twos = 0;
4        for (int i = 0; i < nums.length; i++) {
5            ones = (ones ^ nums[i]) & ~twos;
6            twos = (twos ^ nums[i]) & ~ones;
7        }
8        return ones;
9    }
10}