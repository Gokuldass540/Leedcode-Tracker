// Last updated: 10/13/2026, 9:00:36 PM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> neighbors;
6    public Node() {
7        val = 0;
8        neighbors = new ArrayList<Node>();
9    }
10    public Node(int _val) {
11        val = _val;
12        neighbors = new ArrayList<Node>();
13    }
14    public Node(int _val, ArrayList<Node> _neighbors) {
15        val = _val;
16        neighbors = _neighbors;
17    }
18}
19*/
20
21class Solution {
22   
23    Map<Node, Node> map = new HashMap<>();
24    public Node cloneGraph(Node node) {
25        return dfs(node);
26    }
27    public Node dfs(Node original) {
28        if (original == null)
29            return null;
30        if (map.containsKey(original))
31            return map.get(original);
32        Node copy = new Node(original.val);
33        map.put(original, copy);
34        for (Node n : original.neighbors)
35            copy.neighbors.add(dfs(n));
36        return copy;
37    }
38}