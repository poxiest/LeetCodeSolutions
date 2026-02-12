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
17    public TreeNode invertTree(TreeNode root) { 
18
19        Stack<TreeNode> s = new Stack<>();
20        s.push(root);
21
22        while(s.size() > 0) {
23            TreeNode pop = s.pop();
24            if (pop == null)
25                continue;
26            TreeNode temp = pop.left;
27            pop.left = pop.right;
28            pop.right = temp;
29
30            s.push(pop.right);
31            s.push(pop.left);
32        }
33
34        return root;
35    }
36}