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
17    public boolean isValidBST(TreeNode root) {
18        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
19    }
20
21    // maintain min and max that can be applied for that node 
22    private boolean dfs(TreeNode root, long min, long max){
23        if (root == null)
24            return true;
25        
26        if (!(min < root.val && root.val < max))
27            return false;
28
29        // left node can have value from min val to current nodes val
30        boolean lfs = dfs(root.left, min, root.val);
31        // right node can have value from current nodes val to max val
32        boolean rfs = dfs(root.right, root.val, max);
33
34        return lfs && rfs;
35    }
36}