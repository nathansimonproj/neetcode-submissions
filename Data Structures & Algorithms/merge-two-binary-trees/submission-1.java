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
        TreeNode merged = dfs(root1, root2);

        return merged;
    }

    private TreeNode dfs(TreeNode r1, TreeNode r2) {
        if (r1 == null && r2 == null) {
            return null;
        }

        TreeNode merged = new TreeNode();

        if (r1 != null && r2 != null) {
            merged.val = r1.val + r2.val;
            merged.left = dfs(r1.left, r2.left);
            merged.right = dfs(r1.right, r2.right);
        } else if (r1 != null) {
            merged.val = r1.val;
            merged.left = dfs(r1.left, null);
            merged.right = dfs(r1.right, null);
        } else {
            merged.val = r2.val;
            merged.left = dfs(null, r2.left);
            merged.right = dfs(null, r2.right);
        }

        return merged;
    }
}

/*

    dfs at the same time

    if(both non null) {
        new = n1 + n2
    }

    if one {
        new = non null
    }

*/