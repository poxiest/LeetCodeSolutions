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
17    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
18        if (root == null) return false;
19
20        if (isSameTree(root, subRoot))
21            return true;
22        
23        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
24    }
25
26    private boolean isSameTree(TreeNode root, TreeNode subRoot) {
27        if (root == null && subRoot == null)
28            return true;
29        if (root != null && subRoot != null && root.val == subRoot.val){
30            return isSameTree(root.left, subRoot.left) && isSameTree(root.right, subRoot.right);
31        }
32        else 
33            return false;
34    }
35}