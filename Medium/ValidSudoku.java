//Leetcode 36 : Valid Sudoku
//Topic : Array, Hash Table, Matrix
package Medium;

import java.util.HashSet;

class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Integer> seen = new HashSet<>();
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char val = board[r][c];
                if (val == '.') continue;  
                int num = val - '0';  // Convert char to integer (e.g., '5' → 5)
                int u = (r / 3) * 3 + (c / 3);  
                // Create unique integer keys for row, column, and box
                int rowKey = num * 10 + r;
                int colKey = num * 100 + c;
                int unitKey = num * 1000 + u;
                if (!seen.add(rowKey) || !seen.add(colKey) || !seen.add(unitKey)) {
                    return false;  
                }
            }
        }
        return true;  
    }
}
