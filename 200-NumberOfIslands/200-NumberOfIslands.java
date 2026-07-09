// Last updated: 7/9/2026, 3:08:04 PM
import java.util.*;

class Solution {

    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] visited = new boolean[n][m];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == '1' && !visited[i][j]) {
                    ans++;
                    bfs(i, j, visited, grid, n, m);
                }

            }
        }

        return ans;
    }

    public void bfs(int i, int j, boolean[][] visited,
                    char[][] grid, int n, int m) {

        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{i, j});
        visited[i][j] = true;

        int[][] dir = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
        };

        while (!q.isEmpty()) {

            int[] curr = q.poll();

            int x = curr[0];
            int y = curr[1];

            for (int k = 0; k < 4; k++) {

                int nextRow = x + dir[k][0];
                int nextCol = y + dir[k][1];

                if (nextRow >= 0 &&
                    nextRow < n &&
                    nextCol >= 0 &&
                    nextCol < m &&
                    !visited[nextRow][nextCol] &&
                    grid[nextRow][nextCol] == '1') {

                    visited[nextRow][nextCol] = true;
                    q.add(new int[]{nextRow, nextCol});
                }
            }
        }
    }
}