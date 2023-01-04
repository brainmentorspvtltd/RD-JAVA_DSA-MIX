package Backtracking;

public class NQueen {

    static int getCount(boolean[][] board, int currentRow) {
        int count = 0;
        for(int col = 0; col < board.length; col++) {
            if(isSafeArea(board, currentRow, col)) {
                board[currentRow][col] = true;
                count += getCount(board, currentRow + 1);
                // only statement to perform backtracking
                board[currentRow][col] = false;
            }
        }
        return count;
    }

    static boolean isSafeArea(boolean[][] board, int row, int col) {
        // check if there is a queen in same column
        for(int i = row; i >= 0; i--) {
            if(board[i][col]) {
                return false;
            }
        }

        // check if there is a queen in upper left diagonal
        for(int i = row, j = col; i >= 0 && j>= 0; i--, j--) {
            if(board[i][j]) {
                return false;
            }
        }

        // check if there is a queen in upper right diagonal
        for(int i = row, j = col; i >= 0 && j <= board.length; i--, j++) {
            if(board[i][j]) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        getCount(board, 0);
    }
}
