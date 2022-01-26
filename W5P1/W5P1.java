public class W5P1 {
    public static void main(String[] args) {
        Account ac1 = new Account(1122,20000);
        ac1.mutatorAnnualInterestRate(4.5);
        ac1.withdraw(2500);
        ac1.deposit(3000);
        System.out.println("Balance = "+ac1.accessorBalance()+"$");
        System.out.println("Monthly interest = "+ac1.getMonthlyInterest());
        System.out.println("Date = "+ac1.accessorDateCreated());
    }
}
