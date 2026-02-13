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
17    public int diameterOfBinaryTree(TreeNode root) {
18        int[] res = new int[1];
19        dfs(root, res);
20        return res[0];
21    }
22
23    private int dfs(TreeNode root, int[] res) {
24        if (root == null) {
25            return 0;
26        }
27        int left = dfs(root.left, res);
28        int right = dfs(root.right, res);
29        res[0] = Math.max(res[0], left + right);
30        return 1 + Math.max(left, right);
31    }
32}