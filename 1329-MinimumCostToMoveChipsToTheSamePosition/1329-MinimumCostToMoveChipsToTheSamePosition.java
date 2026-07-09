// Last updated: 7/9/2026, 3:06:16 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int a=0;
        int b=0;
        for(int i:position)
        if((i%2)==0)
        a++;
        else
        b++;
        return a<b?a:b;


        
    }
}