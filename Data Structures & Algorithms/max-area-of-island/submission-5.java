class Solution {

    private int max;

    public int maxAreaOfIsland(int[][] grid) {
        
        for(int r = 0; r < grid.length; r++) {
            for(int c = 0; c < grid[0].length; c++) {

                if(grid[r][c] == 1) {

                    int area = dfs(r, c, grid, 1);
                    max = Math.max(max, area);

                }
            }
        }

        return max;
    }

    private int dfs(int r, int c, int[][] grid, int curr) {

        if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == 0) {
            return 0;
        }


        grid[r][c] = 0;

        return 1 + dfs(r + 1, c, grid, curr + 1) +
            dfs(r - 1, c, grid, curr + 1) +
            dfs(r, c + 1, grid, curr + 1) + 
            dfs(r, c - 1, grid, curr + 1);
        
    }
}
