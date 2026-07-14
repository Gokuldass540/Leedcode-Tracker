// Last updated: 7/14/2026, 11:05:59 PM
1class Solution {
2    public List<List<String>> solveNQueens(int n) {
3        char[][] board = new char[n][n];
4        List<List<String>> result = new ArrayList<>();
5        
6        for (int i = 0; i < n; i++) {
7            Arrays.fill(board[i], '.');
8        }
9
10        nQueens(result, board, n, 0);
11
12        return result;
13    }
14
15    private void nQueens(List<List<String>> result, char[][] board, int n, int row) {
16        if (row == n) {
17            List<String> sol = new ArrayList<>();
18            for (char[] charArr : board) {
19                sol.add(new String(charArr));
20            }
21            result.add(sol);
22            return;
23        }
24
25        for (int i = 0; i < n; i++) {
26            if (isSafe(row, i, board, n)) {
27                board[row][i] = 'Q';
28                nQueens(result, board, n, row + 1);
29                board[row][i] = '.';
30            }
31        }
32    }
33
34    private boolean isSafe(int row, int col, char[][] board, int n) {
35        for (int i = 0; i < row; i++) {
36            if (board[i][col] == 'Q') {
37                return false;
38            }
39        }
40
41        int i = col;
42        int j = row;
43
44        while (i >= 0 && j >= 0) {
45            if (board[j][i] == 'Q') return false;
46            i--;
47            j--;
48        }
49
50        i = col;
51        j = row;
52
53        while (i < n && j >= 0) {
54            if (board[j][i] == 'Q') return false;
55            i++;
56            j--;
57        }
58
59        return true;
60    }
61}