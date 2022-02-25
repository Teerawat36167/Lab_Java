import java.util.*;

public class Lab7Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 1.65;
    private String name;
    private ArrayList<Transactions> transactions = new ArrayList<Transactions>();

    public Lab7Account() {
        
    }

    public Lab7Account(String name,int id,double balance) {
        this.id = id;
        this.balance = balance;
        this.name = name;
    }

    public String accessorName() {
        return this.name;
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

    public void mutatorName (String name) {
        this.name = name;
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
        transactions.add(new Transactions('W', amount, this.balance, ""));
    }

    public void deposit(double amount) {
        this.balance += amount;
        transactions.add(new Transactions('D', amount, this.balance, ""));
    }

    public void showInformation() {
        System.out.println("Name: "+this.name);
        System.out.println("Account ID: "+this.id);
        System.out.println("Annual interest rate: "+this.annualInterestRate);
        System.out.println("Balance: "+this.balance);
    }

    public void showTransactions() {
        System.out.println("Date                                 Type          Amount        balance");
        for (int i = 0; i < transactions.size(); i++) {
            Transactions tsList = transactions.get(i);
            System.out.println(tsList.getDateCreated() + "         " + tsList.getType() + "             " + tsList.getAmount() + "          " + tsList.getBalance());
        }
    }
}
