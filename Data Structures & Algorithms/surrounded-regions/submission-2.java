class Solution {

    private int[][] dirs = 
    { 
        {1, 0}, {-1, 0}, {0, 1}, {0, -1} 
    };

    public void solve(char[][] board) {

        for(int r = 0; r < board.length; r++) {
            
            //left and right boundaries

            dfs(board, r, 0);
            dfs(board, r, board[0].length - 1);

        }

        for(int c = 0; c < board[0].length; c++) {
            //upper and lower boundaries

            dfs(board, 0, c);
            dfs(board, board.length - 1, c);

        }


        for(int r = 0; r < board.length; r++) {
            for(int c = 0; c < board[0].length; c++) {

                if(board[r][c] == 'T') {
                    board[r][c] = 'O';
                    continue;
                }

                board[r][c] = 'X';
            }
        }

    }

    private void dfs(char[][] board, int r, int c) {

        if(r >= board.length || r < 0 || c >= board[0].length || c < 0 || board[r][c] == 'X' || board[r][c] == 'T') {
            return;
        }

        board[r][c] = 'T';

        for(int[] dir : dirs) {
            dfs(board, r + dir[0], c + dir[1]);
        }
    }

    
}


/*

    
    non captureable if any part of the region is connected to edge

    starting along perimeter
        if 'O'
            add to safe Os
            dfs from there

        if 'X'
    
    loop through all
        if non safe and 'O'
            flip to X
        
    return set

*/