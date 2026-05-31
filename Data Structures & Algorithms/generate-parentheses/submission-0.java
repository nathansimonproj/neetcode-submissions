class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> ans = new ArrayList<>();
        StringBuilder curr = new StringBuilder();
        
        dfs(n, ans, curr, 0, 0);
        return ans;
    }

    private void dfs(int n, List<String> ans, StringBuilder curr, int open, int close) {

        if(open - close < 0 || open > n || close > n) {
            return;
        }

        if(open == close && close == n) {
            ans.add(new String(curr));
            return;
        }

       
        curr.append('(');
        dfs(n, ans, curr, open + 1, close);
        curr.deleteCharAt(curr.length() - 1);

        curr.append(')');
        dfs(n, ans, curr, open, close + 1);
        curr.deleteCharAt(curr.length() - 1);
        
    }
}

/*

    base cases
        open == close == n

        close > n
            return

    recursive
        if(open < n)
            add an open
        
        if(close < n) 
            add a close

*/
