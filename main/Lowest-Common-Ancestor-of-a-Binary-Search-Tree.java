1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10
11class Solution {
12    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
13        while(root != null) {
14            if (p.val > root.val && q.val > root.val)
15                root = root.right;
16            else if (p.val < root.val && q.val < root.val)
17                root = root.left;
18            else 
19                break;
20        }
21
22        return root;
23    }
24}