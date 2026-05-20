/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        
        if(root == null) {
            return ans;
        }

        return dfs(root, ans);
    }


    private List<Integer> dfs(Node root, List<Integer> ans) {

        if(root == null) {
            return null;
        }

        for(Node n : root.children) {
            dfs(n, ans);
        }

        ans.add(root.val);
        return ans;
    }
}

/*

    dfs recursively
    loop through children and call?

    post order
        children, root

*/