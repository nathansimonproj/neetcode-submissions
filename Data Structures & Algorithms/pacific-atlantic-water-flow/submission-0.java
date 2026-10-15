class Solution {

    private Set<String> pc = new HashSet<>();
    private Set<String> at = new HashSet<>();

    private Set<String> vis;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        
        List<List<Integer>> res = new ArrayList<>();
        for(int r = 0; r < heights.length; r++) {
            for(int c = 0; c < heights[0].length; c++) {

                vis = new HashSet<>();
                boolean cP = pac(r, c, heights, heights[r][c]);

                vis = new HashSet<>();
                boolean cA = atl(r, c, heights, heights[r][c]);

                if(cP) {
                    pc.add(r + "," + c);
                }

                if(cA) {
                    at.add(r + "," + c);
                }

                if(cP && cA) {
                    List<Integer> curr = new ArrayList<>();

                    curr.add(r);
                    curr.add(c);

                    res.add(curr);
                }

            }
        }

        return res;
    }

    private boolean pac(int r, int c, int[][] heights, int prevHeight) {

        
        if(r < 0 || c < 0 || (pc.contains(r + "," + c) && prevHeight >= heights[r][c])) {
            return true;
        }

        if(r >= heights.length || c >= heights[0].length || prevHeight < heights[r][c]) {
            return false;
        }

        if (!vis.add(r + "," + c)) {
            return false;
        }
        int cH = heights[r][c];
        
        return pac(r + 1, c, heights, cH) || pac(r - 1, c, heights, cH) || pac(r, c + 1, heights, cH) || pac(r, c - 1, heights, cH);
    }

    private boolean atl(int r, int c, int[][] heights, int prevHeight) {

        if(r >= heights.length || c >= heights[0].length || (at.contains(r + "," + c) && prevHeight >= heights[r][c])) {
            return true;
        }

        if(r < 0 || c < 0 || prevHeight < heights[r][c]) {
            return false;
        }

        if (!vis.add(r + "," + c)) {
            return false;
        }

        int cH = heights[r][c];
        
        return atl(r + 1, c, heights, cH) || atl(r - 1, c, heights, cH) || atl(r, c + 1, heights, cH) || atl(r, c - 1, heights, cH);
    }
}

/*

    iterate through each element

        dfs
            if reach a sqaure that canFlow, then add to canFlow
        
        pacific dfs

        atlantic dfs

*/
