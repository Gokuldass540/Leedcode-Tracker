// Last updated: 7/9/2026, 3:09:21 PM
class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int a=1;
        int b=2;
        for(int i=3;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
}