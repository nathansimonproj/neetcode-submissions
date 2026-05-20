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

        s.push(curr);
        curr = curr.left;

        while(curr != null || !s.isEmpty()) {

            while(curr != null) {
                s.push(curr);
                curr = curr.left;
            }

            //no more left children --> process top node
            TreeNode node = s.pop();
            count++;
            if(count == k) {
                return node.val;
            }

            //not top node --> process its right children
            curr = node.right;
        }

        return -1;
    }

    /*

        keep adding left children until none left, pop the top increment curr, add its right child --> must be less than the 

    */
}
