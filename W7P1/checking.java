import java.util.*;

public class checking extends Accounts{

    private double overdraftLimit ;

    public checking() {
        dateCreated = new Date();
    }

    public checking(int id,double balance,double overdraftLimit) {
        System.out.println("Checking Account");
        System.out.println("Overdraft Limit: " + overdraftLimit);
        System.out.println("Balance is " + balance);
        this.id = id;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
        dateCreated = new Date();
    }

    public void withdraw(double amount) {
        if (amount <= balance+overdraftLimit) {
            this.balance -= amount;
            System.out.println("Withdraw : "  + amount);
        }
        else {
            System.out.println("Withdraw error : Account limit exceeded");
        }
    }

    public String toString() {
        return  "Balance is " + balance + "\n" +
                "This account was created at " + dateCreated;
    }
}
