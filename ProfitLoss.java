import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Cost Price");
        int cp = scanner.nextInt();
        System.out.println("Enter the Selling Price");
        int sp = scanner.nextInt();
        int val = sp - cp;
        if(val>0){
            System.out.println("Profit "+val);
        }
        else{
            System.out.println("Loss "+val);
        }
        scanner.close();
    }
}
