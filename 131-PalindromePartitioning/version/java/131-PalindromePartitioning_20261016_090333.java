// Last updated: 10/16/2026, 9:03:33 AM
1class Solution {
2    public boolean isPalindrome(String s, int left, int right) {
3    
4        while (left < right) {
5            if (s.charAt(left) == s.charAt(right)) {
6                left++;
7                right--;
8            } else {
9                return false;
10            }
11        }
12        return true;
13    }
14
15    public void backtrack(String s, int ind, List<String> temp,
16                          List<List<String>> ans) {
17
18        if (ind == s.length()) {
19            ans.add(new ArrayList<>(temp));
20            return;
21        }
22
23        for (int i = ind; i < s.length(); i++) {
24            if (isPalindrome(s, ind, i)) {
25
26                temp.add(s.substring(ind, i + 1));
27
28                backtrack(s, i + 1, temp, ans);
29
30                temp.remove(temp.size() - 1);
31            }
32        }
33    }
34
35    public List<List<String>> partition(String s) {
36        List<List<String>> ans = new ArrayList<>();
37        List<String> temp = new ArrayList<>();
38
39        backtrack(s, 0, temp, ans);
40
41        return ans;
42    }
43}