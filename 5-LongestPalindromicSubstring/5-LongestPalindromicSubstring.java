// Last updated: 7/9/2026, 3:11:12 PM
class Solution {
    public String longestPalindrome(String s) {
        String longest = "";

        for (int i = 0; i < s.length(); i++) {

            String s1 = check(s, i, i);       // odd length
            String s2 = check(s, i, i + 1);   // even length

            if (s1.length() > longest.length()) {
                longest = s1;
            }

            if (s2.length() > longest.length()) {
                longest = s2;
            }
        }

        return longest;
    }

    public String check(String s, int left, int right) {

        while (left >= 0 && right < s.length() &&
               s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        return s.substring(left + 1, right);
    }
}