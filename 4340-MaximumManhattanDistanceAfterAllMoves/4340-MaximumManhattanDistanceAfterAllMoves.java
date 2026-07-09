// Last updated: 7/9/2026, 3:05:06 PM
class Solution {
    public int maxDistance(String moves) {
        int dx=0;
        int dy=0;
        int k=0;
        for(char c:moves.toCharArray()){
            if(c=='R')dx++;
            else if(c=='L')dx--;
            else if(c=='U')dy++;
            else if(c=='D')dy--;
            else k++;
        }
        return  Math.abs(dx) + Math.abs(dy) + k;
    }
}