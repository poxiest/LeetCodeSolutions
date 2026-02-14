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
21    private int dfs(TreeNode root, int max) {
22        if (root == null)
23            return 0;
24
25        int res = root.val >= max ? 1 : 0;
26        max = Math.max(max, root.val);
27        res += dfs(root.left, max);
28        res += dfs(root.right, max);
29        return res;
30    }
31}