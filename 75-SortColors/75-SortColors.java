// Last updated: 7/9/2026, 3:09:20 PM
class Solution {
    public void sortColors(int[] nums) {
        int a=0;
        int b=0;
        int c=0;
        for(int x:nums){
            if(x==0) a++;
            else if(x==1) b++;
            else if(x==2) c++;
        }
        int i =0;
        while(a-->0) nums[i++] =0;
        while(b-->0) nums[i++] =1;
        while(c-->0) nums[i++]=2;
    }
}