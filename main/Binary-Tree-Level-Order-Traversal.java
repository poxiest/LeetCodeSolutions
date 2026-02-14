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
17    public List<List<Integer>> levelOrder(TreeNode root) {
18        Queue<TreeNode> q = new LinkedList<>();
19        List<List<Integer>> res = new ArrayList<>();
20        if (root != null)
21            q.offer(root);
22
23        while (!q.isEmpty()) {
24            int s = q.size();
25            List<Integer> level = new LinkedList<>();
26            while (s-- > 0) {
27                TreeNode tmp = q.poll();
28                level.add(tmp.val);
29                if (tmp.left != null)
30                    q.offer(tmp.left);
31                if (tmp.right != null)
32                    q.offer(tmp.right);
33
34            }
35            res.add(level);
36        }
37
38        return res;
39    }
40}