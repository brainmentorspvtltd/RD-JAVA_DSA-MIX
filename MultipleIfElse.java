import java.util.Scanner;

public class MultipleIfElse {

    public static void main(String[] args) {
        System.out.println("1. Drinks");
        System.out.println("2. Sweets");
        System.out.println("3. Snacks");
        System.out.println("Enter the Choice");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if(choice == 1){
            System.out.println("Drinks Pepsi");
        }
        else if(choice == 2){
            System.out.println("Sweets Choclates");
        }
        else if (choice == 3){
            System.out.println("Snack Chips");
        }
        else{
            System.out.println("Wrong Choice...");
        }
        scanner.close();
    }
    
}
