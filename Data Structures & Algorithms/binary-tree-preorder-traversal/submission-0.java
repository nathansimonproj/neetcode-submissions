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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        ArrayList<Integer> res = new ArrayList<>();

        if(root == null) {
            return res;
        }

        return dfs(root, res);
    }

    private List<Integer> dfs(TreeNode root, ArrayList<Integer> res) {

        if(root == null) {
            return null;
        }

        res.add(root.val);
        dfs(root.left, res);
        dfs(root.right, res);

        return res;
    }
}