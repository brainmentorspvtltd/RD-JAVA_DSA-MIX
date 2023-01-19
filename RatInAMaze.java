package Backtracking;

public class RatInAMaze {
    static boolean flag = false;

    static void print(int result[][]) {
        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + ",");
            }
            System.out.println();
        }
    }

    static void mazeSolver(int [][]maze) {
        int m = maze.length;    // number of rows
        int n = maze[0].length; // number of cols
        int result[][] = new int[m][n];
        boolean output = helper(maze, result, 0, 0);
        // if(output) {
        //     print(result);
        // }
        print(result);
        
    }

    static boolean helper(int maze[][], int result[][], int x, int y) {
        // Base Case
        // Reached Destination
        if(x == maze.length - 1 && y == maze[0].length) {
            return true;
        }

        if(isSafe(maze, x, y)) {
            result[x][y] = 1;
            flag = helper(maze, result, x + 1, y);
            if(flag) {
                return true;
            }
            flag = helper(maze, result, x, y + 1);
            if(flag) {
                return true;
            }
            // Backtracking
            result[x][y] = 0;
            return false;
        }
        return false;
    }

    static boolean isSafe(int [][]maze, int x, int y) {
        return x < maze.length && y < maze[0].length && maze[x][y] == 1;
    }

    public static void main(String[] args) {
        int maze[][] = {
            {1,0,0,0},
            {1,1,0,0},
            {0,1,0,0},
            {1,1,1,1}
        };
        mazeSolver(maze);
    }
}