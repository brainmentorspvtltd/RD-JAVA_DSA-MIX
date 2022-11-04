public class Program {
    static int x;
    static int fun() {
        return x--;
    }

    public static void main(String[] args) {
        while(fun()) {
            int y = fun();
            System.out.println(y);
        }
    }
}
