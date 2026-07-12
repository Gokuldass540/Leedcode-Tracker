// Last updated: 7/12/2026, 9:12:25 PM
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        Arrays.sort(g);
4        Arrays.sort(s);
5        int contentChildren=0;
6        int cookieIndex=0;
7        while(cookieIndex<s.length&&contentChildren<g.length){
8            if(s[cookieIndex]>=g[contentChildren]){
9                contentChildren++;
10            }
11            cookieIndex++;
12        }
13        return contentChildren;
14    }
15}