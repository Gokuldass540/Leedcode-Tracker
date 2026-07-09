// Last updated: 7/9/2026, 3:06:13 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int gokul = 0;
        int dass =1;
        while(n>0){
            int digit =n%10;
            gokul=gokul+digit;
            dass=dass*digit;
            n=n/10;
        }
        return dass-gokul;
    }
}