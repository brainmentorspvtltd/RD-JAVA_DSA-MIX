package ArraysProblems;

public class P5_IsArraySorted {

    static void isSortedApproach_1(int arr[], int n) {
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr[i] > arr[j]) {
                    System.out.println("Array is not sorted...");
                    return;
                }
            }
        }
        System.out.println("Yes Sorted...");
    }

    static void isSortedApproach_2(int arr[], int n) {
        for(int i = 1; i < n; i++) {
            if(arr[i-1] > arr[i]) {
                System.out.println("Array is not sorted...");
                return;
            }
        }
        System.out.println("Array is Sorted...");
    }

    public static void main(String[] args) {
        
    }    
}
