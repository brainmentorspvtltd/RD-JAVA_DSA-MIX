package ArraysProblems;

public class P18_LeaderElement {
    public static void main(String[] args) {
        int arr[] = {10,12,34,30,23,6,14,10};
        int n = arr.length;
        int max = 0;
        for(int i = n - 1; i >= 0; i--) {
            if(arr[i] > max) {
                System.out.println("Leader Element : " + arr[i]);
                max = arr[i];
            }
        }
    }
}