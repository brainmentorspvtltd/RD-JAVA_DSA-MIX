public class LoopAnalysis {
    public static void main(String[] args) {

        int n = 10, c=2;
        // TC : O(n)
        for(int i = 0; i < n; i++) {
            // Logic
        }

        // this loop will execute till n/c times
        // TC : O(n)
        for(int i = 0; i < n; i+=c) {
            // Logic
        }

        // this loop will execute till n/c times
        // TC : O(n)
        for(int i = n; i > 0; i-=c) {
            // Logic
        }

        // TC : O(logn)
        for(int i = 1; i < n; i*=c) {
            // Logic
        }

        // TC : O(logn)
        for(int i = n; i > 1; i/=c) {
            // Logic
        }

        

    }
}
