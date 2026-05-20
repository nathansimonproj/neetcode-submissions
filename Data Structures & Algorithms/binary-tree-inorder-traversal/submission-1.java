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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> ans = new ArrayList<>();
        if(root == null) {
            return ans;
        }

        return dfs(root, ans);
    }

    private List<Integer> dfs(TreeNode root, List<Integer> ans) {

        if(root == null) {
            return null;
        }

        
        dfs(root.left, ans);
        ans.add(root.val);
        dfs(root.right, ans);

        return ans;
    }
}

//recursive and iterative solutions