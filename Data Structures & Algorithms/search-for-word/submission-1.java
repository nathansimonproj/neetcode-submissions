class Solution {
    public boolean exist(char[][] board, String word) {
        

        Set<String> used = new HashSet<>();
        

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {

                if(dfs(board, word, 0, used, i, j)) {
                    return true;
                }

            }
        }

        return false;
    }

    private boolean dfs(char[][] board, String word, int idx, Set<String> used, int x, int y) {

        if(idx == word.length()) {
            return true;
        }

        if(x >= board.length || x < 0 || y >= board[0].length || y < 0 || used.contains(x + "," + y) || board[x][y] != word.charAt(idx)) {
            return false;
        }

        used.add(x + "," + y);
        boolean res = (dfs(board, word, idx + 1, used, x - 1, y) || 
                    dfs(board, word, idx + 1, used, x + 1, y) || 
                    dfs(board, word, idx + 1, used, x, y - 1) ||
                    dfs(board, word, idx + 1, used, x, y + 1));
        used.remove(x + "," + y);

        return res;
    }


    /*

        exist method
            traverse through every index as a possible start candidate

        dfs
            attempt to dfs from each candidate
    */
}
