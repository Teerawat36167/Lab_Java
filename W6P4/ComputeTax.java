public class ComputeTax {

    private double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
    private int[][] brackets = {
        {8350, 33950, 82250, 171550, 372950},
        {16700, 67900, 137050, 208850, 372950},
        {8350, 33950, 68525, 104425, 186475},
        {11950, 45500, 117450, 190200, 372950}
    };

    public double tax(int i, Double income) {
        double tax = 0;
        if (income <= brackets[i][0]) {
            tax = income * rates[0];
        }
        else if (income <= brackets[i][1]) {
            tax = brackets[i][0] * rates[0] +
                (income - brackets[i][0]) * rates[1];
        }
        else if (income <= brackets[i][2]) {
            tax = brackets[i][0] * rates[0] +
                (brackets[i][1] - brackets[i][0]) * rates[1] +
                (income - brackets[i][1]) * rates[2];
        }
        else if (income <= brackets[i][3]) {
            tax = brackets[i][0] * rates[0] +
                (brackets[i][1] - brackets[i][0]) * rates[1] +
                (brackets[i][2] - brackets[i][1]) * rates[2] +
                (income - brackets[i][2]) * rates[3];
        }
        else if (income <= brackets[i][4]) {
            tax = brackets[i][0] * rates[0] +
                (brackets[i][1] - brackets[i][0]) * rates[1] +
                (brackets[i][2] - brackets[i][1]) * rates[2] +
                (brackets[i][3] - brackets[i][2]) * rates[3] +
                (income - brackets[i][3]) * rates[4];
        }
        else {
            tax = brackets[i][0] * rates[0] +
                (brackets[i][1] - brackets[i][0]) * rates[1] +
                (brackets[i][2] - brackets[i][1]) * rates[2] +
                (brackets[i][3] - brackets[i][2]) * rates[3] +
                (brackets[i][4] - brackets[i][3]) * rates[4] +
                (income - brackets[i][4]) * rates[5];
        }
        return tax;
    }
}