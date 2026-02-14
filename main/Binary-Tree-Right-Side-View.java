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
17    public List<Integer> rightSideView(TreeNode root) {
18        List<Integer> res = new ArrayList<>();
19        Queue<TreeNode> q = new LinkedList<>();
20        if(root != null) q.offer(root);
21
22        while (!q.isEmpty()) {
23            int s = q.size();
24            while(s > 0) {
25                TreeNode tmp = q.poll();
26                if(tmp.left != null) q.offer(tmp.left);
27                if(tmp.right != null) q.offer(tmp.right);
28                if (s==1) res.add(tmp.val);
29                s--;
30            }
31        }
32
33        return res;
34    }
35}