public class Freq {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,5,5,6,7,8,9};
        int low = 0;
        int high = arr.length-1;
        int firstIndex = -1;
        int lastIndex = -1;
        int search = 5;
        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid]== search){
                firstIndex = mid;
                high = mid - 1;
            }
            if(search>arr[mid]){
                low = mid + 1;
            }
            else if(search<arr[mid]){
                high = mid -1;
            }
        }
        System.out.println("First Index "+firstIndex);
        low  =0;
        high =arr.length-1;
        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid]== search){
                lastIndex = mid;
                low = mid + 1;
            }
            if(search>arr[mid]){
                low = mid + 1;
            }
            else if(search<arr[mid]){
                high = mid -1;
            }
        }
        System.out.println("Last Index "+lastIndex);
        System.out.println("Frequency Count "+((lastIndex-firstIndex)+1));
    }
}
