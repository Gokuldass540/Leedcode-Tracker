// Last updated: 7/9/2026, 3:09:16 PM
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        //At first it might feel like using a 2 pointer approach
        //but then you will miss out on feq subests like [1,3] for nums=[1,2,3]

        //APPROACH: recursion
        //its take/nottake thing => means we hav OPTIONS 
        //Options=Recursion

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        int n = nums.length;

        solve(nums, n, 0, ans, subset);
        return ans;
    }

    static void solve(int[] nums, int n, int idx, List<List<Integer>> ans, List<Integer> subset) {
        if (idx >= n) {
            ans.add(new ArrayList<>(subset));
            return;
        }

        //taking
        subset.add(nums[idx]);
        solve(nums, n, idx + 1, ans, subset);

        //not taking
        subset.remove(subset.size()-1);
        solve(nums, n, idx + 1, ans, subset);

        
    }
}