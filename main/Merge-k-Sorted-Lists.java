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
13        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>((a,b) -> a.val - b.val);
14
15        for(ListNode l : lists) {
16            if (l!=null)
17                pq.offer(l);
18        }
19
20        ListNode dummy = new ListNode();
21        ListNode curr = dummy;
22
23        while (pq.size() != 0) {
24            ListNode temp = pq.remove();
25            curr.next = temp;
26            curr = curr.next;
27
28            temp = temp.next;
29            if (temp != null)
30                pq.offer(temp);
31        }
32
33        return dummy.next;
34    }
35}