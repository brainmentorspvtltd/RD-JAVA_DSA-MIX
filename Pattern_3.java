package Recursion;

public class Pattern_3 {
    static void printStar(int col) {
        if(col == 0) {
            return;
        }
        System.out.print("*");
        printStar(col-1);
    }

    static void printPattern(int row) {
        if(row == 0) {
            return;
        }
        printStar(row);
        System.out.println();
        printPattern(row-1);
    }
    public static void main(String[] args) {
        printPattern(5);
    }
}
