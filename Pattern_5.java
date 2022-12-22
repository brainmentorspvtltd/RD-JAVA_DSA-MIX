package Recursion;

public class Pattern_5 {
    static void printSpace(int space) {
        if(space == 0) {
            return;
        }
        System.out.print(" ");
        printSpace(space-1);
    }
    static void printStar(int col) {
        if(col == 0) {
            return;
        }
        System.out.print("*");
        printStar(col-1);
    }

    static void printPattern(int row, int col) {
        if(row == 0) {
            return;
        }
        printSpace(col);
        printStar(2 * row - 1);
        System.out.println();
        printPattern(row-1, col+1);
    }
    public static void main(String[] args) {
        printPattern(5, 1);
    }
}
