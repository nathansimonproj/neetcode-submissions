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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {


        Queue<TreeNode> q = new LinkedList<>();
        Set<TreeNode> s = new HashSet<>();
        q.add(root);

        while(!q.isEmpty()) {
            TreeNode curr = q.poll();

            if(curr == null) {
                continue;
            }

            if(curr.val == subRoot.val) {
                s.add(curr);
            }

            q.add(curr.left);
            q.add(curr.right);
        }

        for(TreeNode node : s) {
            if(dfs(node, subRoot)) {
                return true;
            }
        }

        return false;

    }

    private boolean dfs(TreeNode root, TreeNode subRoot) {

        if(root == null && subRoot == null) {
            return true;
        }
        
        if(root == null || subRoot == null) {
            return false;
        }

        if(root.val != subRoot.val) {
            return false;
        }

        return dfs(root.left, subRoot.left) && dfs(root.right, subRoot.right);
    }
}


/*

    bfs until common root found

    dfs from there?

*/