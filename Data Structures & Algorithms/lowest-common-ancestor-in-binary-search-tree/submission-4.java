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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        //both greater
        if(p.val > root.val && q.val > root.val) {

            //check if either are exact matches --> lca
            return lowestCommonAncestor(root.right, p, q);

            //recurse on right subtree
        }

        if(p.val < root.val && q.val < root.val) {

            return lowestCommonAncestor(root.left, p, q);
        }


        return root;
    }
}

/*

    at any node, if p and q are on opposite sides of node, then node is the lca

    if p/q is equal to curr and p/q not, curr is lca

*/
