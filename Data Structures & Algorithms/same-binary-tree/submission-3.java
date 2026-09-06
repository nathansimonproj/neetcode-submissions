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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        return same(p, q); 

    }

    private boolean same(TreeNode p, TreeNode q) {
        
        if(p == null || q == null) {
            return p == q;
        }

        if(p.val != q.val) {
            return false;
        }

        boolean l = same(p.left, q.left);
        if(l == false) {
            return false;
        }

        boolean r = same(p.right, q.right);
        if(r == false) {
            return false;
        }

        return true;

    }
}

/*

    somehow dfs on both, check that they are both the same val

*/
