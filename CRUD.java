package Arrays1D;

public class CRUD {

    int currentSize;
    int arr[];
    // Constructor
    CRUD(int capacity) {
        this.arr = new int[capacity];
        currentSize = 0;
    }

    void insert(int index, int data) {

        if(index > currentSize) {
            System.out.println("Index cannot be greater than current Size...");
            return;
        }

        if(currentSize == arr.length) {
            System.out.println("Array is full...Can't add more elements...");
            return;
        }

        for(int i = currentSize - 1; i >= index; i--) {
            arr[i+1] = arr[i];
        }

        arr[index] = data;
        currentSize++;
        System.out.println("Element Added...");
    }

    void delete(int index) {

        if(currentSize == 0) {
            System.out.println("Array is Empty...");
            return;
        }

        for(int i = index; i < currentSize - 1; i++) {
            arr[i] = arr[i+1];
        }
        arr[currentSize - 1] = 0;
        currentSize--;
        System.out.println("Element Removed...");
    }

    void update(int index, int data) {

    }

    void read() {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    void search(int data) {

    }

    public static void main(String[] args) {
        CRUD obj = new CRUD(8);
        obj.insert(0, 10);
        obj.insert(1, 20);
        obj.insert(2, 11);
        obj.insert(3, 7);
        obj.insert(4, 17);
        obj.insert(2, 9);
        obj.read();
    }
}
