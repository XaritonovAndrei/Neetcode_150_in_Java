package com.problem_solving.Needcode150.Arrays_and_Hashing;


import java.util.HashSet;

public class ValidSudoku {

    public static void main(String[] args) {
        char[][] board =
            {{'5','3','.','.','7','.','.','.','.'}
            ,{'6','.','.','1','9','5','.','.','.'}
            ,{'.','9','8','.','.','.','.','6','.'}
            ,{'8','.','.','.','6','.','.','.','3'}
            ,{'4','.','.','8','.','3','.','.','1'}
            ,{'7','.','.','.','2','.','.','.','6'}
            ,{'.','6','.','.','.','.','2','8','.'}
            ,{'.','.','.','4','1','9','.','.','5'}
            ,{'.','.','.','.','8','.','.','7','9'}};

        System.out.println(sudokuValidation(board));
    }

    public static boolean sudokuValidation(char[][] board) {
        int n = board.length;

        // hash set for each row, column and box
        HashSet<Character>[] rows = new HashSet[n];
        HashSet<Character>[] cols = new HashSet[n];
        HashSet<Character>[] boxes = new HashSet[n];

        for (int r = 0; r < n; r++) {
            rows[r] = new HashSet<Character>();
            cols[r] = new HashSet<Character>();
            boxes[r] = new HashSet<Character>();
        }

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {

                //character at current cell
                char value = board[r][c];

                // skipping dots
                if (value == '.') {
                    continue;
                }

                // Checking for duplicate in row
                if (rows[r].contains(value)) {
                    return false;
                }
                rows[r].add(value);

                // Checking for duplicate in column
                if (cols[c].contains(value)) {
                    return false;
                }
                cols[c].add(value);

                // Checking for duplicate in box
                int boxID = (r / 3) * 3 + c / 3;
                if (boxes[boxID].contains(value)) {
                    return false;
                }
                boxes[boxID].add(value);
            }
        }
        return true;
    }
}
