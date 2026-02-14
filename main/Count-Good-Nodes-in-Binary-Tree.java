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
17    public int goodNodes(TreeNode root) {
18        return dfs(root, root.val);
19    }
20
21    // since max is local, it will hold the value like a stack, so at 
22    // any moment it is the actual max in that path
23    private int dfs(TreeNode root, int max) {
24        if (root == null)
25            return 0;
26
27        int res = root.val >= max ? 1 : 0;
28        max = Math.max(max, root.val);
29        res += dfs(root.left, max);
30        res += dfs(root.right, max);
31        return res;
32    }
33}