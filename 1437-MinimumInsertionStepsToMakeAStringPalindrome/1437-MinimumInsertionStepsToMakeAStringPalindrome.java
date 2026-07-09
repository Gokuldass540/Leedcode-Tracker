// Last updated: 7/9/2026, 3:06:11 PM
class Solution {
    public int minInsertions(String s) {
        int g=s.length();
        String a=new StringBuilder(s).reverse().toString();
        int dp[][]=new int[g+1][g+1];
        for(int num[]:dp){
            Arrays.fill(num,-1);
        }
        int ans=helper(s,a,g,g,dp);
        return(g-ans);
    }
     public int helper(String s,String a,int g,int m,int dp[][]){
        if(g==0||m==0) return 0;
        if(dp[g][m]!=-1) return dp[g][m];
        if(s.charAt(g-1)==a.charAt(m-1)){
            int ans=1+helper(s,a,g-1,m-1,dp);
            dp[g][m]=ans;
            return ans;
        }
        int left=helper(s,a,g-1,m,dp);
        int right=helper(s,a,g,m-1,dp);
        dp[g][m]=Math.max(left,right);
        return dp[g][m];

     }
}