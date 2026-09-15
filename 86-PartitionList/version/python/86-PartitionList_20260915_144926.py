# Last updated: 9/15/2026, 2:49:26 PM
1class Solution:
2    def partition(self, head: Optional[ListNode], x: int) -> Optional[ListNode]:
3        curr = head
4
5        shead = ListNode(0)
6        stail = shead
7
8        lhead = ListNode(0)
9        ltail = lhead
10
11        while curr:
12            if curr.val < x:
13                stail.next = curr
14                stail = stail.next
15            else:
16                ltail.next = curr
17                ltail = ltail.next
18
19            curr = curr.next
20
21        ltail.next = None
22        stail.next = lhead.next
23
24        return shead.next