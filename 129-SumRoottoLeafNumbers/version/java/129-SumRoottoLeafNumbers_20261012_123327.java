// Last updated: 10/12/2026, 12:33:27 PM
1class Solution {
2    public int sumNumbers(TreeNode root) {
3        return dfs(root, 0);
4    }
5    
6    private int dfs(TreeNode node, int pathSum) {
7        if (node == null)
8            return 0;
9        
10        pathSum = pathSum * 10 + node.val;
11        
12        if (node.left == null && node.right == null)
13            return pathSum;
14        
15        return dfs(node.left, pathSum) + dfs(node.right, pathSum);
16    }
17}