// Last updated: 10/15/2026, 12:02:03 PM
1public class Solution {
2    public boolean hasCycle(ListNode head) {
3        ListNode fast = head;
4        ListNode slow = head;
5
6        while (fast != null && fast.next != null) {
7            fast = fast.next.next;
8            slow = slow.next;
9
10            if (fast == slow) {
11                return true;
12            }
13        }
14
15        return false;        
16    }
17}