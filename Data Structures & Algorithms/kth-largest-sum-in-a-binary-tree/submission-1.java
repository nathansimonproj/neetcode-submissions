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
    public long kthLargestLevelSum(TreeNode root, int k) {
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        List<Long> levels = new ArrayList<>();

        while(!q.isEmpty()) {
            int size = q.size();

            long levelSum = 0;
            for(int i = 0; i < size; i++) {
                TreeNode curr = q.poll();

                
                levelSum += curr.val;

                if(curr.left != null) {
                    q.add(curr.left);
                }
                if(curr.right != null) {
                    q.add(curr.right);
                }
    

            }

            levels.add(levelSum);

        }

        Collections.sort(levels);

        return levels.size() - k >= 0 ? levels.get(levels.size() - k) : -1;

        /*

            bfs

            priority queue

        */
    }
}
