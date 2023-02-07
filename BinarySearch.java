public class BinarySearch {
    public static void main(String[] args) {
        int arr []= {10,20,30,40,50,60};
        int low = 0;
        int high = arr.length-1;
        int search = 20;
        while(low<= high){
            int mid = (low + high)/2;
            if(arr[mid] == search){
                System.out.println("Element Found ");
                return ;
            }
            else
            if(search>arr[mid]){
                low = mid + 1;
            }
            else if(search<arr[mid]){
                high = mid-1;
            }
        }
        System.out.println("Not Found...");
        
    }
}
