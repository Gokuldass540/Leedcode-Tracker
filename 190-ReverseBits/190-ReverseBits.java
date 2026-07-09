// Last updated: 7/9/2026, 3:08:15 PM
class Solution {
    public int reverseBits(int n) {
        int last=0;
        for(int i=0;i<32;i++){
            last<<=1;
            last=(last|(n&1));
            n>>=1;
        }
        
        return last;
    }
}