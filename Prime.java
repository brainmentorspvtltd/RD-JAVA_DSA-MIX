import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = scanner.nextInt();
        int count = 0;
        for(int i = 2 ; i<=num-1; i++){
            if(num%i==0){
                count++;
            }
        }
        System.out.println(count>0?"Not a Prime Number":"Prime Number");
        scanner.close();
        // if(count>2){
        //     System.out.println("Not a Prime Number");
        // }
        // else{
        //     System.out.println("Prime Number");
        // }
    }
}
