package Recursion;

public class Pattern_1 {

    static void printStar(int col) {
        if(col == 5) {
            return;
        }
        System.out.print("*");
        printStar(col+1);
    }

    static void printPattern(int row, int col) {
        if(row == 0) {
            return;
        }
        printStar(col);
        System.out.println();
        printPattern(row-1, col);
    }

    public static void main(String[] args) {
        printPattern(5,0);
    }
}
