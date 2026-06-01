class Solution {

    private boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        
        visited = new boolean[board.length][board[0].length];

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {

                if(dfs(board, word, 0, visited, i, j)) {
                    return true;
                }

            }
        }

        return false;
    }

    private boolean dfs(char[][] board, String word, int idx, boolean[][] visited, int x, int y) {

        if(idx == word.length()) {
            return true;
        }

        if(x >= board.length || x < 0 || y >= board[0].length || y < 0 || board[x][y] != word.charAt(idx) || visited[x][y]) {
            return false;
        }

        visited[x][y] = true;
        boolean res = (dfs(board, word, idx + 1, visited, x - 1, y) || 
                    dfs(board, word, idx + 1, visited, x + 1, y) || 
                    dfs(board, word, idx + 1, visited, x, y - 1) ||
                    dfs(board, word, idx + 1, visited, x, y + 1));
        visited[x][y] = false;

        return res;
    }


    /*

        exist method
            traverse through every index as a possible start candidate

        dfs
            attempt to dfs from each candidate
    */
}
