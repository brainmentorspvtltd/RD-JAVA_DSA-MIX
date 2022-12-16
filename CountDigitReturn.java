public class CountDigitReturn {
    /*
     * Recursion - Fn Call ItSelf.
     * Repeat
     */
    static int countDigit(int num, int count){
        if(num == 0){
            return count;
        }
        // Small Problem
        return countDigit(num/10, count + 1);
        // int r = countDigit(num/10, count + 1);
        // return r;
    }
    static int countDigit(int num){
        if(num ==0){
            return 0;
        }
        return 1 + countDigit(num/10);
    //    int r = countDigit(num/10);
    //    return ++r;
    }
    public static void main(String[] args) {
        System.out.println(countDigit(76543));
        // int  e= countDigit(76432, 0);
        // System.out.println(e);
    }
}
