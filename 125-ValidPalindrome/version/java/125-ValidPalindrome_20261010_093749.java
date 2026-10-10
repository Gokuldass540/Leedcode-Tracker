// Last updated: 10/10/2026, 9:37:49 AM
1
2class Solution {
3    public boolean isPalindrome(String s) {
4        String str = s.toLowerCase().replaceAll("[^a-z0-9]", "");
5
6        String rev = new StringBuilder(str).reverse().toString();
7
8        return str.equals(rev);
9    }
10}
11