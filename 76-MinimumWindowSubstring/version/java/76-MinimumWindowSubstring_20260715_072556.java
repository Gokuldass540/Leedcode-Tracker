// Last updated: 7/15/2026, 7:25:56 AM
1class Solution {
2    public String minWindow(String s, String t) {
3        int formed = 0;
4        int left = 0;
5        int start = 0;
6        int minLength = Integer.MAX_VALUE;
7        Map<Character, Integer> tMap = new HashMap<>();
8        for (int i = 0; i < t.length(); i++) {
9            char ch = t.charAt(i);
10            tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
11        }
12        int required = tMap.size();
13        Map<Character, Integer> sMap = new HashMap<>();
14        for (int right = 0; right < s.length(); right++) {
15            char ch = s.charAt(right);
16            sMap.put(ch, sMap.getOrDefault(ch, 0) + 1);
17            if (tMap.containsKey(ch)
18                    && sMap.get(ch).intValue() == tMap.get(ch).intValue()) {
19                formed++;
20            }
21            while (formed == required) {
22                int windowLength = right - left + 1;
23
24                if (windowLength < minLength) {
25                    minLength = windowLength;
26                    start = left;
27                }
28                char leftChr = s.charAt(left);
29
30                sMap.put(leftChr, sMap.get(leftChr) - 1);
31
32                if (sMap.get(leftChr) == 0) {
33                    sMap.remove(leftChr);
34                }
35                if (tMap.containsKey(leftChr)
36                        && sMap.getOrDefault(leftChr, 0) < tMap.get(leftChr)) {
37                    formed--;
38                }
39                left++;
40            }
41        }
42        if (minLength == Integer.MAX_VALUE)
43            return "";
44
45        return s.substring(start, start + minLength);
46    }
47}