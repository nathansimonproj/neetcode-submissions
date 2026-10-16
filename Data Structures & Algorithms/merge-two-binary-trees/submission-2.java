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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        
        return dfs(root1, root2);
    }

    //modify r1 in place
    private TreeNode dfs(TreeNode r1, TreeNode r2) {
        
        if(r1 == null) {
            return r2;
        }
        if(r2 == null) {
            return r1;
        }

        r1.val += r2.val;
        r1.left = dfs(r1.left, r2.left);
        r1.right = dfs(r1.right, r2.right);

        return r1;
    }
}

/*

    in place

*/