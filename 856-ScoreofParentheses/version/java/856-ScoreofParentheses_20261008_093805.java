// Last updated: 10/8/2026, 9:38:05 AM
1class Solution {
2    public int scoreOfParentheses(String s) {
3        int score = 0, depth = 0;
4        for (int i = 0; i < s.length(); ++i) {
5            if (s.charAt(i) == '(') {
6                ++depth;
7            } else {
8                --depth;
9                if (s.charAt(i - 1) == '(') {
10                    score += 1 << depth;
11                }
12            }
13        }
14        return score;
15    }
16}