// Last updated: 7/12/2026, 9:24:03 PM
1class Solution {
2    public int findComplement(int num) {
3        int ans=0,index=0;
4        while(num>0){
5            if((num&1)==0)ans+=(int)Math.pow(2,index);
6            num>>=1;
7            index++;
8        }
9        return ans;
10    }
11}