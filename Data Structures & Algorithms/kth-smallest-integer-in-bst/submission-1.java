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
    public int kthSmallest(TreeNode root, int k) {
        

        Stack<TreeNode> s = new Stack<>();
        TreeNode curr = root;
        int count = 0;

        while(curr != null || !s.isEmpty()) {

            while(curr != null) {
                s.push(curr);
                curr = curr.left;
            }

            curr = s.pop();
            count++;
            if(count == k) {
                return curr.val;
            }

            curr = curr.right;
            
        }

        return -1;


    }

    /*

        add the current thing, keep adding its left children, then add its right child

    */
}
