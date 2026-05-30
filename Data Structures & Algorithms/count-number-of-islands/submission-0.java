class Solution {
    public int numIslands(char[][] grid) {
        
        int count = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {

                if(grid[i][j] == '1') {
                    count++;

                    //recursively set all around it to zero
                    setZero(grid, i, j);
                }

            }
        }

        return count;
    }

    private void setZero(char[][] grid, int i, int j) {

        if(i < 0 || i >= grid.length || j < 0 || j>= grid[0].length) {
            return;
        }
        if(grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';
        setZero(grid, i + 1, j);
        setZero(grid, i - 1, j);
        setZero(grid, i, j + 1);
        setZero(grid, i, j - 1);

    }
}
