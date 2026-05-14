class Solution {
    public boolean isValidSudoku(char[][] board) {
        

        Map<Integer, HashSet<Character>> rowMap = new HashMap<>();
        Map<Integer, HashSet<Character>> colMap = new HashMap<>();
        Map<String, HashSet<Character>> gridMap = new HashMap<>();


        for(int row = 0; row < board.length; row++) {
            for(int col = 0; col < board[0].length; col++) {

                char c = board[row][col];
                String grid = (row/3) + "," + (col/3);
                if(c != '.') {
                    if(rowMap.get(row) == null) {
                        rowMap.put(row, new HashSet<Character>());
                    }
                    if(colMap.get(col) == null) {
                        colMap.put(col, new HashSet<Character>());
                    }
                    if(gridMap.get(grid) == null) {
                        gridMap.put(grid, new HashSet<Character>());
                    }

                    if(rowMap.get(row).contains(c) || colMap.get(col).contains(c) || gridMap.get(grid).contains(c)) {
                        return false;
                    }
                    rowMap.get(row).add(c);
                    colMap.get(col).add(c);
                    gridMap.get(grid).add(c);

                }

            }
        }

        return true;
    }
}
