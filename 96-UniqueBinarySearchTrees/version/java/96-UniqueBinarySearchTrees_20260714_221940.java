// Last updated: 7/14/2026, 10:19:40 PM
1class Solution {
2    public int numTrees(int n) {
3        int []G=new int[n+1];
4        G[0]=G[1]=1;
5        for(int i=2;i<=n;++i){
6            for(int j=1;j<=i;++j){
7                G[i]+=G[j-1]*G[i-j];
8            }
9        }
10        return G[n];
11    }
12}