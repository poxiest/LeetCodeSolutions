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
17    public int kthSmallest(TreeNode root, int k) {
18        int[] tmp = new int[]{k, 0};
19        dfs(root, tmp);
20        return tmp[1];
21    }
22
23    private void dfs(TreeNode root, int[] arr) {
24        if (root == null) return;
25
26        dfs(root.left, arr);
27        arr[0] -= 1;
28        if(arr[0] == 0) {
29            arr[1] = root.val;
30            return;
31        }
32        dfs(root.right, arr);
33    }
34}