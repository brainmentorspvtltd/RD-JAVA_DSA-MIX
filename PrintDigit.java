public class PrintDigit {
    public static void main(String[] args) {
        // Step - 1
        // Count Digit
        int num = 12345;
        int count  = 0;
        for(int i = num;i!=0; i = i/10){
            count++;
        }
        //System.out.println(count);
        // Step-2 After Count Compute the Power
        int pow = 1;
        for(int i = 1; i<=count-1; i++){
            pow = pow * 10;
        }
       // System.out.println(pow);
        // Step-3 Logic for Print Digit
        for(int i = num; i!=0;pow = pow/10 ){
            System.out.println(i/pow);
            i = i %pow;
            
        }
    }
}
