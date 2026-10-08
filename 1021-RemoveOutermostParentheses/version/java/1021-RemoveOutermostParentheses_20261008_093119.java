// Last updated: 10/8/2026, 9:31:19 AM
1class Solution {
2    public String removeOuterParentheses(String s) {
3        StringBuilder sb = new StringBuilder();
4        int lvl = 0;
5
6        for (int i = 0; i < s.length(); i++) {
7            char c = s.charAt(i);
8
9            if ((c == '(' && lvl++ > 0) ||
10                (c == ')' && --lvl > 0))
11                sb.append(c);
12        
13        }
14
15        return sb.toString();
16    }
17}