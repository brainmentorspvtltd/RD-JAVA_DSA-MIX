package Recursion;

public class FibSeries {
    // static int fib(int n) {
    //     int result = 0;
    //     int first = 0;
    //     int second = 1;
    //     for(int i = 1; i < n; i++) {
    //         result = first + second;
    //         first = second;
    //         second = result;
    //     }
    //     return result;
    // }

    static int fib(int n) {
        if(n <= 1) {
            return n;
        }
        int first = fib(n - 1);
        int second = fib(n - 2);
        int result = first + second;
        return result;
    }
    public static void main(String[] args) {
        System.out.println(fib(5));
    }    
}
