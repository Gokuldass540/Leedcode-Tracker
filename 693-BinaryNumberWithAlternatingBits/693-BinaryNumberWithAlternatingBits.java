// Last updated: 7/9/2026, 3:06:48 PM
class Solution {
    public boolean hasAlternatingBits(int n) {
        
         int y=n>>1;
         while(n!=0){
        if((n&1)==(y&1)){
            break;
        }
        n>>=1;
        y>>=1;
         }
        return n==0?true:false;
        }
    }
