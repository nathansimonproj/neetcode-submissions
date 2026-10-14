class Solution {
    public void islandsAndTreasure(int[][] grid) {
        
        Queue<int[]> q = new LinkedList<>();
        int land = Integer.MAX_VALUE;

        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        //add all source nodes into grid
        for(int r = 0; r < grid.length; r++) {
            for(int c = 0; c < grid[0].length; c++) {
                if(grid[r][c] == 0) {
                    q.offer(new int[] {r, c});
                }
            }
        }

        while(!q.isEmpty()) {

            int[] curr = q.poll();
            int r = curr[0], c = curr[1];

            for(int[] dir : dirs) {
                int nr = r + dir[0], nc = c + dir[1];

                if(isOut(nr, nc, grid) || grid[nr][nc] != land) {
                    continue;
                }

                grid[nr][nc] = grid[r][c] + 1;
                q.offer(new int[] {nr, nc});
            }
        }
    }

    private boolean isOut(int r, int c, int[][] grid) {

        return r < 0 || r >= grid.length || c < 0 || c >= grid[0].length;
    }
}

/*

    multi sourced bfs from treasures



*/
