public class ArmStrongNumber {

    static boolean isArmStrongNumber(int org, int compute, int copy){
        // Termination Case When Compute Number is Equal to Copy Number
        // Number Ends
        if(org ==0){
            if(compute == copy){
                return true;
            }
            return false;
        }
       
        // 
        // Small Problem 
        // One Digit Cube + Sum
        // Processing Logic
        int singleDigit = org % 10;
        compute = compute + singleDigit * singleDigit * singleDigit;
        return isArmStrongNumber(org/10, compute, copy);

    }

    public static void main(String[] args) {
        int num = 100;
        boolean result =isArmStrongNumber(num, 0, num);
        System.out.println(result ?"ArmStrong Number":"Not ArmStrong Number");
    }
}
