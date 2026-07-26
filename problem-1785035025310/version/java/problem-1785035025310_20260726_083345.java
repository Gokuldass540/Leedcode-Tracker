// Last updated: 7/26/2026, 8:33:45 AM
1class Solution {
2    public int largestInteger(int n, int s) {
3        if(s>9*n){
4            return -1;
5        }
6        StringBuilder ans=new StringBuilder();
7        for(int i=0;i<n;i++){
8            int digit=Math.min(9,s);
9            ans.append(digit);
10            s=s-digit;
11            
12        }
13        while(ans.length()>1&&ans.charAt(0)=='0'){
14            ans.deleteCharAt(0);
15        }
16        return Integer.parseInt(ans.toString());
17    }
18}