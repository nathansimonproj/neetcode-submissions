class Solution {
    public int orangesRotting(int[][] grid) {
        
        int freshRemaining = 0;
        Queue<int[]> q = new LinkedList<>();

        int[][] dirs = { {1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        for(int r = 0; r < grid.length; r++) {
            for(int c = 0; c < grid[0].length; c++) {

                if(grid[r][c] == 1) {
                    freshRemaining++;
                }
                else if(grid[r][c] == 2) {
                    q.offer(new int[] {r, c});
                }

            }
        }

        if(freshRemaining == 0) {
            return 0;
        }

        int minutes = 0;
        while(!q.isEmpty()) {

            int s = q.size(); //# of adjacent fresh fruits

            minutes++;
            for(int i = 0; i < s; i++) {
                int[] curr = q.poll();
                int r = curr[0], c = curr[1];

                for(int[] dir : dirs) {
                    int nr = r + dir[0], nc = c + dir[1];

                    if(isOut(nr, nc, grid) || grid[nr][nc] != 1) {
                        continue;
                    }

                    grid[nr][nc] = 2;
                    freshRemaining -= 1;

                    if(freshRemaining <= 0) {
                        return minutes;
                    }
                    
                    q.offer(new int[] {nr, nc});
                }
            }
        }

        return -1;
    }

    private boolean isOut(int r, int c, int[][] grid) {
        return r < 0 || r >= grid.length || c < 0 || c >= grid[0].length;
    }
}


/*

    0, 1, 2
    empty, fresh, rotten

    loop through array and keep track of fresh fruits, and add to queue rotten fruits

    multi sourced bfs, start from each rotten fruit, minutes, keep track of size and pop size times per minute

    return when fresh == 0, or when queue is empty

    */