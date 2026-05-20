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
    public List<List<Integer>> levelOrder(TreeNode root) {
        

        //non nested list
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> level = new ArrayList<>();

            for(int i = 0; i < levelSize; i++) {

                TreeNode curr = q.poll();
                if(curr == null) {
                    continue;
                }
                
                level.add(curr.val);
                q.add(curr.left);
                q.add(curr.right);
                
            }

            if(level.size() > 0) {
                ans.add(level);
            }
            
        }

        return ans;
    }
}
