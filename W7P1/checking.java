public class checking extends Accounts{

    private double overdraftLimit ;

    public checking() {
        super();
    }

    public checking(int id,double balance,double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
        System.out.println("OverdraftLimit : " + overdraftLimit);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= super.accessorBalance()+overdraftLimit) {
            super.mutatorBalance(super.accessorBalance()-amount);
            System.out.println("Withdraw : "  + amount);
        }
        else {
            System.out.println("Withdraw error : Account limit exceeded");
        }
    }
}
