// Last updated: 10/8/2026, 9:39:33 AM
1
2class Solution {
3    public int minAddToMakeValid(String s) {
4        int open = 0, add = 0;
5        for (char c : s.toCharArray()) {
6            if (c == '(') {
7                open++;
8            } else {
9                if (open > 0) {
10                    open--;
11                } else {
12                    add++;
13                }
14            }
15        }
16        return add + open;
17    }
18}