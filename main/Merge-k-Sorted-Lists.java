1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode mergeKLists(ListNode[] lists) {
13        int n = lists.length;
14
15        if (n == 0)
16            return null;
17
18        if (n == 1)
19            return lists[0];
20
21        for (int i = 1; i < n; i++) {                
22            lists[i] = mergeTwoLists(lists[i], lists[i - 1]);
23        }
24
25        return lists[n - 1];
26    }
27
28    private ListNode mergeTwoLists(ListNode one, ListNode two) {
29        ListNode r = new ListNode(0);
30        ListNode dummy = r;
31
32        while (one != null && two != null) {
33            if (one.val <= two.val) {
34                dummy.next = one;
35                one = one.next;
36            } else {
37                dummy.next = two;
38                two = two.next;
39            }
40            dummy = dummy.next;
41        }
42
43        if (one != null)
44            dummy.next = one;
45        else 
46            dummy.next = two;
47
48        return r.next;
49    }
50}