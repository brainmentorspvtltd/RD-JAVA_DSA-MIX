package ArraysProblems;

public class P16_DNF {
    static int arr[] = {0,1,1,1,2,2,0,0,1,2,2};
    static void swap(int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {
        int low = 0, mid = 0;
        int high = arr.length-1;
        while(mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                swap(mid, high);
                high--;
                break;
                default:
                    break;
            }
        }
    }
}
