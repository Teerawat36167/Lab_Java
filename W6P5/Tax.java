public class Tax {

    private int filingStatus;
    private int[][] brackets = new int[4][5];
    private double[] rates = new double[6];
    private double taxableIncome;

    public Tax() {
        System.out.println("Filing Status");
        System.out.println("    [0]-Single filer");
        System.out.println("    [1]-Married jointly or qualifying widow(er)");
        System.out.println("    [2]-Married separately");
        System.out.println("    [3]-Head of household");
    }

    public Tax(int filingStatus,int[][] brackets,double[] rates,double taxableIncome) {
        this.filingStatus = filingStatus;
        this.taxableIncome = taxableIncome;
        this.rates = rates;
        this.brackets = brackets;
    }

    public int getFilingStatus() {
        return this.filingStatus;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public double getTaxable() {
        return this.taxableIncome;
    }

    public void setTaxable(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public int[][] getBrackets() {
        return this.brackets;
    }

    public void setBrackets(int i,int j,int brackets) {
        this.brackets[i][j] = brackets;
    }

    public double[] getRates() {
        return this.rates;
    }

    public void setRates(int i,double rates) {
        this.rates[i] = rates;
    }

    public double getTax() {
        double tax = 0;
        if (taxableIncome <= brackets[filingStatus][0]) {
            tax = taxableIncome * rates[0];
        }
        else if (taxableIncome <= brackets[filingStatus][1]) {
            tax = brackets[filingStatus][0] * rates[0] +
                (taxableIncome - brackets[filingStatus][0]) * rates[1];
        }
        else if (taxableIncome <= brackets[filingStatus][2]) {
            tax = brackets[filingStatus][0] * rates[0] +
                (brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1] +
                (taxableIncome - brackets[filingStatus][1]) * rates[2];
        }
        else if (taxableIncome <= brackets[filingStatus][3]) {
            tax = brackets[filingStatus][0] * rates[0] +
                (brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1] +
                (brackets[filingStatus][2] - brackets[filingStatus][1]) * rates[2] +
                (taxableIncome - brackets[filingStatus][2]) * rates[3];
        }
        else if (taxableIncome <= brackets[filingStatus][4]) {
            tax = brackets[filingStatus][0] * rates[0] +
                (brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1] +
                (brackets[filingStatus][2] - brackets[filingStatus][1]) * rates[2] +
                (brackets[filingStatus][3] - brackets[filingStatus][2]) * rates[3] +
                (taxableIncome - brackets[filingStatus][3]) * rates[4];
        }
        else {
            tax = brackets[filingStatus][0] * rates[0] +
                (brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1] +
                (brackets[filingStatus][2] - brackets[filingStatus][1]) * rates[2] +
                (brackets[filingStatus][3] - brackets[filingStatus][2]) * rates[3] +
                (brackets[filingStatus][4] - brackets[filingStatus][3]) * rates[4] +
                (taxableIncome - brackets[filingStatus][4]) * rates[5];
        }
        return tax;
    }
}
