package Recursion;

public class MultiBranchDemo_2 {
    static void show(int n) {
        if(n > 0) {
            System.out.println(n);
            show(n - 1);
            show(n - 2);
        }
    }
    public static void main(String[] args) {
        show(3);
    }
}
