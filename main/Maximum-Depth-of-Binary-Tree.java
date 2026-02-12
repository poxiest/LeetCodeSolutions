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
17    public int maxDepth(TreeNode root) {
18        // BFS approach 
19        Queue<TreeNode> q = new LinkedList<>();
20        if (root != null) q.offer(root);
21        int level = 0;
22
23        while(!q.isEmpty()) {
24            int s = q.size();
25            for(int i = 0 ; i < s ; i++) {
26                TreeNode tmp = q.poll();
27                if (tmp.left != null) q.offer(tmp.left);
28                if (tmp.right != null) q.offer(tmp.right);
29            }
30            level++;
31        }
32        return level;
33    }
34}