public class ArrayLowestAndHighestNearToSearch {
    public static void main(String[] args) {
        int arr[] = {10,15,16,20,30,40,42,44,46,50,60,70,80,90};
        int search = 17;
        int low = 0;
        int lowest = 0;
        int highest = 0;
        int high = arr.length-1;
        int i = 0;
        while(i<arr.length){
        //while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid]==search){
                lowest = highest = search;
                return ;
            }
            else if (search>arr[mid]){
                lowest = arr[mid];
                low = mid + 1;
            }
            else if(search<arr[mid]){
                highest = arr[mid];
                high = mid -1; 
            }
            i++;
        }
        System.out.println("Lowest "+lowest);
        System.out.println("Highest "+highest);

    }
}
