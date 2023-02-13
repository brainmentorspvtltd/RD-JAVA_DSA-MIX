public class Intro {

    void approach_1() {
        int n = 5;
        int count = 0;
        for(int i = 0; i < n; i++ ){
            count += i;
        }
    }

    int approach_2(int n) {
        return n * (n + 1) / 2;
    }

    int approach_3(int n) {
        int sum = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 1; j <= i; j++) {
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        
    }
}