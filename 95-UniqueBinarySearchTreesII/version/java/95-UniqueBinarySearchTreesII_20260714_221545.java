// Last updated: 7/14/2026, 10:15:45 PM
1class Solution {
2    public List<TreeNode> allPossibleBST(
3        int start,
4        int end,
5        Map<Pair<Integer, Integer>, List<TreeNode>> memo
6    ) {
7        List<TreeNode> res = new ArrayList<>();
8        if (start > end) {
9            res.add(null);
10            return res;
11        }
12        if (memo.containsKey(new Pair<>(start, end))) {
13            return memo.get(new Pair<>(start, end));
14        }
15        // Iterate through all values from start to end to construct left and right subtree recursively.
16        for (int i = start; i <= end; ++i) {
17            List<TreeNode> leftSubTrees = allPossibleBST(start, i - 1, memo);
18            List<TreeNode> rightSubTrees = allPossibleBST(i + 1, end, memo);
19
20            // Loop through all left and right subtrees and connect them to ith root.
21            for (TreeNode left : leftSubTrees) {
22                for (TreeNode right : rightSubTrees) {
23                    TreeNode root = new TreeNode(i, left, right);
24                    res.add(root);
25                }
26            }
27        }
28        memo.put(new Pair<>(start, end), res);
29        return res;
30    }
31
32    public List<TreeNode> generateTrees(int n) {
33        Map<Pair<Integer, Integer>, List<TreeNode>> memo = new HashMap<>();
34        return allPossibleBST(1, n, memo);
35    }
36}