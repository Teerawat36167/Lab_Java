public class ComputeTax {

    private double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.36};
    private int[][] brackets = {
        {8350, 33950, 82250, 171550, 372950},
        {16700, 67900, 137050, 208850, 372950},
        {8350, 33950, 68525, 104425, 186475},
        {11950, 45500, 117450, 190200, 372950}
    };

    public ComputeTax() {
        System.out.println("Filing Status");
        System.out.println("    [0]-Single filer");
        System.out.println("    [1]-Married jointly or qualifying widow(er)");
        System.out.println("    [2]-Married separately");
        System.out.println("    [3]-Head of household");
    }

    public double tax(int i, int income) {
        double tax = brackets[i][0] * rates[0] +
                    (brackets[i][1] - brackets[i][0]) * rates[1] +
                    (brackets[i][2] - brackets[i][1]) * rates[2] +
                    (brackets[i][3] - brackets[i][2]) * rates[3] +
                    (brackets[i][4] - brackets[i][3]) * rates[4] +
                    (income - brackets[i][4]) * rates[5];
        return tax;
    }
}