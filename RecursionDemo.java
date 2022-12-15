public class RecursionDemo {
    static void show(int num){
        // To Stop a Cycle
        // Termination Case
        if(num>5){
            return ;
        }
        // Logic (Processing Logic)
        System.out.println("Amit..."); // Logic
        // num + 1 (Small Problem)
        // Put the small problem in Cycle (Recursion)
        show(num+1); // Cycle
    }
    public static void main(String[] args) {
        show(1);
    }
}
