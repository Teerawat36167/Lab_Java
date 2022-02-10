public class W7P1 {
    public static void main(String[] args) {
        Accounts ac1 = new Accounts(0,1000);
        ac1.withdraw(100);
        System.out.println(ac1);
        System.out.println();

        checking ac2 = new checking(1,5000,5000);
        ac2.withdraw(10000);
        System.out.println(ac2);
        System.out.println();

        savings ac3 = new savings(2,1500);
        ac3.withdraw(1000);
        System.out.println(ac3);;
    }
}