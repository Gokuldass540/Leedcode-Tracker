// Last updated: 7/9/2026, 3:08:51 PM
class Solution {
    public int singleNumber(int[] nums) {
     int result=0;
     for(int num:nums){
        result=result^num;
     } 
     return result;  
    }
}