public class CountDigit {

    static void countDigit(int num, int count){
        // Termination Case
        if(num==0){
            System.out.println(count);
            return ; 
        }
        // Small Problem + Cycle
        countDigit(num/10, count+1);
    }
    public static void main(String[] args) {
        countDigit(78543, 0);
    }
}
