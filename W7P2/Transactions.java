import java.util.*;

public class Transactions {
    private Date dateCreated;
    private char type;
    private Double amount;
    private Double balance;
    private String description;

    public Transactions(char type,double amount,double balance,String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        dateCreated = new Date();
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public char getType() {
        return this.type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getBalance() {
        return this.balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
