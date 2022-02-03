import java.util.Scanner;

public class W6P4 {
    public static void main(String[] args) {
        Scanner ic = new Scanner(System.in);
        ComputeTax t1 = new ComputeTax();

        System.out.print("Enter the filing status : ");
        int status = ic.nextInt();
        System.out.print("Enter the taxable income : ");
        int income = ic.nextInt();

        ic.close();

        System.out.println("Tax is "+t1.tax(status, income));
    }
}