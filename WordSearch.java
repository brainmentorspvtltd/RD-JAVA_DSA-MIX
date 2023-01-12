package Backtracking;

public class WordSearch {
    static char board[][] = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
    
    static boolean exists(String word) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(isMatch(i, j, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean isMatch(int row, int col, String word) {

        if(board[row][col] != word.charAt(0)) {
            return false;
        }

        int directions[][] = {
            {0,1},      // right
            {1,0},      // down
            {0,-1},     // left
            {-1,0}      // top
        };

        for(int direction = 0; direction < directions.length; direction++) {
            int rowDirection = directions[direction][0];
            int colDirection = directions[direction][1];
            isMatch(row + rowDirection, col + colDirection, word.substring(1));
        }

        return false;
    }

    public static void main(String[] args) {
        
    }
}
