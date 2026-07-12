// Last updated: 7/12/2026, 9:20:30 PM
1class Solution {
2    public int islandPerimeter(int[][] grid) {
3        int r = grid.length;
4        int c = grid[0].length;
5        int[][] vis = new int[r][c];
6
7        for (int i = 0; i < r; i++) {
8            for (int j = 0; j < c; j++) {
9                if (grid[i][j] == 1) {
10                    // Start DFS from the first land cell found and return immediately
11                    return dfs(i, j, r, c, grid, vis);
12                }
13            }
14        }
15        return 0;
16    }
17
18    private int dfs(int i, int j, int r, int c, int[][] grid, int[][] vis) {
19        // Out of bound or water cell indicates an exposed perimeter edge
20        if (i < 0 || i >= r || j < 0 || j >= c) return 1;
21        if (grid[i][j] == 0) return 1;
22        if (vis[i][j] == 1) return 0;
23
24        vis[i][j] = 1; // Mark as visited
25
26        int perimeter = 0;
27        perimeter += dfs(i - 1, j, r, c, grid, vis); // up
28        perimeter += dfs(i + 1, j, r, c, grid, vis); // down
29        perimeter += dfs(i, j - 1, r, c, grid, vis); // left
30        perimeter += dfs(i, j + 1, r, c, grid, vis); // right
31
32        return perimeter;
33    }
34}