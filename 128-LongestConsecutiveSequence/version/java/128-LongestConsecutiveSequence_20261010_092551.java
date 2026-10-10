// Last updated: 10/10/2026, 9:25:51 AM
1
2import java.util.Arrays;
3
4class Solution {
5    public int longestConsecutive(int[] nums) {
6        if (nums.length == 0) return 0;
7
8        Arrays.sort(nums);
9
10        int count = 1;
11        int longest = 1;
12
13        for (int i = 1; i < nums.length; i++) {
14            if (nums[i] == nums[i - 1]) {
15                continue;
16            } else if (nums[i] == nums[i - 1] + 1) {
17                count++;
18            } else {
19                count = 1;
20            }
21
22            longest = Math.max(longest, count);
23        }
24
25        return longest;
26    }
27}
28