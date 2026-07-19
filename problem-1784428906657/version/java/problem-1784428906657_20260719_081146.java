// Last updated: 19/07/2026, 08:11:46
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
17    private int count = 0;
18    public int countDominantNodes(TreeNode root) {
19        TreeNode norlavetic = root;
20        dfs(norlavetic);
21        return count;
22        
23    }
24    private int dfs(TreeNode node){
25        if (node == null){
26            return Integer.MIN_VALUE;
27        }
28        int leftMax = dfs(node.left);
29        int rightMax = dfs(node.right);
30        int subtreeMax = Math.max(node.val, Math.max(leftMax, rightMax));
31        if(node.val == subtreeMax){
32            count++;
33        }
34        return subtreeMax;
35    }
36}