public class W7P2 {
    public static void main(String[] args) {
        Lab7Account ac1 = new Lab7Account("George", 1122, 1000);

        ac1.deposit(30);
        ac1.deposit(40);
        ac1.deposit(50);
        ac1.withdraw(5);
        ac1.withdraw(4);
        ac1.withdraw(2);

        ac1.showInformation();
        ac1.showTransactions();
    }
}
