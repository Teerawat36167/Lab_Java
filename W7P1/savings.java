import java.util.*;

public class savings extends Accounts{
    public savings() {
        dateCreated = new Date();
    }

    public savings(int id,double balance) {
        System.out.println("Savings Account");
        System.out.println("Balance is " + balance);
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }
}
