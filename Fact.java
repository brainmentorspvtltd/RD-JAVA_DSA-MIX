public class Fact {

    static void fact(int num, int result){
        // Termination Case
        if(num == 1){
            System.out.println(result);
            return ;
        }
        // Small Problem + Cycle
        fact(num-1, num * result);
    }
    public static void main(String[] args) {
        fact(5,1);
    }
}
