public class MultipleLoopAnalysis {

    void func() {
        int n = 10;
        for(int i = 0; i < n; i++) {
            // Logic
        }
        for(int i = 0; i < n; i=i*2) {
            // Logic
        }
        for(int i = 0; i < 100; i++) {
            // Logic
        }
    }
    
    public static void main(String[] args) {
        
    }
}
