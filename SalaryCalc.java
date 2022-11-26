import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class SalaryCalc {
    public static void main(String[] args) {
        // /t /n
        final int MONTHS = 12;
        double tax = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Basic Salary");
        int basicSalary= scanner.nextInt();
        double hra = basicSalary * 0.50;
        double da = basicSalary * 0.15;
        double ta = basicSalary * 0.40;
        double ma = basicSalary * 0.25;
        double pf = basicSalary * 0.10;
        double grossSalary = basicSalary + hra + da + ta + ma ;
        double annualSalary = grossSalary * MONTHS;
        if(annualSalary>=500000 && annualSalary<800000){
            tax = 0.10;
        }
        else if (annualSalary>=800000 && annualSalary<1000000 ){
            tax = 0.20;
        }
        else if (annualSalary>=1000000){
            tax = 0.30;
        }
        if(tax>0){
        tax = grossSalary * tax;
        }
        double netSalary = grossSalary - tax - pf;
        System.out.println("********  Salary SLIP ********");
        // Formatting Code
        Locale locale = new Locale("fr", "FR");
        NumberFormat nf =NumberFormat.getCurrencyInstance(locale);
        System.out.println("Basic Salary "+nf.format(basicSalary));
        System.out.println("HRA  "+hra);
        System.out.println("DA  "+da);
        System.out.println("TA   "+ta);
        System.out.println("MA   "+ma);
        System.out.println("PF   "+pf);
        System.out.println("Tax "+tax);
        System.out.println("GS  "+grossSalary);
        System.out.println("NS "+netSalary);
        scanner.close();
        //System.out.println(netSalary);

    }
}
