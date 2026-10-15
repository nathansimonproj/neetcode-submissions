class Solution {

    int[][] dirs = { {1, 0}, {-1, 0}, {0, 1}, {0, -1} };

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        
        int R = heights.length;
        int C = heights[0].length;
        boolean[][] pac = new boolean[R][C];
        boolean[][] atl = new boolean[R][C];


        //bottom to top
        for(int r = 0; r < R; r++) {
            dfs(r, 0, pac, heights);
            dfs(r, C - 1, atl, heights);
        }

        //left to right
        for(int c = 0; c < C; c++) {
            dfs(0, c, pac, heights);
            dfs(R - 1, c, atl, heights);
        }

        List<List<Integer>> res = new ArrayList<>();
        for(int r = 0; r < R; r++) {
            for(int c = 0; c < C; c++) {
                if(pac[r][c] && atl[r][c]) {
                    List<Integer> curr = new ArrayList<>();
                    curr.add(r);
                    curr.add(c);

                    res.add(curr);
                }
            }
        }

        return res;

    }

    private void dfs(int r, int c, boolean[][] ocean, int[][] heights) {

        ocean[r][c] = true;

        //if in bounds, false, and valid, recurse
        for(int[] dir : dirs) {
            int nr = r + dir[0], nc = c + dir[1];

            if(inBounds(nr, nc, heights) && !ocean[nr][nc] && heights[nr][nc] >= heights[r][c]) {

                dfs(nr, nc, ocean, heights);

            }
        }
        
    }

    private boolean inBounds(int r, int c, int[][] heights) {

        return r >= 0 && r < heights.length && c >= 0 && c < heights[0].length;
    }
}


/*

    start from pacific and atlantic

    dfs, 
*/
