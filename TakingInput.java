import java.io.IOException;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter your name : ");
        // will read one character at a time and returns ASCII of that character
        // int x = System.in.read();

        // Scanner is a pre-defined class
        // Scanner act as a Buffer that stores input
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        String name = sc.next();

        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        System.out.println("Name is : " + name);
        System.out.println("Age is : " + age);

        sc.close();
    }
}
