package Backtracking;

public class SudokuSolver {

    static int board[][] = {
        {5,3,0,0,7,0,0,0,0},
        {6,0,0,1,9,5,0,0,0},
        {0,9,8,0,0,0,0,6,0},
        {8,0,0,0,6,0,0,0,3},
        {4,0,0,8,0,3,0,0,1},
        {7,0,0,0,2,0,0,0,6},
        {0,6,0,0,0,0,2,8,0},
        {0,0,0,4,1,9,0,0,5},
        {0,0,0,0,8,0,0,7,9}
    };
    static int MAX_SIZE = 9;

    static boolean solver(int row, int col) {

        // Move to the next row
        if(col == MAX_SIZE) {
            row = row + 1;
            col = 0;
        }

        // Base Case
        if(row == MAX_SIZE) {
            display();
            return true;
        }
        

        // check if cell is not zero
        if(board[row][col] != 0) {
            return solver(row, col + 1);
        }

        for(int i = 1; i <= MAX_SIZE; i++) {
            // check if we can place ith element in board
            if(isSafe(row, col, i)) {
                board[row][col] = i;
                boolean res = solver(row, col + 1);
                if(res) {
                    return true;
                }
                // Backtracking
                board[row][col] = 0;
            }
        }

        return false;
    }

    static boolean isPresentInRow(int row, int data) {
        for(int col = 0; col < MAX_SIZE; col++) {
            if(board[row][col] == data) {
                return true;
            }
        }
        return false;
    }

    static boolean isPresentInCol(int col, int data) {
        for(int row = 0; row < MAX_SIZE; row++) {
            if(board[row][col] == data) {
                return true;
            }
        }
        return false;
    }

    static boolean isPresentInGrid(int row, int col, int data) {
        int r = row - row % 3;
        int c = col - col % 3;
        for(int i = r; i < r + 3; i++) {
            for(int j = c; j < c + 3; j++) {
                if(board[i][j] == data) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean isSafe(int row, int col, int data) {
        return !isPresentInRow(row, data) && !isPresentInCol(col, data) && !isPresentInGrid(row, col, data);
    }

    static void display() {
        for(int i = 0; i < MAX_SIZE; i++) {
            for(int j = 0; j < MAX_SIZE; j++) {
                System.out.print(board[i][j] + ",");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solver(0, 0);
    }
}
