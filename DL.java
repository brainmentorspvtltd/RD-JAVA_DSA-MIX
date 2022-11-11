import java.util.Scanner;

public class DL {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int age;
    System.out.println("Enter the Age");
    
     age = scanner.nextInt();
    //int age =21;
    if(age>=18){
        System.out.println("......U can apply for DL");
    }
    else{
        System.out.println("Can't Apply for DL");
    }
    scanner.close();
 }   
}
