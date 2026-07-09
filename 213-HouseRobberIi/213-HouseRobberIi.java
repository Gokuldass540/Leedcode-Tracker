// Last updated: 7/9/2026, 3:08:01 PM
class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int arr[]=new int[n-1];
        int arr1[]=new int[n-1];
        for(int i=0;i<n-1;i++){
            arr[i]=nums[i];
        }
        for(int i=1;i<n;i++){
            arr1[i-1]=nums[i];
        }
        int dp[]=new int[Math.max(arr.length, arr1.length)];
        Arrays.fill(dp,-1);
        int ans1=helper(arr,arr.length-1,dp);
        Arrays.fill(dp,-1);
        int ans2=helper(arr1,arr1.length-1,dp);
        return Math.max(ans1,ans2);
}
    public int helper(int arr[],int a,int dp[]){
        if(a<0){
            return 0;
        }
        if (dp[a]!=-1){
            return dp[a];
        }
        int pick = arr[a] + helper(arr,a-2,dp);
        int notPick = helper(arr,a-1,dp);
        dp[a] = Math.max(pick, notPick);
        return dp[a];    
        }
}