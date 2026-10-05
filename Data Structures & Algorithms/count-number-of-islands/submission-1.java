class Solution {
    public int numIslands(char[][] grid) {
        
        int res = 0;

        for(int r = 0; r < grid.length; r++) {
            for(int c = 0; c < grid[0].length; c++) {
                
                if(grid[r][c] == '1') {
                    res++;
                    explore(r, c, grid);
                }

            }
        }

        return res;
    }

    private void explore(int r, int c, char[][] grid) {

        if(c >= grid[0].length || c < 0 || r >= grid.length || r < 0) {
            return;
        }
        
        if(grid[r][c] == '0') {
            return;
        }

        if(grid[r][c] == '1') {
            grid[r][c] = '0';
        }

        explore(r + 1, c, grid);
        explore(r - 1, c, grid);
        explore(r, c + 1, grid);
        explore(r, c - 1, grid);
    }
}
