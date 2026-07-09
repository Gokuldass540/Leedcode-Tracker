// Last updated: 7/9/2026, 3:05:41 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int elementsum=0;int digitsum=0;
        for(int num:nums){
            elementsum+=num;
            while(num!=0){
                digitsum+=num%10;
                num=num/10;
            }
        }
        return Math.abs(elementsum-digitsum);
    }
}