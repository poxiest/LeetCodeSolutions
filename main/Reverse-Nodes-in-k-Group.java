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
12    public ListNode reverseKGroup(ListNode head, int k) {
13        // dummy node to maintain the head
14        ListNode dummy = new ListNode(0, head);
15
16        // node before the current group 
17        ListNode prevGroup = dummy;
18
19        while(true) {
20            // get the kth node
21            ListNode kth = getKthNode(prevGroup, k);
22
23            // if there are no k elements return 
24            if (kth == null)
25                break;
26            
27            // get the next start to reverse
28            ListNode nextHead = kth.next;
29
30            // reverse until nextHead
31            ListNode prev = kth.next;
32            ListNode cuu = prevGroup.next;
33            while(cuu != nextHead) {
34                ListNode temp = cuu.next;
35                cuu.next = prev;
36                prev = cuu;
37                cuu = temp;
38            }
39
40            // 
41            ListNode temp = prevGroup.next;
42            prevGroup.next = kth;
43            prevGroup = temp;
44        }
45        return dummy.next;
46    }
47
48    private ListNode getKthNode(ListNode curr, int k) {
49        while (curr != null && k > 0) {
50            curr = curr.next;
51            k--;
52        }
53
54        return curr;
55    }
56}