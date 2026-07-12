// Last updated: 7/12/2026, 9:19:37 PM
1class Solution {
2    public int hammingDistance(int x, int y) {
3        int count=0;
4        if(x==y) return count;
5        while(x>0||y>0){
6            int xBit=0;
7            int yBit=0;
8            if(x>0){
9                xBit=x%2;
10                x=Math.floorDiv(x,2);
11            }
12            if(y>0){
13                yBit=y%2;
14                y=Math.floorDiv(y,2);
15            }
16            if(xBit!=yBit) count++;
17        }
18        return count;
19    }
20}