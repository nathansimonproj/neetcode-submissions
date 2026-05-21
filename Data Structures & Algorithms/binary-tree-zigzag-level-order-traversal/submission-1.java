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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        List<List<Integer>> ans = new ArrayList<>();
        boolean left = true;

        if(root == null) {
            return ans;
        }

        //bfs
        while(!q.isEmpty()) {

            int size = q.size();
            List<Integer> level = new ArrayList<>();

            for(int i = 0; i < size; i++) {

                TreeNode curr = q.poll();

                if(left) {
                    level.add(curr.val);
                }
                if(!left) {
                    level.add(0, curr.val);
                }

                if(curr.left != null) {
                    q.add(curr.left);
                }
                if(curr.right != null) {
                    q.add(curr.right);
                }

            }

            ans.add(level);
            left = !left;
        }

        return ans;
    }
}