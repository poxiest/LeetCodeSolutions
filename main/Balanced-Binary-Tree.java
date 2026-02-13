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
17    public boolean isBalanced(TreeNode root) {
18        return dfs(root)[0] == 1;
19    }
20
21    private int[] dfs(TreeNode root){
22        if (root == null) 
23            return new int[]{1, 0};
24        int[] left = dfs(root.left);
25        int[] right = dfs(root.right);
26
27        boolean bool = (left[0] == 1 && right[0] == 1) && (Math.abs(left[1]-right[1]) <= 1);
28        int height = 1 + Math.max(left[1], right[1]);
29
30        return new int[]{bool ? 1 : 0, height};
31    }
32}