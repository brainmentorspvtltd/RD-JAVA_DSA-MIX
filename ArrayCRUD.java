import java.util.Scanner;

public class ArrayCRUD {
    
    int arr[];
    int currentSize;
    public ArrayCRUD(int capacity) {
        this.arr = new int[capacity];
        this.currentSize = 0;
    }

    void insert(int index, int item) {
        if(index > currentSize) {
            throw new RuntimeException("Position can't be greater then current size");
        }

        if(currentSize == arr.length) {
            System.out.println("Array is full...Can't add more elements...");
        }
        arr[index] = item;
        currentSize++;
        System.out.println("Element Added...");
    }

    void delete(int index) {
        if(currentSize == 0) {
            System.out.println("Array is empty...");
            return;
        }

        for(int i = index; i < currentSize; i++) {
            arr[i] = arr[i + 1];
        }
        arr[currentSize - 1] = 0;
        currentSize--;
        System.out.println("Element Deleted...");
        print();

    }

    void print() {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int n = scanner.nextInt();
        ArrayCRUD obj = new ArrayCRUD(n);
        int choice;
        int index;
        int item;
        while(true) {
            System.out.println("Array Operations : ");
            System.out.println("1. Press 1 to insert element in array");
            System.out.println("2. Press 2 to delete element in array");
            System.out.println("3. Press 3 to update element in array");
            System.out.println("4. Press 4 to print elements in array");
            System.out.println("5. Press 5 to search element in array");
            System.out.println("6. Press 6 to exit");
            choice = scanner.nextInt();
            ArrayOperations enumChoice = ArrayOperations.values()[choice-1];
            switch(enumChoice) {
                case INSERT:
                    System.out.println("Enter the index : ");
                    index = scanner.nextInt();
                    System.out.println("Enter the item : ");
                    item = scanner.nextInt();
                    obj.insert(index, item);
                    break;
                case DELETE:
                    break;
                case EXIT:
                    return;
                default:
                    System.out.println("Invalid Choice...");
            }
        }

        // scanner.close();

    }
}

enum ArrayOperations {
    INSERT, DELETE, UPDATE, SEARCH, PRINT, EXIT;
}