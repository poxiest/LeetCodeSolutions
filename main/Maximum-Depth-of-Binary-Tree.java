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
18        // DFS approach 
19
20        Stack<Pair<TreeNode, Integer>> s = new Stack<>();
21        s.push(new Pair<>(root, 1));
22
23        int res = 0;
24
25        while(!s.isEmpty()) {
26            Pair<TreeNode, Integer> temp = s.pop();
27            TreeNode node = temp.getKey();
28            int depth = temp.getValue();
29
30            if (node != null) {
31                res = Math.max(res, depth);
32                s.push(new Pair<>(node.right, depth+1));
33                s.push(new Pair<>(node.left, depth+1));
34            }
35        }
36
37        return res;
38    }
39}