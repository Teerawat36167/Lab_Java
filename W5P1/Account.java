import java.sql.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    public Account() {
        System.out.println("Create account complete");
    }

    public int accessorId() {
        return this.id;
    }

    public double accessorBalance() {
        return this.balance;
    }

    public double accessorAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void mutatorId (int newId) {
        this.id = newId;
    }

    public void mutatorBalance (double newBalance) {
        this.balance = newBalance;
    }

    public void mutatorAnnualInterestRate (double newAnnualInterestRate) {
        this.annualInterestRate = newAnnualInterestRate;
    }
}
