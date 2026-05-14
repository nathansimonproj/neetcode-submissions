class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Map<Integer, HashSet<Character>> rowMap = new HashMap<>();
        Map<Integer, HashSet<Character>> colMap = new HashMap<>();
        Map<String, HashSet<Character>> gridMap = new HashMap<>();

        for(int r = 0; r < 9; r++) {
            for(int c = 0; c < 9; c++) {

                char curr = board[r][c];
                if(curr != '.') {
                    String gridPos = r/3 + "," + c/3;

                    //row logic
                    rowMap.putIfAbsent(r, new HashSet<Character>());
                    if(rowMap.get(r).contains(curr)) {
                        return false;
                    }

                    colMap.putIfAbsent(c, new HashSet<Character>());
                    if(colMap.get(c).contains(curr)) {
                        return false;
                    }

                    
                    gridMap.putIfAbsent(gridPos, new HashSet<Character>());
                    if(gridMap.get(gridPos).contains(curr)) {
                        return false;
                    }

                    //STATE: not seen curr in row col grid, valid num, add to each
                    rowMap.get(r).add(curr);
                    colMap.get(c).add(curr);
                    gridMap.get(gridPos).add(curr);
                }
            }
        }

        return true;
    }
}
