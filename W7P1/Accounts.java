import java.util.*;

public class Accounts {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    public Accounts() {
        dateCreated = new Date();
    }

    public Accounts(int id,double balance) {
        System.out.println("Balance is " + balance);
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

    public void withdraw(double amount) {
        this.balance -= amount;
        System.out.println("Withdraw : "  + amount);
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public String toString() {
        return  "Balance is " + balance + "\n" +
                "This account was created at " + dateCreated;
    }
}