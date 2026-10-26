class Solution {

    private boolean[][] safe;
    private int[][] dirs = 
    { 
        {1, 0}, {-1, 0}, {0, 1}, {0, -1} 
    };

    public void solve(char[][] board) {
        
        this.safe = new boolean[board.length][board[0].length];

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

                if(board[r][c] == 'O' && !safe[r][c]) {
                    board[r][c] = 'X';
                }
            }
        }

    }

    private void dfs(char[][] board, int r, int c) {

        if(r >= board.length || r < 0 || c >= board[0].length || c < 0 || board[r][c] == 'X' || safe[r][c] == true) {
            return;
        }

        this.safe[r][c] = true;

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