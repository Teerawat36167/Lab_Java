import java.util.Scanner;

public class W6P4 {
    public static void main(String[] args) {
        Scanner ic = new Scanner(System.in);

        System.out.println("Filing Status");
        System.out.println("    [0]-Single filer");
        System.out.println("    [1]-Married jointly or qualifying widow(er)");
        System.out.println("    [2]-Married separately");
        System.out.println("    [3]-Head of household");
        
        ComputeTax t1 = new ComputeTax();

        System.out.print("Enter the filing status : ");
        int status = ic.nextInt();
        System.out.print("Enter the taxable income : ");
        double income = ic.nextDouble();

        ic.close();

        System.out.println("Tax is "+t1.tax(status, income));
    }
}