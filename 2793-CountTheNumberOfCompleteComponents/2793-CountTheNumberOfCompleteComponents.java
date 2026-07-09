// Last updated: 7/9/2026, 3:05:33 PM
class Solution {

    public int countCompleteComponents(int n, int[][] edges) {

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] visited = new boolean[n];
        int completeCount = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {

                Queue<Integer> q = new LinkedList<>();
                q.offer(i);
                visited[i] = true;

                int vertices = 0;
                int edgeCount = 0;

                while (!q.isEmpty()) {
                    int node = q.poll();

                    vertices++;
                    edgeCount += adj.get(node).size();

                    for (int nei : adj.get(node)) {
                        if (!visited[nei]) {
                            visited[nei] = true;
                            q.offer(nei);
                        }
                    }
                }

                edgeCount /= 2;

                int requiredEdges = vertices * (vertices - 1) / 2;

                if (edgeCount == requiredEdges) {
                    completeCount++;
                }
            }
        }

        return completeCount;
    }
}