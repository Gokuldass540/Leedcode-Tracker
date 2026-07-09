// Last updated: 7/9/2026, 3:07:38 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0)return false;
      while(n%4==0){
      n=n/4;
      }return n==1;
      
      }
    
}