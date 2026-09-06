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

    private boolean balanced = true;

    public boolean isBalanced(TreeNode root) {
        
        dfs(root);

        return balanced;
    }

    private int dfs(TreeNode root) {

        if(root == null) {
            return 0;
        }

        int l = dfs(root.left);
        int r = dfs(root.right);

        balanced = balanced & (Math.abs(l - r) < 2);

        return 1 + Math.max(l, r);
    }
}

/*

    height balanced == abs(left height - right height) < 2

    dfs on each node, calc height, check whether balanced, final check of l and r 

*/

