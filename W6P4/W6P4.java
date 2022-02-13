import java.util.Scanner;

public class W6P4 {
    private static double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
    private static int[][] brackets = {
        {8350, 33950, 82250, 171550, 372950},
        {16700, 67900, 137050, 208850, 372950},
        {8350, 33950, 68525, 104425, 186475},
        {11950, 45500, 117450, 190200, 372950}
    };
    public static void main(String[] args) {
        Scanner ic = new Scanner(System.in);

        System.out.println("Filing Status");
        System.out.println("    [0]-Single filer");
        System.out.println("    [1]-Married jointly or qualifying widow(er)");
        System.out.println("    [2]-Married separately");
        System.out.println("    [3]-Head of household");

        System.out.print("Enter the filing status : ");
        int status = ic.nextInt();
        System.out.print("Enter the taxable income : ");
        double income = ic.nextDouble();

        ic.close();

        double tax = 0;
        if (income <= brackets[status][0]) {
            tax = income * rates[0];
        }
        else if (income <= brackets[status][1]) {
            tax = brackets[status][0] * rates[0] +
                (income - brackets[status][0]) * rates[1];
        }
        else if (income <= brackets[status][2]) {
            tax = brackets[status][0] * rates[0] +
                (brackets[status][1] - brackets[status][0]) * rates[1] +
                (income - brackets[status][1]) * rates[2];
        }
        else if (income <= brackets[status][3]) {
            tax = brackets[status][0] * rates[0] +
                (brackets[status][1] - brackets[status][0]) * rates[1] +
                (brackets[status][2] - brackets[status][1]) * rates[2] +
                (income - brackets[status][2]) * rates[3];
        }
        else if (income <= brackets[status][4]) {
            tax = brackets[status][0] * rates[0] +
                (brackets[status][1] - brackets[status][0]) * rates[1] +
                (brackets[status][2] - brackets[status][1]) * rates[2] +
                (brackets[status][3] - brackets[status][2]) * rates[3] +
                (income - brackets[status][3]) * rates[4];
        }
        else {
            tax = brackets[status][0] * rates[0] +
                (brackets[status][1] - brackets[status][0]) * rates[1] +
                (brackets[status][2] - brackets[status][1]) * rates[2] +
                (brackets[status][3] - brackets[status][2]) * rates[3] +
                (brackets[status][4] - brackets[status][3]) * rates[4] +
                (income - brackets[status][4]) * rates[5];
        }

        System.out.println("Tax is "+tax);
    }
}