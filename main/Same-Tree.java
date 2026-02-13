1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public boolean isSameTree(TreeNode p, TreeNode q) {
18        // if (p == null & q == null)
19        //     return true;
20        // if (p != null && q != null && p.val == q.val)
21        //     return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
22        // else 
23        //     return false;
24
25        Stack<TreeNode[]> s = new Stack<>();
26        s.push(new TreeNode[] { p, q });
27
28        while (!s.isEmpty()) {
29            TreeNode[] tmp = s.pop();
30            TreeNode n1 = tmp[0], n2 = tmp[1];
31
32            if (n1 == null && n2 == null)
33                continue;
34            if (n1 == null || n2 == null || n1.val != n2.val)
35                return false;
36
37            s.push(new TreeNode[] { n1.left, n2.left });
38            s.push(new TreeNode[] { n1.right, n2.right });
39        }
40
41        return true;
42    }
43}