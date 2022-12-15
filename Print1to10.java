public class Print1to10 {
    // Print 1 to 10 Value
    static void printValue(int num){
        // Termination Condition
        if(num ==0){
            return ;
        }
        // Processing Logic
        // Small Problem
        // Stack Build
        printValue(num-1);
        // Stack Fall
        System.out.println(num);

    }
    public static void main(String[] args) {
        printValue(10);
    }
}
