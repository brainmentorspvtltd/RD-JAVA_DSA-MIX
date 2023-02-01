package Arrays1D;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class PairSum {

    // First Approach - TC : O(n^2)
    static void appraoch_1(int arr[], int k) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if(sum == k) {
                    System.out.println("Pair Found " + arr[i] + "," + arr[j]);
                    return;
                }
            }
        }
    }

    // Second Approach - TC : O(n), SC : O(n)
    static void appraoch_2(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int element : arr) {
            if(map.get(element) == null) {
                map.put(k - element, element);
            }
            else {
                System.out.println("Pair Found" + map.get(element) + "," + element);
                return;
            }
        }
    }

    // Optimized Approach
    // Sort + Two Pointer
    static void appraoch_3(int arr[], int k) {
        // int arr[] = {2,9,4,6,3,10,5};
        Arrays.sort(arr);
        // arr[] = {2,3,4,5,6,9,10};
        int first = 0;
        int last = arr.length - 1;
        while(first < last) {
            if(arr[first] + arr[last] == k) {
                System.out.println("Pair Found : " + arr[first] + "," + arr[last]);
                return;
            }
            if(arr[first] + arr[last] < k) {
                first++;
            }
            else if(arr[first] + arr[last] > k) {
                last--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,9,4,6,3,10,5};
        int k = 16;
        appraoch_1(arr, k);
    }
}
