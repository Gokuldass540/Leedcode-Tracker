// Last updated: 7/9/2026, 3:06:09 PM
class Solution {
    public int[] runningSum(int[] nums) {
        int dass=0;
        int gokul[]=new int[nums.length];
        for(int i =0;i<nums.length;i++){
            dass=dass+nums[i];
            gokul[i]=dass;
        }
        return gokul;
    }
}