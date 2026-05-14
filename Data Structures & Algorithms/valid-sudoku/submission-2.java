class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Set<Character> rowSet = new HashSet<>();
        Map<Integer, HashSet<Character>> colMap = new HashMap<>();
        Map<Integer, HashSet<Character>> gridMap = new HashMap<>();

        for(int r = 0; r < board.length; r++) {
            for(int c = 0; c < board[0].length; c++) {
                
                boolean isNum = (board[r][c] != '.');
                char curr = board[r][c];
                int rGrid = r/3;
                int cGrid = c/3;

                
                if(isNum) {

                    //row logic
                    if(rowSet.contains(curr)) {
                        return false;
                    }
                    else {
                        rowSet.add(curr);
                    }

                    //col logic
                    if(colMap.keySet().contains(c)) { 
                        if(colMap.get(c).contains(curr)) {
                            return false;
                        }
                    }
                    else {
                        colMap.put(c, new HashSet<Character>());
                    }
                    colMap.get(c).add(curr);


                    //grid logic
                    if(rGrid == 0) {
                        if(cGrid == 0) {
                            
                            if(gridMap.keySet().contains(0)) {
                                if(gridMap.get(0).contains(curr)) { return false; }
                            }
                            else {
                                gridMap.put(0, new HashSet<Character>());
                            }
                            gridMap.get(0).add(curr);

                        }
                        else if(cGrid == 1) {
                            if(gridMap.keySet().contains(1)) {
                                if(gridMap.get(1).contains(curr)) { return false; }
                            }
                            else {
                                gridMap.put(1, new HashSet<Character>());
                            }
                            gridMap.get(1).add(curr);
                        }
                        else {
                            if(gridMap.keySet().contains(2)) {
                                if(gridMap.get(2).contains(curr)) { return false; }
                            }
                            else {
                                gridMap.put(2, new HashSet<Character>());
                            }
                            gridMap.get(2).add(curr);
                        }
                    }
                    else if(rGrid == 1) {
                        if(cGrid == 0) {
                            if(gridMap.keySet().contains(3)) {
                                if(gridMap.get(3).contains(curr)) { return false; }
                            }
                            else {
                                gridMap.put(3, new HashSet<Character>());
                            }
                            gridMap.get(3).add(curr);
                        }
                        else if(cGrid == 1) {
                            if(gridMap.keySet().contains(4)) {
                                if(gridMap.get(4).contains(curr)) { return false; }
                            }
                            else {
                                gridMap.put(4, new HashSet<Character>());
                            }
                            gridMap.get(4).add(curr);
                        }
                        else {
                            if(gridMap.keySet().contains(5)) {
                                if(gridMap.get(5).contains(curr)) { return false; }
                            }
                            else {
                                gridMap.put(5, new HashSet<Character>());
                            }
                            gridMap.get(5).add(curr);
                        }
                    }
                    else {
                        if(cGrid == 0) {
                            if(gridMap.keySet().contains(6)) {
                                if(gridMap.get(6).contains(curr)) { return false; }
                            }
                            else {
                                gridMap.put(6, new HashSet<Character>());
                            }
                            gridMap.get(6).add(curr);
                        }
                        else if(cGrid == 1) {
                            if(gridMap.keySet().contains(7)) {
                                if(gridMap.get(7).contains(curr)) { return false; }
                            }
                            else {
                                gridMap.put(7, new HashSet<Character>());
                            }
                            gridMap.get(7).add(curr);
                        }
                        else {
                            if(gridMap.keySet().contains(8)) {
                                if(gridMap.get(8).contains(curr)) { return false; }
                            }
                            else {
                                gridMap.put(8, new HashSet<Character>());
                            }
                            gridMap.get(8).add(curr);
                        }
                    }


                }
            

            }
            rowSet.clear();

            //STATE: EXITED LOOP, NOT FOUND DUPLICATES, VALID BOARD
            
        }
        return true;
    }
}
