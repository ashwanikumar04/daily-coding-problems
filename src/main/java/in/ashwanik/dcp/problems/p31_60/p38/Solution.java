package in.ashwanik.dcp.problems.p31_60.p38;

class Solution {
    private int count;

    int numberOfSolutions(int numberOfQueens) {
        boolean[][] board = new boolean[numberOfQueens][numberOfQueens];
        solveNQueen(board, 0, numberOfQueens);
        return count;
    }

    private void solveNQueen(boolean[][] board, int column, int numberOfQueens) {
        if (column >= numberOfQueens) {
            count++;
        }

        for (int row = 0; row < numberOfQueens; row++) {
            if (isValid(board, row, column)) {
                board[row][column] = true;
                solveNQueen(board, column + 1, numberOfQueens);
                board[row][column] = false;
            }
        }
    }

    private boolean isValid(boolean[][] board, int row, int col) {
        int i;
        int j;

        //check row
        for (int c = 0; c < col; c++) {
            if (board[row][c]) {
                return false;
            }
        }

        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }

        for (i = row, j = col; i < board.length && j >= 0; i++, j--) {
            if (board[i][j]) {
                return false;
            }
        }
        return true;
    }
}


