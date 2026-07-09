// Last updated: 7/9/2026, 3:05:08 PM
class Solution {
    public boolean checkGoodInteger(int n) {
        int count =0;
        int squaresum=0;
        while(n>0){
            int digit=n%10;
            count+=digit;
            squaresum+=digit*digit;
            n=n/10;
            
        }
        if(squaresum-count>=50) return true;
        return false;
    }
}