/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    private int res = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        
        dfs(root, low, high);

        return res;

    }

    private void dfs(TreeNode root, int l, int h) {

        if(root == null) {
            return;
        }

        if(root.val <= h && root.val >= l) {
            res += root.val;
        }

        dfs(root.left, l, h);
        dfs(root.right, l, h);
    }
}