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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        ListNode result = new ListNode();
14        ListNode headResult = result;
15        int carry = 0;
16
17        while( l1 != null || l2 != null || carry != 0 ){
18            int l1Val = 0, l2Val = 0;
19            if(l1 != null){
20                l1Val = l1.val;
21                l1 = l1.next;
22            }
23            if(l2 != null){
24                l2Val = l2.val;
25                l2 = l2.next;
26            }
27
28            int sum = l1Val+l2Val+carry;
29            carry = sum/10;
30            headResult.next = new ListNode(sum%10);
31            headResult = headResult.next;
32        }
33
34        return result.next;
35    }
36}