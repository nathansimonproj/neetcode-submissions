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

    private int max;

    public int diameterOfBinaryTree(TreeNode root) {
        

        dfs(root);
        return max;

    }

    private int dfs(TreeNode root) {

        if(root == null) {
            return 0;
        }


        int l = dfs(root.left);
        int r = dfs(root.right);

        max = Math.max(l + r, max);

        return 1 + Math.max(l, r);
    }
}




/*

    diameter is equal to the height on left + height on right

    at each node, calc l height, r height, check against max

    return max

*/
