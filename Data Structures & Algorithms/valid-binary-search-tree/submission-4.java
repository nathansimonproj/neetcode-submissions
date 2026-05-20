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
    public boolean isValidBST(TreeNode root) {
        return rangeCheck(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean rangeCheck(TreeNode root, long lowerB, long upperB) {

        if(root == null) {
            return true;
        }

        if(root.val <= lowerB || root.val >= upperB) {
            return false;
        }

        return rangeCheck(root.left, lowerB, root.val) && rangeCheck(root.right, root.val, upperB);
    }
}
