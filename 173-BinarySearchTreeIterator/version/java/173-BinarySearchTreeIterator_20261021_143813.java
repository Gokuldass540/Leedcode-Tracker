// Last updated: 10/21/2026, 2:38:13 PM
1class BSTIterator {
2    private Stack<TreeNode> stack = new Stack<>();
3
4    private void pushLeft(TreeNode node) {
5        while (node != null) {
6            stack.push(node);
7            node = node.left;
8        }
9    }
10
11    public BSTIterator(TreeNode root) {
12        pushLeft(root);
13    }
14
15    public int next() {
16        TreeNode node = stack.pop();
17
18        if (node.right != null) {
19            pushLeft(node.right);
20        }
21
22        return node.val;
23    }
24
25    public boolean hasNext() {
26        return !stack.isEmpty();
27    }
28}