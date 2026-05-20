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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();

        q.add(null);
        q.add(root);
        
        while(!q.isEmpty()) {

            TreeNode curr = q.poll();

            if(curr == null) {

                if(q.peek() != null) {
                    ans.add(q.peek().val);
                    q.add(null);
                }
                
                continue;
            }

            if(curr.right != null) {
                q.add(curr.right);
            }
            if(curr.left != null) {
                q.add(curr.left);
            }
        }

        return ans;

    }
}


/*

    level order traversal, for each level add one thing

*/