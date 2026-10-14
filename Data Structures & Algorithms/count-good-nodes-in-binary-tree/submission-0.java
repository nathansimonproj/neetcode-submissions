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

    private int good = 0;

    public int goodNodes(TreeNode root) {
        
        dfs(root, -200);

        return good;
    }

    private void dfs(TreeNode root, int max) {

        if(root == null) {
            return;
        }

        if(max <= root.val) {
            good++;
        }

        max = Math.max(root.val, max);

        dfs(root.left, max);
        dfs(root.right, max);
        
    }
}

/*

    path contains no nodes with a value greater than the value of node x

    keep track of max

    

*/
