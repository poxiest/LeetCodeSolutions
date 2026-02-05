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
23            // if there are no k elements break 
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
40        
41            ListNode temp = prevGroup.next;
42            // change the prevGroup.next pointer to kth node, since reversed this becomes the head
43            prevGroup.next = kth;
44            // change prevGroup pointer to get the right node because it becomes the prev node of the next group
45            prevGroup = temp;
46        }
47        return dummy.next;
48    }
49
50    private ListNode getKthNode(ListNode curr, int k) {
51        while (curr != null && k > 0) {
52            curr = curr.next;
53            k--;
54        }
55
56        return curr;
57    }
58}