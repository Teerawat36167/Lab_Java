import java.util.*;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    public Account() {
        dateCreated = new Date();
    }

    public Account(int id,double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
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

    public Date accessorDateCreated() {
        return this.dateCreated;
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

    public double getMonthlyInterestRate() {
        return (this.annualInterestRate/12)/100;
    }

    public double getMonthlyInterest() {
        return this.balance*getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
}
