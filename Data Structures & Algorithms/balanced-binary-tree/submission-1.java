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

    public boolean isBalanced(TreeNode root) {
        
        boolean res = (dfs(root) == -1) ? false : true;

        return res;
    }

    private int dfs(TreeNode root) {

        if(root == null) {
            return 0;
        }

        int l = dfs(root.left);
        if(l == -1) {
            return -1;
        }

        int r = dfs(root.right);
        if(r == -1) {
            return -1;
        }

        if(Math.abs(l - r) > 1) {
            return -1;
        }

        return 1 + Math.max(l, r);
    }
}

/*

    height balanced == abs(left height - right height) < 2

    dfs on each node, calc height, check whether balanced, final check of l and r 

*/

